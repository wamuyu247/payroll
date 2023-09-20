package assignment2;
import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,name2,date;
		int no,days,rate,bam,gam;
		double a,dpftax,dpf,td,netpay;
		Scanner in=new Scanner(System.in);
		a= 0.2;
	    no=in.nextInt();
		name=in.next();
		name2=in.next();
		days=in.nextInt();
		rate=in.nextInt();
		date=in.next();	
		bam=days*rate;
		dpf=bam/10;
		dpftax=bam * a ;
		td=dpf+dpftax;
		gam=in.nextInt();
		netpay=bam-td;
		
		
		
		
		System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP");
		System.out.println("\t\t\t\tSHREE KRISHNA CHEMIST AND DRUGGID");
		System.out.println("\t\t\t\t\t\t SALARY MONTH 9 2013");
		
		
		System.out.println("EMP NO:"+no+"\t\tEMP.NAME:"+name+"\t\tDESIGNATION:CLERK"+name2);
		System.out.println("DAYS WORKED:"+days+"\t\tPAYRATE:"+rate+"\t\tGEN.DATE:15/9/2013"+date);
		System.out.println("_____________________________________________________________________________");
		System.out.println("Earnings\t\tAmount\t\tDeductions\t\tAmount(RS.)");
		System.out.println("_____________________________________________________________________________");
		System.out.println("BASIC PAY\t\t"+bam+"\t\t\tP.F"+dpf);
		System.out.println("\t\t\t\t\t\t\tPROF.TAX:"+dpftax);
		System.out.println("_____________________________________________________________________________");
		System.out.println("GROSS EARN\t\t"+gam+"TOTAL DEDUCTIONS"+td);
		System.out.println("\t\t\t\t\t\t\tNET PAY:"+netpay);
		System.out.println("_____________________________________________________________________________");

		
		
		

	}

}
