package com.qhit.lh.gr3.ming.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * @param 添加
	 */
	public void add(Object obj);
	/**
	 * @param 删除
	 */
	public void del(Object obj);
	/**
	 * @param 修改
	 */
	public void update(Object obj);
	/**
	 * @param 查询
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
