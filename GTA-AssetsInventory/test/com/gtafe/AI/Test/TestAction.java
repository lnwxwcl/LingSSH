package com.gtafe.AI.Test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype") // 多例模式
public class TestAction extends ActionSupport{
	public String login() throws Exception{
		return "success";
	}
	public String Tbasic() throws Exception{
		return "Tbasic";
	}
}
