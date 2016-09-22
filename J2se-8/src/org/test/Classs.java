package org.test;


public class Classs implements TestDemoInterface {

		public boolean isNull(String str) {
			System.out.println("Impl Null Check");

			return str == null ? true : false;
		}
		
		public static void main(String args[]){
			Classs obj = new Classs();
			obj.print("");
			obj.isNull("abc");
			
			Runnable r = new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Run Method!!!");
					
				}
				
			};
			
			Thread t = new Thread(r);
			t.start();
			
			
			
		
		}
	}
