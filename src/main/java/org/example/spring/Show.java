package org.example.spring;

import org.example.spring.pojo.Juggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Show {
    public static void main(String[] args) {
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        Juggler duke =  (Juggler) ac.getBean("duke");
        duke.perform();
    }
}
