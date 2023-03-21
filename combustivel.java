import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tipo de combustivel");
		String combustivel = sc.nextLine();
		
		System.out.println("Informe a capacidade do tanque ");
		double capacidade = sc.nextDouble();
		
		if (combustivel.equalsIgnoreCase("G")) {
			double valorPago = capacidade * 3.79;
			System.out.println("O valor pago na gasolina : " + valorPago);
		} else {
		  
			double valorPago = capacidade * 3.79;
			System.out.println("O valor pago no alcool  : " + valorPago);	
			
	
		}
		
	
		
		
		
		
		
		
	
	}

}
