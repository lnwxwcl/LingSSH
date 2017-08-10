package com.gtafe.AI.View;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.gtafe.AI.Utils.BaseAction;
import com.gtafe.AI.doMain.Task;
import com.opensymphony.xwork2.ActionContext;

@Controller // 交与Spring容器管理
@Scope("prototype") // 多例模式
public class TaskAction extends BaseAction<Task>{
	public String createTask(){
		model.setTaskCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		taskService.save(model);
		String newTable="ai_task_"+model.getTaskid();//查询出最新任务所创建的表
		model.setTaskTableName(newTable);
		taskService.update(model);
		taskService.createTaskTable(newTable);
		ActionContext.getContext().put("tasklist",taskService.getAll());
		return "table_complete";
	}
	
}
