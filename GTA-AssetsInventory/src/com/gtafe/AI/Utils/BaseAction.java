package com.gtafe.AI.Utils;

import java.lang.reflect.ParameterizedType;
import javax.annotation.Resource;

import com.gtafe.AI.Service.TaskService;
import com.gtafe.AI.Service.UserService;
import com.gtafe.AI.Service.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@SuppressWarnings("unchecked")
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	/* =============声明各实例 用来注入各service======== */
	@Resource
	public UserService UserService;
	@Resource
	public TaskService taskService;
	/* =============ModelDriven支持======== */
	protected T model;

	public BaseAction() {
		ParameterizedType pType = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class<T>) pType.getActualTypeArguments()[0];// 得到真实类型
		try {
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T getModel() {
		return (T) model;
	}
}