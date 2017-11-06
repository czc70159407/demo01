package com.offcn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.offcn.dao.ModileMapper;
import com.offcn.po.Result;
@Service
public class ModileServiceImp implements ModileService{
		@Resource
		ModileMapper modileMapper;
	
	public int getCou() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getArea(String tel) {
		// TODO Auto-generated method stub
		String area=null;
		String te = tel.substring(0, 7);
		Result result = modileMapper.getResult(te);
		if(result==null){
			area = "´ËºÅÂëÎ´ÔÚºÅÂë¿âÖÐ";
		}else{
			String mobilearea = result.getMobilearea();
			String mobiletype = result.getMobiletype();
			area=mobilearea+"  "+mobiletype;
		}
		return area;
	}
	
	
}
