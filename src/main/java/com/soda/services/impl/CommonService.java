package com.soda.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soda.bean.Params;
import com.soda.dao.CommonMapper;
@Service
public class CommonService {

@Autowired
CommonMapper  commonMapper;
	/** 
     * 执行增删改sql语句 
     *  
     * @author  viogor
     * @param sql sql语句 
     * @return 
     */  
    public long executeAction(String sql) throws Exception{
    	return commonMapper.executeAction(sql);
    } 
   
    /** 
     * 根据sql语句查询单调数据 
     *  
     * @author viogor 
     * @param sql sql语句 
     * @return 
     */  
    public Map<String, Object> findOneData(String sql)  throws Exception{
    	return commonMapper.findOneData(sql);
    } 
      
    /** 
     * 根据sql语句查询多调数据 
     *  
     * @author viogor 
     * @param sql sql语句 
     * @return 
     */  
    public List<Map<String, Object>> findManyData(String sql)  throws Exception{
    	return commonMapper.findManyData(sql);
    }   
      
    /** 
     * 添加实体数据 
     *  
     * @author viogor 
     * @param params 添加参数类 
     * @return 
     */  
    public int addEntity(Params params)  throws Exception{
    	return commonMapper.addEntity(params);
    }   
      
    /** 
     * 根据sql语句查询条数 
     *  
     * @author viogor 
     * @param sql sql语句 
     * @return 
     */  
    public long findCount(String sql) throws Exception{
    	return commonMapper.findCount(sql);
    }  
      
    /** 
     * 批量添加 
     *  
     * @author viogor 
     * @param params 添加参数 
     * @return 
     */  
    public int batchAdd(Params params) throws Exception{
    	return commonMapper.batchAdd(params);
    } 
      
    /** 
     * 批量删除 
     *  
     * @author viogor 
     * @param params 参数类 
     * @return 
     */  
    public int batchDelete(Params params) throws Exception{
    	return commonMapper.batchAdd(params);
    }  
      
    /** 
     * 根据sql语句查询单个值 
     *  
     * @author viogor 
     * @param sql sql语句 
     * @return 
     */  
    public Object findOneValue(String sql) throws Exception{
    	return commonMapper.findOneValue(sql);
    } 
 
 
}
