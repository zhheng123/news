package com.soda.dao;

import java.util.List;
import java.util.Map;

import com.soda.bean.Params;

public interface  CommonMapper {
	/** 
     * ִ����ɾ��sql��� 
     *  
     * @author viogor 
     * @param sql sql��� 
     * @return 
     */  
    public long executeAction(String sql);  
   
    /** 
     * ����sql����ѯ�������� 
     *  
     * @author viogor 
     * @param sql sql��� 
     * @return 
     */  
    public Map<String, Object> findOneData(String sql);  
      
    /** 
     * ����sql����ѯ������� 
     *  
     * @author viogor 
     * @param sql sql��� 
     * @return 
     */  
    public List<Map<String, Object>> findManyData(String sql);  
      
    /** 
     * ���ʵ������ 
     *  
     * @author viogor 
     * @param params ��Ӳ����� 
     * @return 
     */  
    public int addEntity(Params params);  
      
    /** 
     * ����sql����ѯ���� 
     *  
     * @author viogor 
     * @param sql sql��� 
     * @return 
     */  
    public long findCount(String sql);  
      
    /** 
     * ������� 
     *  
     * @author viogor 
     * @param params ��Ӳ��� 
     * @return 
     */  
    public int batchAdd(Params params);  
      
    /** 
     * ����ɾ�� 
     *  
     * @author viogor 
     * @param params ������ 
     * @return 
     */  
    public int batchDelete(Params params);  
      
    /** 
     * ����sql����ѯ����ֵ 
     *  
     * @author viogor 
     * @param sql sql��� 
     * @return 
     */  
    public Object findOneValue(String sql);

	

}
