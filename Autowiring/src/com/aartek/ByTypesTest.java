package com.aartek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypesTest 
{
	public static void main(String[] args) 
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("ByType.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck(); 

	}

}
