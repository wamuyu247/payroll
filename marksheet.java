package marksheet;
import java.util.Scanner;
public class assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int sNo1,Sub1,Sub2,Sub3,Sub4,Sub5,total1,sNo12,stdname2,Sub12,Sub22,Sub32,Sub42,Sub52,total2,Sub123,Sub223,Sub323,Sub423,Sub523,sNo123,total3;
		String stdname,stdname21,stdname213 ;
		sNo1=in.nextInt();
		stdname=in.next();
		Sub1=in.nextInt();
		Sub2=in.nextInt();
		Sub3=in.nextInt();
		Sub4=in.nextInt();
		Sub5=in.nextInt();
		total1=Sub1+Sub2+Sub3+Sub4+Sub5;
		sNo12=in.nextInt();
		stdname21=in.next();
		Sub12=in.nextInt();
		Sub22=in.nextInt();
		Sub32=in.nextInt();
		Sub42=in.nextInt();
		Sub52=in.nextInt();
		total2=Sub12+Sub22+Sub32+Sub42+Sub52;
		sNo123=in.nextInt();
		stdname213=in.next();
		Sub123=in.nextInt();
		Sub223=in.nextInt();
		Sub323=in.nextInt();
		Sub423=in.nextInt();
		Sub523=in.nextInt();
		total3=Sub123+Sub223+Sub323+Sub423+Sub523;
		
		
System.out.println("Welcome to Student Mark List Application");
System.out.println("_______________________________________________________________________________________");
System.out.println("SNO\tStudets name\t\t\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal");
System.out.println("_______________________________________________________________________________________");
System.out.println(sNo1+"\t"+stdname+"\t\t\t"+Sub1+"\t"+Sub2+"\t"+Sub3+"\t"+Sub4+"\t"+Sub5+"\t"+total1);
System.out.println(sNo12+"\t"+stdname21+"\t\t\t"+Sub12+"\t"+Sub22+"\t"+Sub32+"\t"+Sub42+"\t"+Sub52+"\t"+total2);
System.out.println(sNo123+"\t"+stdname213+"\t\t\t"+Sub123+"\t"+Sub223+"\t"+Sub323+"\t"+Sub423+"\t"+Sub523+"\t"+total3);

	}

}
