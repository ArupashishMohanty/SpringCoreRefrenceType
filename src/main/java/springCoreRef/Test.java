package springCoreRef;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ref1= new ClassPathXmlApplicationContext("springCoreRef/refConfig.xml");
A temp=(A)ref1.getBean("aref");


System.out.println(temp.getX());
System.out.println(temp.getOb().getY());
System.out.println(temp);
	}

}
