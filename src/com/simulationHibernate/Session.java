package com.simulationHibernate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Session {
	Map<String,String> cfs = new HashMap<String, String>();
	String tableName = "student";
	String[] methodName;
	public Session() {
		cfs.put("id", "id");
		cfs.put("name", "name");
		cfs.put("age", "age");
		methodName = new String[cfs.size()];
	}
	public void save(Student student) throws ClassNotFoundException, SQLException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String sql = createSql();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_hibernate", "root", "055753");
		PreparedStatement statement = conn.prepareStatement(sql);
		for(int i=0;i<methodName.length;i++) {
			System.out.println(methodName[i]);
			Method m = student.getClass().getMethod(methodName[i]);
			Class returnType = m.getReturnType();
			if(returnType.getName().equals("java.lang.String")) {
				String returnValue = (String) m.invoke(student);
				statement.setString(i+1, returnValue);
			}
			if(returnType.getName().equals("int")) {
				int returnValue = (int) m.invoke(student);
				statement.setInt(i+1, returnValue);
			}
		}
		System.err.println(statement.toString());
		statement.executeUpdate();
		statement.close();
		conn.close();
	}
	private String createSql() {
		String str1 = "";
		int index = 0;
		for(String s:cfs.keySet()) {
			String v = Character.toUpperCase(s.charAt(0)) + s.substring(1);
			methodName[index] = "get" + v;
			str1 += s + ",";
			index++;
		}
		str1 = str1.substring(0, str1.length()-1);
		String str2 = "";
		for(int i=0;i<cfs.size();i++) {	
			str2 += "?,";
		}
		str2 = str2.substring(0, str2.length()-1);
		String sql = "insert into " + tableName + "(" + str1 +  ")" + "values (" + str2 + ")"; 
		return sql;
	}
	
}
