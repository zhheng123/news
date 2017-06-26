package com.soda.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soda.services.NewService;
@Service
public class NewServiceImpl extends CommonService implements NewService {

	@Transactional(rollbackFor={Exception.class})
	public long deleteLog(String id) throws Exception {
		StringBuffer  buffer = new StringBuffer();
		StringBuffer  buffer2 = new StringBuffer();
		buffer.append("delete from log where id=").append(id);
		return   executeAction(buffer.toString());
	}
	
	
}
