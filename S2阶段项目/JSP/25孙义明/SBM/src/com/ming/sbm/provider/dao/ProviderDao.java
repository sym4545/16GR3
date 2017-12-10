package com.ming.sbm.provider.dao;

import java.util.List;

import com.ming.sbm.provider.bean.Provider;

public interface ProviderDao {
	public List<Provider> getAllProvider();
	public Provider selectProviderDeil(int id);
}
