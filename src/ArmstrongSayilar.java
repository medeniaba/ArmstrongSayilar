import java.util.Random;
import java.util.Scanner;
public class ArmstrongSayilar {

	



		public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			int yuzler,onlar,birler,toplam;

			for ( int i = 100; i <1000; i++) {

	            yuzler=i/100;
	            onlar=(i%100)/10;
	            birler=i%10;
				 
	 toplam = (int) ( (yuzler*yuzler*yuzler) + (onlar * onlar * onlar) + (birler * birler * birler) );  
	           if ( i == toplam )
				System.out.println(i + " armstong sayıdır ");
				}
		
			

	       
			
				
			}}
		
			
			


