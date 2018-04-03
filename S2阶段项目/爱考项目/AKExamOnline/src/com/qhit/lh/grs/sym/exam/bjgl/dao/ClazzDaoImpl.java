/**
 * 
 */
package com.qhit.lh.grs.sym.exam.bjgl.dao;

import java.util.List;

import com.qhit.lh.grs.sym.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.grs.sym.exam.common.dao.BaseDao;

public class ClazzDaoImpl extends BaseDao implements ClazzDao {

	@Override
	public List<ClassInfo> getClazzList() {
		return getSession().createQuery("from ClassInfo").list();
	}

}
