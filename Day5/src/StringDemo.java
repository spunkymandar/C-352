
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Class objects : do not need the new() keyword for instance creation
		//array, int[] myarray={};
		
		int x=10;//primitive
		String name="wiley";// \0
		
		//Immutable : Cannot change its value
		String str1=new String("Java Programming");//str1=new String("java Programming")
		System.out.println("Original String :"+str1);//Java Programming
		str1="PHP Programming";//str1=new String("PHP Programming")
		System.out.println("Modified String :"+str1);//
		
		str1=str1.toUpperCase();
		System.out.println("Modified String :"+str1);//PHP PROGRAMMING 	or PHP Programming
		
		System.out.println(str1.charAt(10));
		System.out.println(str1.contains("PRO"));
		System.out.println(str1.indexOf('P'));
		System.out.println(str1.lastIndexOf('P'));
		
		
		
		//String Pool : memory from heap memory, which is utilized to store the String objects
		
		String s1="demoString";//String s1=new String("demoString");
		String s=new String("demoString");//String s=new String("demoString")
		System.out.println(s1==s);
		
		
		StringBuffer sb1=new StringBuffer("somedata");
		System.out.println(sb1);
		sb1.append("added");
		System.out.println(sb1);
		
		
		StringBuilder sb2=new StringBuilder("somedata");
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
