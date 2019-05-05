package compileTimePolymorphism;

public class CompileDemo1 {
	public static void main(String[] args) {
		CompileDemo1 obj= new CompileDemo1();
		obj.add(15, 13);
		obj.add(15, 13, 12);
		obj.add("Ruslan", "Omurbekov");
		obj.add(10, 5);
		obj.add(13, 13);
		
	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int c, int d, int e) {
		int f= c+d+e;
		System.out.println(f);
	}
	public void add(String firstname,String lastname) {
		String result= firstname+" "+lastname;
		System.out.println(result);
	}
	public void add(double db,int ib) {
		double fin= db+ib;
		System.out.println(fin);
	}
	public void add(int first, double second) {
		double inn= first+second;
		System.out.println(inn);
	}
	

}
