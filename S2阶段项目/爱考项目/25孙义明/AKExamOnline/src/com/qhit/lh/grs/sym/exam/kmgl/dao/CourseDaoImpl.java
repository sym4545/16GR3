/**
 * 
 */
package com.qhit.lh.grs.sym.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.qhit.lh.grs.sym.exam.common.dao.BaseDao;
import com.qhit.lh.grs.sym.exam.kmgl.bean.Course;


public class CourseDaoImpl extends BaseDao implements CourseDao {

	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		StringBuffer hql = new StringBuffer("select course from Course course where 1 = 1");
		//鎷兼帴HQL
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			hql.append(" and course.stage = :stage");
		}
		//鑾峰彇鏌ヨ鍣�
		Query query = getSession().createQuery(hql.toString());
		//璁剧疆鍙傛暟
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			query.setString("major", (String) parameter.get("major"));
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("stage"));
		}
		//鎵ц鏌ヨ�?
		return query.list();
	}
}
