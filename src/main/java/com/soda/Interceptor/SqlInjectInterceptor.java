package com.soda.Interceptor;

import java.util.Enumeration;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SqlInjectInterceptor implements HandlerInterceptor{
	static String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"  
            + "(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		Enumeration<String> names = request.getParameterNames();
		boolean flag=true;
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String[] values = request.getParameterValues(name);
			for (String value : values) {
				if(sql_inj(value)){
					flag=false;
				}
			}
		}
		return flag;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e)
			throws Exception {
	}
	public static boolean sql_inj(String str)  
	{  
	String inj_str = "'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|-|+|drop|execute|substr|ascii,";    
	String inj_stra[] =inj_str.split("\\|");  
	for (int i=0 ; i < inj_stra.length ; i++ ){  
		if (str.contains(inj_stra[i])){  
			return true;  
		}  
	}  
	return false;  
	} 
}
