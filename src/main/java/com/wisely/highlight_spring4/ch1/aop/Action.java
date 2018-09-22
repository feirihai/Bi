package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

//编写拦截规则的类
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
