/**
 * 
 */
package com.qhit.lh.grs.sym.exam.bjgl.service;

import java.util.List;

import com.qhit.lh.grs.sym.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.grs.sym.exam.bjgl.dao.ClazzDao;
import com.qhit.lh.grs.sym.exam.bjgl.dao.ClazzDaoImpl;

public class ClazzServiceImpl implements ClazzService {
	private ClazzDao clazzDao = new ClazzDaoImpl();
	
	@Override
	public List<ClassInfo> getClazzList() {
		return clazzDao.getClazzList();
	}

}
