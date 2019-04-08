package ui;
import model.SalaEstetica;
import java.util.Scanner;

public class Main{
	
	private SalaEstetica beautyShop;
	
	public Main(){
		
	}
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Welcome!");
			System.out.println("Select an option");
			System.out.println("1. Registrar servicio");
			System.out.println("2. Calcular el promedio de ingreso por servicio");
			System.out.println("3. Consultar la ganancia del empleado por servicio prestado");
			System.out.println("4. Generar reporte");
			System.out.println("5. Exit");
		
			int option = 0;
				while(option !=5){
					option = sc.nextInt();
                
			switch(option){
				case 1:
				
				break;

				case 2:
				
				break;
				
				case 3:
				
				break;
				
				case 4:
				
				break;

				default:
				break;
			}
		
		}
		
	}
	
}