package com.soda.enums;
public enum ConstantEnum {
	 	UNKONW_ERROR(-1, "δ֪����"),
	    SUCCESS(0, "�ɹ�"),
	    PRIMARY_SCHOOL(100, "�Ҳ�����ܻ�����Сѧ"),
	    MIDDLE_SCHOOL(101, "��������ϳ���"),
	    ;


	    private Integer code;

	    private String msg;

	    ConstantEnum(Integer code, String msg) {
	        this.code = code;
	        this.msg = msg;
	    }

	    public Integer getCode() {
	        return code;
	    }

	    public String getMsg() {
	        return msg;
	    }
}
