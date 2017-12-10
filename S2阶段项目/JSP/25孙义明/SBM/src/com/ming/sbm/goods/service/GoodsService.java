package com.ming.sbm.goods.service;

import com.ming.sbm.goods.bean.Goods;

public interface GoodsService {
	public Goods getGoodsInfoByName(String goodsName);
	public int updateStore(int num, int goodsId);
}
