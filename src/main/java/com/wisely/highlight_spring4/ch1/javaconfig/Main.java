package com.wisely.highlight_spring4.ch1.javaconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        FunctionService functionService = context.getBean(FunctionService.class);
        System.out.println(useFunctionService.SayHello("javaconfig"));
        System.out.println(functionService.sayHello("wwwwwww"));
        context.close();

    }
}
