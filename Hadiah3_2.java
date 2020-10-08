import java.util.Scanner;
public class Hadiah3_2{
	public static void main (String[] args){
		Scanner masukan = new Scanner(System.in);  
		int jam,menit,detik,totdet;
		System.out.print("Masukkan Banyak Jam :"); jam = masukan.nextInt(); 
        System.out.print("Masukkan Banyak Menit :"); menit = masukan.nextInt();
        System.out.print("Masukkan Banyak detik :"); detik = masukan.nextInt();
        
        totdet = (jam*3600)+(menit*60)+detik;
        System.out.println("Total Detik = "+ totdet);
        }
} 
		