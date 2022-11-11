import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonnaci serisi uygulaması");
		System.out.print("Kaçıncı elemana kadar seriyi görüntülemek istiyorsunuz? : ");
		int number = scanner.nextInt();
		
		int n1 = 0, n2 = 1, n3;
		
		System.out.print(n1 + " " + n2);
		
		for(int i = 2; i <= number; i++) {  // i değerini 2'den başlattık çünkü ilk 2 değer her zaman yazılır
			
			n3 = n1 + n2;
			System.out.print(" " + n3);
			
			n1 = n2;                       //her döngü sonunda n1 ve n2 değerlerini güncelledik
			n2 = n3;
			
		}
		
		
		
	}

}
