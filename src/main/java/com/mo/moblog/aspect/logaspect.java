package com.mo.moblog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @ClassName logaspect
 * @Description TODO
 * @Author mo
 * @Date 2021/3/14 21:03
 **/
@Aspect
@Component
public class logaspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.mo.moblog.controller.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void dobefore(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();
        String URL = httpServletRequest.getRequestURL().toString();
        String ip = httpServletRequest.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        Object args = joinPoint.getArgs();
        Requestlog requestlog = new Requestlog(URL,ip,classMethod, (Object[]) args);

        logger.info("Result : {}"+ requestlog);
    }

    @After("log()")
    public void doafter(){
        logger.info("----------doafter-------------");
    }

    @AfterReturning(returning = "result",pointcut = "log()")
    public void doreturn(Object result){
        logger.info("Result:{}"+result);
    }

    private class Requestlog{
        private String URL;
        private String ip;
        private String classMethod;
        private Object[] args;

        public Requestlog(String URL, String ip, String classMethod, Object[] args) {
            this.URL = URL;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "Requestlog{" +
                    "URL='" + URL + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }
}
