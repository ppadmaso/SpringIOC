package com.seleniumexpress.spring.SpringInversrionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//if we want to use those methods we need to create objects and call those methods
    			Airtel airtel = new Airtel();
    			airtel.data();
    			airtel.calling();
    			//suppose we want to switch to vodaphone then again we need to create object for vodaphone class and call
    			Vodaphone voda = new Vodaphone();
    			voda.calling();
    			voda.data();
    			
    			//Using spring to create objects this is an example of IOC
    			ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
    			Airtel air = (Airtel) ctx.getBean("airtel");
    			air.calling();
    			air.data();
    			
				/*
				 * currently above approach is not loosely-coupled. In order to make that we
				 * need to use Sim interface reference
				 */
    			ApplicationContext ctx1= new ClassPathXmlApplicationContext("beans.xml");
    			Sim sim = ctx1.getBean("sim",Sim.class);
    			sim.calling();
    			sim.data(); 
    			
				/*
				 * Now this is loosly coupled.If you want Airtel impl go to beans.xml file and
				 * give the Airtel reference or if you want vodaphone give vodaphone reference
				 */
    			
    }
}
