import java.util.Scanner;

public class Hadiah3_1{
	public static void main (String[] args){
		Scanner masukan = new Scanner(System.in);
	float panjang, lebar, luas;
	System.out.print("Masukkan Panjang :"); panjang = masukan.nextInt(); 
    System.out.print("Masukkan Luas :"); lebar = masukan.nextInt();
	
	
	luas= panjang * lebar;
	System.out.println("Luas = "+ luas);
	}
}