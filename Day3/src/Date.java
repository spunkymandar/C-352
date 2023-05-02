import com.model.BankAccount;

public class Date {
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		//super();
		
		BankAccount b;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate() {
		System.out.println(dd+" / "+mm+"/"+yy);
	}
	public static void main(String[] args) {
		Date date1=new Date(5,5,2005);
		Date date2=new Date(10,10,2010);
		System.out.println("original dates:");
		date1.displayDate();
		date2.displayDate();
		swap(date1,date2);
		System.out.println("dates back in the main:");
		date1.displayDate();
		date2.displayDate();
		
		
		Date[] dateArray= {date1,date2};
		swapDate(dateArray);
		dateArray[0].displayDate();
		dateArray[1].displayDate();
		
		
	}

	public static void swap(Date date1, Date date2) {
		// TODO Auto-generated method stub
		Date temp;
		temp=date1;
		date1=date2;
		date2=temp;
		System.out.println("Swapped dates in method:");
		date1.displayDate();
		date2.displayDate();
		
		
	}
	public static void swapDate(Date[] dateArray) {
		// TODO Auto-generated method stub
		Date temp;
		temp=dateArray[0];
		dateArray[0]=dateArray[1];
		dateArray[1]=temp;
		
		
	}
	

}
