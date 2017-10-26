package me.samfreeman.java.Advanced;

public class JavaSingletonPattern {
	private JavaSingletonPattern() {
		
	}
	
	public String str; //= new String();
	static JavaSingletonPattern getSingletonInstance() {
		try {
			return JavaSingletonPattern.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
