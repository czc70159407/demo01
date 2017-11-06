package com.offcn.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.service.ModileService;

@Controller
@RequestMapping("/he")
public class ModileController {
	@Resource
	ModileService modileService;
	
	@RequestMapping
	public void stt(){
		
		
	}
}
