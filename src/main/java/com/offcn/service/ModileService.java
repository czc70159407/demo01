package com.offcn.service;

import javax.jws.WebService;

@WebService
public interface ModileService {
	int getCou();
	String getArea(String tel);
}
