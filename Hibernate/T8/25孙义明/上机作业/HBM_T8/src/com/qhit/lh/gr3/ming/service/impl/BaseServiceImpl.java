package com.qhit.lh.gr3.ming.service.impl;

import java.util.List;

import com.qhit.lh.gr3.ming.bean.Emp;
import com.qhit.lh.gr3.ming.dao.BaseDao;
import com.qhit.lh.gr3.ming.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.ming.service.BaseService;

/**
 * @author admin
 * 2017年12月11日
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void del(Object obj) {
		// TODO Auto-generated method stub
		baseDao.del(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}


}
