package model;

public class Empleado{
	
	// Atributes
	private String nombre;
	private String cedula;
	private String cargo;
	private int anioIngreso;
	
	//Relations
	private Servicio serv1;
	private Servicio serv2;
	private Servicio serv3;
	
	public Empleado(String nombre, String cedula, String cargo, int ingress, Servicio serv1, Servicio serv2, Servicio serv3){
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.cargo = cargo;
		anioIngreso = ingress;
		this.serv1 = serv1;
		this.serv2 = serv2;
		this.serv3 = serv3;
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCedula(){
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCargo(){
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getAnioIngreso(){
		return anioIngreso;
	}
	
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	
	public Servicio getServi1(){
		return serv1;
	}
	
	public void setServi1(Servicio serv1) {
		this.serv1 = serv1;
	}
	
	public Servicio getServi2(){
		return serv2;
	}
	
	public void setServi2(Servicio serv2) {
		this.serv2 = serv2;
	}
	
	public Servicio getServi3(){
		return serv3;
	}
	
	public void setServi3(Servicio serv3) {
		this.serv3 = serv3;
	}

	
}