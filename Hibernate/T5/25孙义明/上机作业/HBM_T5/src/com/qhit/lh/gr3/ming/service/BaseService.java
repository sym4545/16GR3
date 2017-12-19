package com.qhit.lh.gr3.ming.service;

import java.util.List;

/**
 * @author admin
 * 2017年12月11日
 */
public interface BaseService {
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void del(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);
	
	/**
	 * @param obj
	 * @param id
	 * @return
	 * 根据id去查
	 */
	public Object getObjectById(Class clazz, int id);
}
