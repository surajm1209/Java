package com.spring01.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring001.comp.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjection {

	public static void main(String[] args) throws Exception {

		FileSystemResource resource = new FileSystemResource("src/com/spring01/cfg/applicationContext.xml");

		System.out.println("***********BeanFactory container starting************");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("***********BeanFactory container started*************");

		System.in.read();

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcode value of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");

		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode value of wmg1 is :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateMessage("kohli");
		System.out.println(result1);

		System.out.println();

		System.out.println("*******Container is closing**********");
	}
}
