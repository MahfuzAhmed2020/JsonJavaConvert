package com.osa.js;

import org.json.JSONException;
import org.json.JSONObject;

import com.osa.base.AppContainsDemo;

public class JsonConvertDemo {
	public static void main(String[] args) {
		Object[][] students=AppContainsDemo.getValue("C:\\Users\\mahfu\\Desktop\\ExelTemp\\TestDemo.xlsx", "JsonData");
//		Object[][] clients = { { "Md", "mahfuz", "3473570373", "abc.l@yahoo.com" },
//				{ "ifti", "shayan", "123456786", "xyz@yahoo.com" } };
		Object []a=new Object[100];
		
//		for (Object[] objects :students ) {
//			for (Object s1 : objects) {
//				System.out.println(s1);
//			}
//		}
		/**
		 * To get whole sheet as json structure
		 */
		for (int i = 0; i < students.length; i++) {
			a[i]=getPayload(students[i]);
			System.out.println(getPayload(students[i]));
			
		}
		/**
		 * To get ONE ROW as json structure
		 */
		System.out.println("To get whole ONE ROW as json structure \n"+a[0]);
		
//		for(Object p:a) {
//			System.out.println(p);
//		}
		
//		for (Object[] objects :clients ) {
//			for (Object s1 : objects) {
//				System.out.println(s1);
//			}
//		}
//		for (int i = 0; i < clients.length; i++) {
//			System.out.println(getPayload(clients[i]));
//		}
	}

	public static String getPayload(Object[] students) {
		String indented = null;
		try {
			JSONObject person = new JSONObject();
			person.put("firstName", students[0]);
			person.put("lastName", students[1]);
			person.put("phoneNumber", students[2]);
			person.put("email", students[3]);
			indented = person.toString(4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return indented;
	}
}
