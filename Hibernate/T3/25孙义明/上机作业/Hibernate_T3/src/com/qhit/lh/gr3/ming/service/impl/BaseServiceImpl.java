package com.qhit.lh.gr3.ming.service.impl;

import java.util.List;

import com.qhit.lh.gr3.ming.dao.BaseDao;
import com.qhit.lh.gr3.ming.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.ming.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao dao =  new BaseDaoImpl();
	
	@Override
	public void add(Object obj) {
		
		dao.add(obj);
	}

	@Override
	public void del(Object obj) {
		dao.del(obj);
	}

	@Override
	public void update(Object obj) {

		dao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		return dao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		return dao.getObjectById(obj, id);
	}

}
