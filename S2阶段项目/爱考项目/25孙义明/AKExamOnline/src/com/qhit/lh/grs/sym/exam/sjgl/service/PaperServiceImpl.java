/**
 * 
 */
package com.qhit.lh.grs.sym.exam.sjgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.grs.sym.exam.common.bean.PageBean;
import com.qhit.lh.grs.sym.exam.sjgl.bean.Paper;
import com.qhit.lh.grs.sym.exam.sjgl.bean.PaperClass;
import com.qhit.lh.grs.sym.exam.sjgl.dao.PaperDao;
import com.qhit.lh.grs.sym.exam.sjgl.dao.PaperDaoImpl;


public class PaperServiceImpl implements PaperService {
	PaperDao paperDao = new PaperDaoImpl();
	
	@Override
	public void startExam(List<PaperClass> paperClasses,Paper paper) {
		paperDao.startExam(paperClasses);
		paperDao.updateExam(paper, "鑰冭瘯涓�?");
	}

	@Override
	public void endExam(Paper paper) {
		paperDao.updateExam(paper, "鑰冭瘯缁撴潫");
	}

	@Override
	public void createPaperRandom(Paper paper) {
		paperDao.createPaperRandom(paper);
	}

	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex) {
		return paperDao.getPaperList(pageBean, parameter, pageIndex);
	}

}
