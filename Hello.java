public class Hello{
	
	private Integer a;
	
	// 构造函数
	public Hello(){
		this.a = 10;
		System.out.println("Hello Construct...");
	}
	
	//成员函数
	public void test(){
		System.out.println("Hello test");
	}
	
	//打印成员变量
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

