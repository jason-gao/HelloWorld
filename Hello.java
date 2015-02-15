public class Hello{
	
	private Integer a;
	
	public Hello(){
		this.a = 10;
		System.out.println("Hello Construct...");
	}
	
	public void test(){
		System.out.println("Hello test");
	}
	
	public void printValue(){
		System.out.println(this.a);
	}
	
	public static void main(String[] args){
		System.out.println("Hello!!");
		Hello h = new Hello();
		h.test();
		h.printValue();
	}
	
}

