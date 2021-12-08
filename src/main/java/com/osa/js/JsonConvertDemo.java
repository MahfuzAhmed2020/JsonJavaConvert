package com.osa.js;

import org.json.JSONException;
import org.json.JSONObject;

import com.osa.base.AppContainsDemo;

public class JsonConvertDemo {
	public static void main(String[] args) {
		Object[][] students=AppContainsDemo.getValue("C:\\Users\\mahfu\\Desktop\\ExelTemp\\TestDemo.xlsx", "JsonData");

		Object []a=new Object[10];

		System.out.println("*************To get whole sheet ****************");	
		for (Object[] objects :students ) {
			for (Object s1 : objects) {
				System.out.print(s1+"    ");
			}System.out.println();
		}
		/**
		 * To get whole sheet as json structure
		 */
		System.out.println("*************To get whole sheet as json structure ****************");
		for (int i = 0; i < students.length; i++) {
			a[i]=getPayload(students[i]);
			System.out.println(getPayload(students[i]));
			
		}
		/**
		 * To get ONE ROW as json structure
		 */
		System.out.println("##########To get whole ONE ROW as json structure  a[0] #############\n"+a[0]);
		System.out.println("$$$$$$$$$$$$$$ Object[][] clients $$$$$$$$$$$\n");	
		for(Object p:a) {
			System.out.println(p);
		}
		System.out.println("^^^^^^^^^^^ to get Object[][] clients  *******Object []cl=new Object[10]; ^^^^^^^^^^^^^^\n");
		
		
		Object[][] clients = { { "ifti", "abrar", "101010011", "iabrar@client.com" },
				{ "mehrab", "shayan", "123456786", "mshayan@client.com" } };
		Object []cl=new Object[10];
		
		for (Object[] objects :clients ) {
			for (Object s1 : objects) {
				System.out.print(s1+"  ");
				
			}System.out.println();
		}
		System.out.println("******** To get whole sheet as json structure int i = 0; i < clients.length; i++ ************\n");
		for (int i = 0; i < clients.length; i++) {
			cl[i]=getPayload(clients[i]);
			System.out.println(getPayload(clients[i]));
		}
		
		System.out.println("##########To get whole ONE ROW as json structure  cl[0] #############\n"+cl[0]);
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
