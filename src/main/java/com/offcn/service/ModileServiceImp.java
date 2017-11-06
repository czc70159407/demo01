package com.offcn.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.dao.ModileMapper;
import com.offcn.po.Result;
@Service
@WebService
public class ModileServiceImp implements ModileService{
		@Resource
		ModileMapper modileMapper;
	
	public int getCou() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@WebMethod
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
