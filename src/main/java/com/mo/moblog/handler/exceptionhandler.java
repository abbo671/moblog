package com.mo.moblog.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName exceptionhandler
 * @Description TODO
 * @Author mo
 * @Date 2021/3/14 18:56
 **/
@ControllerAdvice
public class exceptionhandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
    * @Description:
    * @Param: [httpRequest, e]
    * @return: org.springframework.web.servlet.ModelAndView
    * @Author: mo
    * @Date: 2021/3/14
    * @Time: 19:14
    */
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionhandle(HttpServletRequest request, Exception e) throws Exception {
        logger.error("URL : {},Exception : {}", request.getRequestURL(),e);
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null){
            throw e;
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("URl",request.getRequestURL());
        mv.addObject("Exception", e);
        mv.setViewName("error/error");
        return mv;
   }
}
