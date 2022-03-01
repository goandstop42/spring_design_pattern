package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

// 서블릿컴포넌트(필터, 서블릿, 리스너)를 스캔해서 빈으로 등록
// 서블릿컴포넌트 클래스에 어노테이션 추가 필요
// - 필터: @WebFilter
// - 서블릿: @WebServlet
// - 리스너: @WebListene
// - springboot 내장 was 인 경우만 적용
@ServletComponentScan
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
