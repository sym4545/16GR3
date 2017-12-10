package com.ming.sbm.account.dao;

import java.util.List;

import com.ming.sbm.conmon.bean.PageBean;
import com.ming.sbm.goods.bean.Goods;

public interface AccountDao {
	public int addAccount(Goods goods, int businessNum, int providerId, int isPayed);
	public PageBean getPageBean(PageBean pageBean);
	public PageBean getPageBeanByParam(List<String> wheres,List<String> values);
	public int deleteAccountById(int accountId);
	public int upDateAccountById(int accountId, int providerId, int isPayed);
}
