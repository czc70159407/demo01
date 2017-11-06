package com.offcn.dao;

import org.apache.ibatis.annotations.Param;

import com.offcn.po.Modile;
import com.offcn.po.Result;

public interface ModileMapper {
	
	void addMod(Modile modile);
	int getCou();
	Result getResult(String tel);
}
