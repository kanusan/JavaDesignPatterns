package com.kanu.singleton;



class Database{
	
	private  static Database dbObject;
	
	private Database() {
		if(dbObject != null)
			throw new RuntimeException("please use get Instance method");
	}
	
	public static Database getInstance() {
		if(dbObject==null) {
			synchronized (Database.class) {
				if(dbObject==null)
				dbObject = new Database();
			}
		}
			
		return dbObject;
		
	}
	public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
}

public class Singleton {

	public static void main(String[] args) {
		
		Database dbObject1 = Database.getInstance();
		System.out.println(dbObject1);
		
		Database dbObject2 = Database.getInstance();
		System.out.println(dbObject2);
		
		dbObject1.getConnection();
		

	}

}
