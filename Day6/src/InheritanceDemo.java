class A {//superclass
	public A() {
		//super();
		System.out.println("In super class-A default constructor");
	}
	public void methodA() {
		System.out.println("In methodA");
	}

}

class B extends A{ //subclass
	public B() {
		//super();//implicit keyword, which invokes the default constructor of super class
		this(10);
		System.out.println("In sub class-B default constructor");
	}
	public B(int data) {
		super();
		System.out.println("parmeterized constuctor of B");
	}
	public void methodB() {
		System.out.println("In methodB");
	}
}



public class InheritanceDemo {
	public static void main(String[] args) {
		B b1=new B();//constructor
		b1.methodA();//super class method is invoked using the reference of subclass
		b1.methodB();
	}
}
