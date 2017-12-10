package com.ming.sbm.goods.dao;

import com.ming.sbm.goods.bean.Goods;

public interface GoodsDao {
	
	public Goods getGoodsInfoByName(String goodsName);
	public int updateStore(int num, int goodsId);
}
