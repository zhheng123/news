package com.soda.services.impl;

import org.springframework.stereotype.Service;

import com.soda.services.NewService;
@Service
public class NewServiceImpl extends CommonService implements NewService {

	
	public long deleteLog(Integer id) throws Exception {
		StringBuffer  buffer = new StringBuffer();
		buffer.append("delete from log where id='").append(id).append("'");
		return   executeAction(buffer.toString());
	}
	
	
}
