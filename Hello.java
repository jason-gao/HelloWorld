public class Hello{
	
	private Integer a;
	
	// ���캯��
	public Hello(){
		this.a = 10;
		System.out.println("Hello Construct...");
	}
	
	//��Ա����
	public void test(){
		System.out.println("Hello test");
	}
	
	//��ӡ��Ա����
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

