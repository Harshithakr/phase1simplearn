package Methods;

public class Demo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		Demo b=new Demo();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

}
