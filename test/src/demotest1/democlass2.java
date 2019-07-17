package demotest1;

import demotest2.democlass3;
import demotest.democlass1;
import secondCalc.CalcClass;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;



public class democlass2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("Package of demotest1");
		
		democlass3 dc3 = new democlass3();
		dc3.Printable();
		
		CalcClass obj = new  CalcClass();
		
		int o = obj.add(5, 4);
		System.out.println(o);

		Class c = Class.forName("Calc");
	}

}
