public class HelloWorld{
	
	//属性
	private Integer a;
	
	//构造函数
	public HelloWorld(){
		this.a = 10;
		System.out.println("Hello Construct...");
	}
	//成员方法
	public void test(){
		System.out.println("Hello test");
	}
	//打印成员变量
	public void printValue(){
		System.out.println(this.a);
	}
	//主函数
	public static void main(String[] args){
		System.out.println("Hello!!");
		HelloWorld h = new HelloWorld();
		h.test();
		h.printValue();
	}
	
}

