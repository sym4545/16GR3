package com.ming.sbm.goods.service.impl;

import com.ming.sbm.goods.bean.Goods;
import com.ming.sbm.goods.dao.impl.GoodsDaoimpl;
import com.ming.sbm.goods.service.GoodsService;

public class GoodsServiceimpl implements GoodsService {

	@Override
	public Goods getGoodsInfoByName(String goodsName) {
		// TODO Auto-generated method stub
		return new GoodsDaoimpl().getGoodsInfoByName(goodsName);
	}

	@Override
	public int updateStore(int num, int goodsId) {
		// TODO Auto-generated method stub
		return new GoodsDaoimpl().updateStore(num, goodsId);
	}

}
