package com.gtafe.AI.doMain;

import java.sql.Date;

public class Task {
	private String Taskid;
	private String TaskName;
	private Date TaskStartDate;
	private Date TaskEndDate;
	private String Type;
	private String Remarks;
	private String TaskCreateDate;
	private String taskTableName;
	
	public String getTaskTableName() {
		return taskTableName;
	}
	public void setTaskTableName(String taskTableName) {
		this.taskTableName = taskTableName;
	}
	public String getTaskCreateDate() {
		return TaskCreateDate;
	}
	public void setTaskCreateDate(String taskCreateDate) {
		TaskCreateDate = taskCreateDate;
	}
	public String getTaskid() {
		return Taskid;
	}
	public void setTaskid(String taskid) {
		Taskid = taskid;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public Date getTaskStartDate() {
		return TaskStartDate;
	}
	public void setTaskStartDate(Date taskStartDate) {
		TaskStartDate = taskStartDate;
	}
	public Date getTaskEndDate() {
		return TaskEndDate;
	}
	public void setTaskEndDate(Date taskEndDate) {
		TaskEndDate = taskEndDate;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
}
