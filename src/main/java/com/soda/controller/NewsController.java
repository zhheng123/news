package com.soda.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soda.aop.SystemControllerLog;
import com.soda.services.NewService;
@Controller
@RequestMapping("/users/news")
public class NewsController {
	public static Logger log=Logger.getLogger(NewsController.class);
	@Resource
	NewService newService;
	
	@RequestMapping(value="/findAll/{id}",method=RequestMethod.GET)
	@SystemControllerLog(description = "ɾ���û�")  
	public String test(@PathVariable("id")String id){
		System.out.println(id);
		try {
			newService.deleteLog(id);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		System.out.println("���Գɹ�=========================");
		return "a";
	}
	@RequestMapping(value="/test")
	@SystemControllerLog(description = "����2����")  
	@ResponseBody
	public Map test2(String id){
		Map<String,Object>result=new HashMap<String,Object>();
		try {
			newService.deleteLog(id);
			result.put("1","�ź�");
			result.put("2","��ǿ");
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		return result;
	}
	
}
