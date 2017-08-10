package com.gtafe.AI.View;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.gtafe.AI.Utils.BaseAction;
import com.gtafe.AI.doMain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller // 交与Spring容器管理
@Scope("prototype") // 多例模式
public class UserAction extends BaseAction<User> {
	private String anewPSWD;
	private String newPSWD;
	public String getNewPSWD() {
		return newPSWD;
	}
	public void setNewPSWD(String newPSWD) {
		this.newPSWD = newPSWD;
	}
	public String getAnewPSWD() {
		return anewPSWD;
	}
	public void setAnewPSWD(String anewPSWD) {
		this.anewPSWD = anewPSWD;
	}
	public String login() { 
	/*	String IP=ServletActionContext.getRequest().getRemoteAddr();
		System.out.println("IP:"+IP+"****************");*///获取访问端ip地址代码
		User user = UserService.getByNameAndPassword(model.getUsername(), model.getPassword());
		if (user != null) {
			ActionContext.getContext().getSession().put("username", user.getUsername());
			ActionContext.getContext().getSession().put("userdesc", user.getUserdesc());
			ActionContext.getContext().getSession().put("isadmin", user.getIsAdmin());
			return "success";
		} else {
			addFieldError("msg", "用户名或密码错误！");
			return "tologin";
		}
	}
	public String loginoff() { 
		ActionContext.getContext().getSession().remove("username");
		ActionContext.getContext().getSession().remove("isadmin");
		ActionContext.getContext().getSession().remove("userdesc");
		return "tologin";
	}
	public String changePSWD() {
		User user = UserService.getByNameAndPassword(model.getUsername(), model.getPassword());
		if (user != null) {
			if (anewPSWD.equals(newPSWD)) {
				user.setPassword(anewPSWD);
				UserService.update(user);
				return "ok";
			}else {
				addFieldError("UserMsg", "新密码输入不一致");
				return "no";
			}
			
		}else {
			addFieldError("UserMsg", "原密码输入错误");
			return "no";
		}
	}
}
