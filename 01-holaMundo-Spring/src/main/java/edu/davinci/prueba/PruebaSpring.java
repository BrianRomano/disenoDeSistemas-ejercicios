package edu.davinci.prueba;

import edu.davinci.beans.BeanSpring;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaSpring {
    public static void main(String[] args) {
        Logger log = LogManager.getRootLogger();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = context;
        BeanSpring miBean = (BeanSpring) factory.getBean("miBean");

        log.info("Mensaje: " + miBean.getMensaje());
    }
}
