package com.offcn.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offcn.service.ModileService;

@Controller
@RequestMapping("/he")
public class ModileController {
	@Resource
	ModileService modileService;
	
	@RequestMapping
	public String stt(Model model,@RequestParam(value="tel")String tel){
		String msg = modileService.getArea(tel);
		model.addAttribute("msg", msg);
		return "view/result";
	}
}
