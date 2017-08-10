package com.gtafe.AI.View;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gtafe.AI.Service.TaskService;
import com.gtafe.AI.Service.UserService;
import com.gtafe.AI.doMain.Task;
import com.gtafe.AI.doMain.TaskAssets;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller // 交与Spring容器管理
@Scope("prototype") // 多例模式
public class UrlAction extends ActionSupport{
	private String getName=null;
	@Resource
	private TaskService taskService;
	@Resource
	private UserService userService;
	public String index() {
		getName=(String) ActionContext.getContext().getSession().get("username");
		if (getName!=null) {
			return "index";
		}else {
			return "tologin";
		}
		
	}

	public String chart_line() {
		getName=(String) ActionContext.getContext().getSession().get("username");
		String tableName=userService.getTableName();
	
		if (getName!=null) {
			List<Object> aiTaskList=userService.getAllAsset(tableName);
			double pro=userService.getProgress(tableName);
			if (pro!=0) {
				//1、查询盘点进度
				double temp=aiTaskList.size();
				ActionContext.getContext().put("proed", Math.ceil(pro));
				ActionContext.getContext().put("pro",Math.ceil(pro/temp*100));
				ActionContext.getContext().put("aiTaskList", aiTaskList);
				//2、查出所有待盘点的资产条目
				return "chart_line";
			}else {
				ActionContext.getContext().put("proed",0);
				ActionContext.getContext().put("pro",0);
				ActionContext.getContext().put("aiTaskList", aiTaskList);
				//2、查出所有待盘点的资产条目
				return "chart_line";
			}
			
		}else {
			return "tologin";
		}
		
	}

	public String form_basic() {
		getName=(String) ActionContext.getContext().getSession().get("username");
		if (getName!=null) {
			return "form_basic";
		}else {
			return "tologin";
		}
		
	}

	public String table_complete() {
		getName=(String) ActionContext.getContext().getSession().get("username");
		List<Task> list=taskService.getAll();
		ActionContext.getContext().put("tasklist",list);
		if (getName!=null) {
			return "table_complete";
		}else {
			return "tologin";
		}
	}

}
