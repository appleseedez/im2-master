/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.front;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.weheros.account.domain.Account;
import com.weheros.platform.test.AnnotationJUnitTest;
import com.weheros.platform.utils.ToJson;


/**
 * @ClassName: AccountControllerTest
 * @author Administrator
 * @date 2014年4月26日 下午2:06:32
 */
public class AccountControllerTest extends AnnotationJUnitTest {
	  @Autowired
	  private WebApplicationContext wac;

	  private MockMvc mockMvc;

	  @Before
	  public void setup() {
		 
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	   
	  }
	
	  @Test
	  public void testloginForMobile() throws Exception {
		  
		  LoginRequest request=new LoginRequest();
		  Account account=new Account();
		  account.setAccount("10001");
		  account.setPassword("123456");
		  request.setBody(account);
		  
		  Head head=new Head();
		  head.setSessionToken("");		  
		  head.setSignalType(1);//login request
		  head.setStatus(0);
		  request.setHead(head);
		  
	    this.mockMvc.perform(post("/loginAPP.json")
	    		 .content(ToJson.toJson(request))
				 .contentType(APPLICATION_JSON_UTF8)				  
		    	  .accept(MediaType.APPLICATION_JSON))
	    		.andDo(print())
	        .andExpect(status().isOk()); //302 Found is a common way of performing a redirection.
	    //.andExpect(MockMvcResultMatchers.jsonPath("message.code").value("200"));     
	      
	        		
       }
}
