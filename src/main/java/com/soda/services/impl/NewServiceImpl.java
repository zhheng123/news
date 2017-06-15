package com.soda.services.impl;

import org.springframework.stereotype.Service;

import com.soda.services.NewService;
@Service
public class NewServiceImpl extends CommonService implements NewService {

	
	public long deleteLog(String id) throws Exception {
		StringBuffer  buffer = new StringBuffer();
		buffer.append("delete from log where id=").append(id);
		return   executeAction(buffer.toString());
	}
	
	
}
