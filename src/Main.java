import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, column;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mayýn Tarlasýna Hosgeldiniz.");
		System.out.println("Lütfen oynamak istediginiz boyutlarý girin !");
		//System.out.print("Satýr sayýsý : ");
		//row = scan.nextInt();
		//System.out.print("Sütun sayýsý : ");
		//column = scan.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(5, 5);
       
        mayin.run();
	}
	
	

}
