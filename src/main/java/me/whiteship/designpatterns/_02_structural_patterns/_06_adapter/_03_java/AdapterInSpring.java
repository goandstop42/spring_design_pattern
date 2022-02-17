package me.whiteship.designpatterns._02_structural_patterns._06_adapter._03_java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        
        // 요청을 처리하고 응답을 보내는 객체를 handler라고 함
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
