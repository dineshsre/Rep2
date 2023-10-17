package dpdemo;

public class ExceptionHandlingDemo {
	
	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
		
	}
	
	public static void show() {
		sayHello("zsdsaddsf dfvdsgds");
	}

	public static void main(String[] args) {
			show();
	}

}
