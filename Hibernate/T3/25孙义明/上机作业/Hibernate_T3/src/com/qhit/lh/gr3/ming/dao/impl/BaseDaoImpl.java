package com.qhit.lh.gr3.ming.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.ming.dao.BaseDao;
import com.qhit.lh.gr3.ming.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override 
	public void add(Object obj) {
		// 添加操作
		//1,获取Session对象
		Session session = HibernateSessionFactory.getSession();
		//2,开启事务
		Transaction ts = session.beginTransaction();
		//3，执行
		session.save(obj);
		//4,提交事务
		ts.commit();
		//5，释放资源
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void del(Object obj) {
		// TODO Auto-generated method stub
		//1,获取Session对象
				Session session = HibernateSessionFactory.getSession();
				//2,开启事务
				Transaction ts = session.beginTransaction();
				//3，执行
				session.save(obj);
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();

	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//1,获取Session对象
				Session session = HibernateSessionFactory.getSession();
				//2,开启事务
				Transaction ts = session.beginTransaction();
				//3，执行
				session.save(obj);
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> getAll(String fromObject) {
			// 查询
			 //1,获取Session对象
				Session session = HibernateSessionFactory.getSession();
				//2,开启事务
				Transaction ts = session.beginTransaction();
				//3，获取查询器对象
				Query query = session.createQuery(fromObject);//"from User"
				List<Object> list = query.list();
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();
				return list;
	}

	@Override
	public Object getObjectById(Object obj, int id) {
			//1,获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2，开启事务
				Transaction ts = session.beginTransaction();
				//3，获取查询器对象
				obj = session.get(obj.getClass(), id);
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();
				return obj;
	}
}
