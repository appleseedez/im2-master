/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */

package com.weheros.account.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weheros.account.application.IAccountManager;
import com.weheros.account.domain.Account;
import com.weheros.platform.front.AbstractController;
import com.weheros.platform.log.LogService;
import com.weheros.platform.utils.ToJson;

/**
 * @ClassName: AccountController
 * @author Yang
 * @date 2014年4月24日 下午5:52:11
 */
@Controller
public class AccountController extends AbstractController {
	@Autowired
	IAccountManager accountManager;
	
	@RequestMapping(value = "/loginAPP", method = { RequestMethod.POST })
	@ResponseBody
	public LoginResponse loginForMobile(HttpServletRequest request,
			HttpServletResponse response, @RequestBody LoginRequest login,
			ModelMap model) {
		LogService.info(AccountController.class,"----------------recieve request of login -------------------"+ToJson.toJson(login));
         //parse the request json
		 Account account=(Account) ToJson.toObject(ToJson.toJson(login.getBody()),Account.class);
		//query the account in the db
		 LoginResponse res= accountManager.verificate(account.getAccount(),account.getPassword());
		 
		return res;
	}
}
