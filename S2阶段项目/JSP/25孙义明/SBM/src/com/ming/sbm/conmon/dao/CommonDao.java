package com.ming.sbm.conmon.dao;

import java.util.List;

public interface CommonDao {
	public int getCount(String tableName, List<String> wheres, List<String> values);
}
