   package com.soda.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect  
@Component
public class SystemLogAspect {
	 //ע��Service���ڰ���־�������ݿ�  
     
    //�����쳣��־��¼����  
    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);  

    //Controller���е�  
    @Pointcut("execution (* com.soda.Controller..*.*(..))")    
    public void controllerAspect() {  
    }  
                                      
    /** 	
     * ǰ��֪ͨ ��������Controller���¼�û��Ĳ��� 
     * 
     * @param joinPoint �е� 
     */  
    @Before("controllerAspect()")  
    public void doBefore(JoinPoint joinPoint) {  
    	 System.out.println("==========ִ��controllerǰ��֪ͨ===============");
    	 if(logger.isInfoEnabled()){
    	     logger.info("before " + joinPoint);
         }
    }  

  //����controller����֪ͨ,ʹ���ڷ���aspect()��ע��������
/*    @Around("controllerAspect()")
    public void around(JoinPoint joinPoint){
        System.out.println("==========��ʼִ��controller����֪ͨ===============");
        long start = System.currentTimeMillis();
        try {
            long end = System.currentTimeMillis();
            if(logger.isInfoEnabled()){
                logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
            }
            System.out.println("==========����ִ��controller����֪ͨ===============");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();
            if(logger.isInfoEnabled()){
                logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
            }
        }
    }*/
  
  /** 
   * ����֪ͨ ��������Controller���¼�û��Ĳ��� 
   * 
   * @param joinPoint �е� 
   */  
  @After("controllerAspect()")  
  public  void after(JoinPoint joinPoint) {  

     /* HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();  
      HttpSession session = request.getSession();  */
      //��ȡsession�е��û�  
     // User user = (User) session.getAttribute("user");  
      //�����IP  
      //String ip = request.getRemoteAddr();
//      user.setName("����");
      String ip = "127.0.0.1";
       try {  
          System.out.println("����֪ͨ================");
          String targetName = joinPoint.getTarget().getClass().getName();  
          String methodName = joinPoint.getSignature().getName();  
          Object[] arguments = joinPoint.getArgs();  
          Class targetClass = Class.forName(targetName);  
          Method[] methods = targetClass.getMethods();
          String operationType = "";
          String operationName = "";
           for (Method method : methods) {  
               if (method.getName().equals(methodName)) {  
                  Class[] clazzs = method.getParameterTypes();  
                   if (clazzs.length == arguments.length) {  
                       operationType = method.getAnnotation(SystemControllerLog.class).description();
                       operationName = method.getAnnotation(SystemControllerLog.class).description();
                       break;  
                  }  
              }  
          }
          //*========����̨���=========*//  
          System.out.println("=====controller����֪ͨ��ʼ=====");  
          System.out.println("���󷽷�:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")+"."+operationType);  
          System.out.println("��������:" + operationName);  
         /* System.out.println("������:" + user.getName());  
          System.out.println("����IP:" + ip);  
          Log log=new Log();
          log.setOpertype(operationName);
          logService.add(log);*/
//          //*========���ݿ���־=========*//  
//          SystemLog log = new SystemLog();  
//          log.setId(UUID.randomUUID().toString());
//          log.setDescription(operationName);  
//          log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")+"."+operationType);  
//          log.setLogType((long)0);  
//          log.setRequestIp(ip);  
//          log.setExceptioncode( null);  
//          log.setExceptionDetail( null);  
//          log.setParams( null);  
//          log.setCreateBy(user.getName());  
//          log.setCreateDate(new Date());  
//          //�������ݿ�  
//          systemLogService.insert(log);  
          System.out.println("=====controller����֪ͨ����=====");  
      }  catch (Exception e) {  
          //��¼�����쳣��־  
          logger.error("==����֪ͨ�쳣==");  
          logger.error("�쳣��Ϣ:{}", e.getMessage());  
      }  
  } 
  
  //���ú��÷���֪ͨ,ʹ���ڷ���aspect()��ע��������
    @AfterReturning("controllerAspect()")
    public void afterReturn(JoinPoint joinPoint){
        System.out.println("=====ִ��controller���÷���֪ͨ=====");  
            if(logger.isInfoEnabled()){
                logger.info("afterReturn " + joinPoint);
            }
    }
  
  /** 
   * �쳣֪ͨ �������ؼ�¼�쳣��־ 
   * 
   * @param joinPoint 
   * @param e 
   */  
   @AfterThrowing(pointcut="controllerAspect()", throwing="e")  
   public  void doAfterThrowing(JoinPoint joinPoint, Throwable e) {  
      /*HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();  
      HttpSession session = request.getSession();  
      //��ȡsession�е��û�  
      User user = (User) session.getAttribute(WebConstants.CURRENT_USER);  
      //��ȡ����ip  
      String ip = request.getRemoteAddr(); */ 
      //��ȡ�û����󷽷��Ĳ��������л�ΪJSON��ʽ�ַ���  
      System.out.println("�쳣=============================");
//      User user = new User();
//      user.setName("����");
      String ip = "127.0.0.1";
       try {  
          
          String targetName = joinPoint.getTarget().getClass().getName();  
          String methodName = joinPoint.getSignature().getName();  
          Object[] arguments = joinPoint.getArgs();  
          Class targetClass = Class.forName(targetName);  
          Method[] methods = targetClass.getMethods();
          String operationType = "";
          String operationName = "";
           for (Method method : methods) {  
               if (method.getName().equals(methodName)) {  
                  Class[] clazzs = method.getParameterTypes();  
                   if (clazzs.length == arguments.length) {  
                       operationType = method.getAnnotation(SystemControllerLog.class).description();
                       operationName = method.getAnnotation(SystemControllerLog.class).description();
                       break;  
                  }  
              }  
          }
          //*========����̨���=========*//  
          System.out.println("=====controller�쳣��ʼ=====");  
          System.out.println("���󷽷�:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")+"."+operationType);  
          System.out.println("��������:" + operationName);  
//          System.out.println("������:" + user.getName());  
          System.out.println("����IP:" + ip);  
      }  catch (Exception ex) {  
          //��¼�����쳣��־  
          logger.error("==�쳣֪ͨ�쳣==");  
          logger.error("�쳣��Ϣ:{}", ex.getMessage());  
      }  
       /*==========��¼�����쳣��־==========*/  

  }  

    /** 
     * ��ȡע���жԷ�����������Ϣ ����Controller��ע�� 
     * 
     * @param joinPoint �е� 
     * @return �������� 
     * @throws Exception 
     */  
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {  
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
        Object[] arguments = joinPoint.getArgs();  
        Class targetClass = Class.forName(targetName);  
        Method[] methods = targetClass.getMethods();  
        String description = "";  
        for (Method method : methods) {  
            if (method.getName().equals(methodName)) {  
                Class[] clazzs = method.getParameterTypes();  
                if (clazzs.length == arguments.length) {  
                    description = method.getAnnotation(SystemControllerLog.class).description();  
                    break;  
                }  
            }  
        }  
        return description;  
    }  
}
