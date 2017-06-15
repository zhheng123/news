package com.soda.exception;

import com.soda.enums.ConstantEnum;
/**
 * 
  * @ClassName: CommenException
  * @Description: �Զ����쳣��������ö������
  *  ����:if (age < 10) {
            //����"�㻹����Сѧ��" code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
         }
  * @author zheng
  * @date 2017��6��15�� ����11:07:48
 */
public class CommenException extends RuntimeException {
	private Integer code;

	public CommenException(ConstantEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
