package com.soda.exception;

import com.soda.enums.ConstantEnum;
/**
 * 
  * @ClassName: CommenException
  * @Description: 自定义异常，传过来枚举类型
  *  类似:if (age < 10) {
            //返回"你还在上小学吧" code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
         }
  * @author zheng
  * @date 2017年6月15日 上午11:07:48
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
