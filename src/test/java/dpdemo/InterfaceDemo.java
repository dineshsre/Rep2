package dpdemo;

interface InterfaceDemo {
	
	public void InterfaceMethod1();
	public void InterfaceMethod2();

}

class ImplementInterfaceClass implements InterfaceDemo{
	
	public void InterfaceMethod1() {
		System.out.println("First Method of Interface");
	}
	
	public void InterfaceMethod2() {
		System.out.println("Second Method of Interface");
	}
	
	class Main {
		public void main(String[] args) {
			ImplementInterfaceClass intObj = new ImplementInterfaceClass();
			intObj.InterfaceMethod1();
			intObj.InterfaceMethod2();
			
		}
		
	}
} 
