package com.enter.door;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.util.EventListener;
import java.util.EventObject;

/**
 * @description: 入口
 * @author: jingw F
 * @date: 2020-01-14 15:24
 *
 * 建议将main类放到根包中
 **/
@SpringBootConfiguration
@ComponentScan
public class EnterDoorApplication {

	public static void main(String[] args) {

		/*
		 * 除了像Spring框架中的事件ContextRefreshedEvent等，也会发送我们应用需要的其他事件。有些事件实际上是在ApplicationContext创建
		 * 前触发的，所以我们不能再那些事件处理类中通过@Bean注册监听器，只能通过SpringApplication.addListeners(...)或者
		 * SpringApplicationBuilder.listeners(...)方法进行监听器的注册。
		 *
		 * 如果想让监听器自动注册，而不关心应用的创建的方式，可以在工程中添加一个META_INF/spring.factories文件，使用org.springframework.
		 * context.ApplicationListener作为key指向我们自定义的监听器，如下：
		 * org.springframework.context.ApplicationListener=com.example.project.MyListener
		 */

		SpringApplication.run(EnterDoorApplication.class, args);

	}
}