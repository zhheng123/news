package com.soda.bean;

import java.util.List;
import java.util.Map;

public class Params {
	 /**��ѯ����*/  
    private String[] columns;  
      
    /**��ѯ��ʵ��*/  
    private String tables;  
      
    /**��ѯ������*/  
    private String whereSql;  
      
    /**��ѯ����ƴ��*/  
    private List<ParamCondition> paramList;  
      
    /**��ʼλ��*/  
    private Integer start;  
      
    /**����λ��*/  
    private Integer end;  
      
    /**�����ֶ�*/  
    private String sortColumn;  
      
    /**�������*/  
    private String sort;  
      
    /**��Ӳ���*/  
    private Map<String, Object> insertMap;  
      
    /**������Ӳ���*/  
    private List<Map<String, Object>> bacthInsertMap;  
      
    /**���ܷ��ص�����ID*/  
    private Long id;  
      
    /**ɾ���ֶμ���*/  
    private List<?> deleteList;  
      
    /** ɾ�����ֶ��� */  
    private String deleteCoulumnName;  
  
  
    public Long getId() {  
        return id;  
    }  
  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
  
  
    public String[] getColumns() {  
        return columns;  
    }  
  
  
    public void setColumns(String[] columns) {  
        this.columns = columns;  
    }  
  
  
    public String getTables() {  
        return tables;  
    }  
  
  
    public void setTables(String tables) {  
        this.tables = tables;  
    }  
  
  
    public String getWhereSql() {  
        return whereSql;  
    }  
  
  
    public void setWhereSql(String whereSql) {  
        this.whereSql = whereSql;  
    }  
  
  
    public List<ParamCondition> getParamList() {  
        return paramList;  
    }  
  
  
    public void setParamList(List<ParamCondition> paramList) {  
        this.paramList = paramList;  
    }  
  
  
    public Integer getStart() {  
        return start;  
    }  
  
  
    public void setStart(Integer start) {  
        this.start = start;  
    }  
  
  
    public Integer getEnd() {  
        return end;  
    }  
  
  
    public void setEnd(Integer end) {  
        this.end = end;  
    }  
  
  
    public String getSortColumn() {  
        return sortColumn;  
    }  
  
  
    public void setSortColumn(String sortColumn) {  
        this.sortColumn = sortColumn;  
    }  
  
  
    public String getSort() {  
        return sort;  
    }  
  
  
    public void setSort(String sort) {  
        this.sort = sort;  
    }  
  
  
    public Map<String, Object> getInsertMap() {  
        return insertMap;  
    }  
  
  
    public void setInsertMap(Map<String, Object> insertMap) {  
        this.insertMap = insertMap;  
    }  
  
  
    public List<Map<String, Object>> getBacthInsertMap() {  
        return bacthInsertMap;  
    }  
  
  
    public void setBacthInsertMap(List<Map<String, Object>> bacthInsertMap) {  
        this.bacthInsertMap = bacthInsertMap;  
    }  
  
  
    public List<?> getDeleteList() {  
        return deleteList;  
    }  
  
  
    public void setDeleteList(List<?> deleteList) {  
        this.deleteList = deleteList;  
    }  
  
  
    public String getDeleteCoulumnName() {  
        return deleteCoulumnName;  
    }  
  
  
    public void setDeleteCoulumnName(String deleteCoulumnName) {  
        this.deleteCoulumnName = deleteCoulumnName;  
    }  
}
