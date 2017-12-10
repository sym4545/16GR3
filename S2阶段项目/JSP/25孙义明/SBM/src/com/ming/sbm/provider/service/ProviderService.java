package com.ming.sbm.provider.service;

import java.util.List;

import com.ming.sbm.provider.bean.Provider;

public interface ProviderService {
	public List<Provider> getAllProvider();
	public Provider selectProviderDeil(int id);
}
