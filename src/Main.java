import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, column;
		Scanner scan = new Scanner(System.in);
		System.out.println("May�n Tarlas�na Hosgeldiniz.");
		System.out.println("L�tfen oynamak istediginiz boyutlar� girin !");
		//System.out.print("Sat�r say�s� : ");
		//row = scan.nextInt();
		//System.out.print("S�tun say�s� : ");
		//column = scan.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(5, 5);
       
        mayin.run();
	}
	
	

}
