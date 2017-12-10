package com.ming.sbm.provider.service.impl;

import java.util.List;

import com.ming.sbm.provider.bean.Provider;
import com.ming.sbm.provider.dao.impl.ProviderDaoimpl;
import com.ming.sbm.provider.service.ProviderService;

public class ProviderServiceimpl implements ProviderService {

	@Override
	public List<Provider> getAllProvider() {
		// TODO Auto-generated method stub
		return new ProviderDaoimpl().getAllProvider();
	}

	@Override
	public Provider selectProviderDeil(int id) {
		// TODO Auto-generated method stub
		return new ProviderDaoimpl().selectProviderDeil(id);
	}

}
