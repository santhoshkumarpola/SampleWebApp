public class A{
	public void m1(int a, String b){
		System.out.println("In A class m1");
	}
	public static void main(String[] a) throws Exception{
		B aa = new B();
		aa.m1("5","5");
		int i =0, b=30;
		for (int c=1;c<=10;c++){
			i = i+c;
			if(i>=30)
				break;
			System.out.println(c);
		}
	}
}
class B extends A{
	public void m1(String a, String b){
		System.out.println("In B m1");
	}
} 