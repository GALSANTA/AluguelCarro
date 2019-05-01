package model;

import java.util.Date;

public class Aluguel {
	
	private int id_aluguel;
	private int id_carro;
	private int id_cliente;
	private Date data_inicial;
	private Date data_fim;
	
	
	public Aluguel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Aluguel(int id_aluguel, int id_carro, int id_cliente, Date data_inicial, Date data_fim) {
		super();
		this.id_aluguel = id_aluguel;
		this.id_carro = id_carro;
		this.id_cliente = id_cliente;
		this.data_inicial = data_inicial;
		this.data_fim = data_fim;
	}


	public int getId_aluguel() {
		return id_aluguel;
	}


	public void setId_aluguel(int id_aluguel) {
		this.id_aluguel = id_aluguel;
	}


	public int getId_carro() {
		return id_carro;
	}


	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public Date getData_inicial() {
		return data_inicial;
	}


	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}


	public Date getData_fim() {
		return data_fim;
	}


	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}


	@Override
	public String toString() {
		return "[Aluguel: id_aluguel=" + id_aluguel + ", id_carro=" + id_carro + ", id_cliente=" + id_cliente
				+ ", data_inicial=" + data_inicial + ", data_fim=" + data_fim + "]\n";
	}
	
	
	
	
	

}
