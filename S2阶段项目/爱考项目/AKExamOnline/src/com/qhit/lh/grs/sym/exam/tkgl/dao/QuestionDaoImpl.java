/**
 * 
 */
package com.qhit.lh.grs.sym.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.qhit.lh.grs.sym.exam.common.bean.PageBean;
import com.qhit.lh.grs.sym.exam.common.dao.BaseDao;
import com.qhit.lh.grs.sym.exam.kmgl.bean.Course;
import com.qhit.lh.grs.sym.exam.tkgl.bean.WrittenQuestion;

public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#getCourseInfo(java.util.Map)
	 * 棰樺簱鍒楄�??
	 */
	public List<Course> getCourseInfo(Map parameter) {
		System.out.println("杩涘叆Dao");
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where 1 = 1");
		//鎷兼帴HQL
		if(parameter.get("major") != null && !"".equals((String)parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") != null && !"".equals((String)parameter.get("stage"))){
			hql.append(" and course.stage = :stage");
		}
		//鑾峰彇鏌ヨ鍣�
		Query query = getSession().createQuery(hql.toString());
		//璁剧疆鍙傛暟
		if(parameter.get("major") != null && !"".equals((String)parameter.get("major"))){
			query.setString("major", (String) parameter.get("major"));
		}
		if(parameter.get("stage") != null && !"".equals((String)parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("stage"));
		}
		return query.list();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#getWrittenList()
	 * 璇曢鍒嗛�?�鏁版嵁
	 */
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex) {
		//hql璇�?
		StringBuffer hql = new StringBuffer();
		hql.append("select w from WrittenQuestion w where w.csId = :csId ");
		//鑾峰彇鏌ヨ鍣�
		Query query = getSession().createQuery(hql.toString());
		//璁剧疆鍒嗛�?�鏌ヨ鏁版�?
		query.setInteger("csId", course.getCsId());
		//鎬昏褰曟暟
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setCurrentIndex(pageIndex);
		//褰撳墠椤垫暟鎹�
		List<WrittenQuestion> items = query.setFirstResult((pageBean.getCurrentIndex()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();
		//璁剧疆pageBase鏁版嵁闆嗗悎
		pageBean.setItems(items);
		
		return pageBean;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#addWrittenQuestion(com.qhit.lh.grs.wjk.exam.tkgl.bean.WrittenQuestion)
	 * 娣诲姞璇曢
	 */
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		//寮�鍚簨鍔�?
		Transaction ts = getSession().beginTransaction();
		//鎵ц娣诲姞锛岃繑鍥炴柊绾綍鐨勪富閿�?
		long id = (Integer) getSession().save(writtenQuestion);
		//鎻愪氦浜嬪姟
		ts.commit();
	}
	
	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#getWrittenQuestionById(com.qhit.lh.grs.wjk.exam.tkgl.bean.WrittenQuestion)
	 * 鏍规嵁ID鏌ヨ璇曢
	 */
	@Override
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion) {
		return (WrittenQuestion) getSession().get(WrittenQuestion.class,writtenQuestion.getQid());
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#updateWrittenQuestion(com.qhit.lh.grs.wjk.exam.tkgl.bean.WrittenQuestion)
	 * 鏇存柊鏁版嵁
	 */
	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		//娓呴櫎session涓紦�?�樺璞�?
		getSession().clear();
		//寮�鍚簨鍔�?
		Transaction ts = getSession().beginTransaction();
		//鎵ц鏇存柊鎿嶄綔
		getSession().update(writtenQuestion);
		//鎻愪氦浜嬪姟
		ts.commit();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#inprotWrittenQuestion(java.util.List)
	 * 鎵归噺�?�煎叆璇曢
	 */
	@Override
	public void inprotWrittenQuestion(List<WrittenQuestion> listwritten) {
		//寮�鍚簨鍔�?
		Transaction ts = getSession().beginTransaction();
		//寰幆娣诲姞
		for (WrittenQuestion writtenQuestion : listwritten) {
			//鎵ц娣诲姞锛岃繑鍥炴柊绾綍鐨勪富閿�?
			getSession().save(writtenQuestion);
		}
		//鎻愪氦浜嬪姟
		ts.commit();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#getQuestionsMax(int, java.lang.String, java.lang.String)
	 * 鑾峰彇璇曢鏁伴�?
	 */
	@Override
	public int getQuestionsMax(int csId, String type, String degree) {
		Criteria criteria = getSession().createCriteria(WrittenQuestion.class)
				.add(Restrictions.eq("csId", csId))
				.add(Restrictions.eq("qtype", type))
				.add(Restrictions.eq("degree", degree));
		
		ProjectionList projectionList = Projections.projectionList()
				.add(Projections.count("qid"));
		
		criteria.setProjection(projectionList);
		long num = (long) criteria.list().get(0);
		return (int) num;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.rzy.exam.tkgl.dao.QuestionDao#getQuestionsByType(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<WrittenQuestion> getQuestionsByType(int csId, String qtype, String degree) {
		Criteria critera = getSession().createCriteria(WrittenQuestion.class)
				.add(Restrictions.eq("csId", csId))
				.add(Restrictions.eq("qtype", qtype))
				.add(Restrictions.eq("degree", degree));
		
		return critera.list();
	}
}
