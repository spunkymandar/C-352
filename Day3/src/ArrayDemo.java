
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One-Dimensional Array
		//datatype[] arrayname=new datatype[size]
		
		int[] intArray=new int[]{10,20,54,25,76};
		
		
		intArray[0]=23;
//		int intArray[] =new int[5];

	//	System.out.println(intArray);
		
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		
		
		
		
		//for(data_type var_name:arrayname/collectionname)
		
		displayArray(intArray);
	}

	private static void displayArray(int[] intArray) {
		// TODO Auto-generated method stub
		
	}
	
	

}
