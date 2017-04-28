package UsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aartek.TextEditor;

public class ByConstTest {

	public static void main(String[] args)
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("ByConst.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck(); 
		

	}

}
