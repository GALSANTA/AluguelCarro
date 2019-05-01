package model;

public class Carro {
	
	private int id_carro;
	private String marca;
	private String modelo;
	private String placa;
	
	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Carro(int id_carro, String marca, String modelo, String placa) {
		super();
		this.id_carro = id_carro;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}

	public int getId_carro() {
		return id_carro;
	}

	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "[ Carro: id=" + id_carro + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + "]\n";
	}
	

}
