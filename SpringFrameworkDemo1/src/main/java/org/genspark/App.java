package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student obj = (Student) context.getBean("nameId");
        Student objContacts = (Student) context.getBean("student");
        //Address obj = (Address) context.getBean(Address.class);

        obj.properties();
        objContacts.contact();
    }
}
