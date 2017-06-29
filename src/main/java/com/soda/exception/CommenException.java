package com.soda.exception;

import com.soda.enums.ConstantEnum;

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
