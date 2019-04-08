package model;

public class Servicio{
	
	public final static char CORTEDECABELLO = 'C';
	public final static char MANICURE = 'M';
	public final static char PEDICURE = 'P';
	public final static double IVA = 0.19;
	
	//Atributes
	private String nombre;
	private int numeroDeVecesRealizado;
	private double ingresosAcumulados;
	private double valorAcumuladoImpuesto;
	
	public Servicio(String name, int nvr, double iA, double vAI){
		
		nombre = name;
		numeroDeVecesRealizado = nvr;
		ingresosAcumulados = iA;
		valorAcumuladoImpuesto = vAI;
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumeroDeVecesRealizado(){
		return numeroDeVecesRealizado;
	}
	
	public void setNumeroDeVecesRealizado(int numeroDeVecesRealizado) {
		this.numeroDeVecesRealizado = numeroDeVecesRealizado;
	}

	public double getIngresosAcumulados(){
		return ingresosAcumulados;
	}
	
	public void setIngresosAcumulados(double ingresosAcumulados) {
		this.ingresosAcumulados = ingresosAcumulados;
	}
	
	public double getValorAcumuladoImpuesto(){
		return valorAcumuladoImpuesto;
	}
	
	public void setValorAcumuladoImpuesto(double valorAcumuladoImpuesto) {
		this.valorAcumuladoImpuesto = valorAcumuladoImpuesto;
	}
	
	
	public double calcularGananciaPorServicioPrestado(){
		double price = 0;
		if(C){
			price = (8000*0.2)+IVA;
		} 
		if(M){
			price = (7000*0.35)+IVA;
		}
		else (P){
			price = (9000*0.25)+IVA;
		}
		
		 return price;
	}
	
	
}