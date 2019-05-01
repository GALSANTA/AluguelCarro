package model;

import java.util.ArrayList;

public class CarroDAO {
	
	ArrayList<Carro> carro = new ArrayList<>();
	
	public void cadastrarCarro(Carro carro) {
		
		this.carro.add(carro);
	}
	public String listarCarros() {
		String carro = "";
		for(Carro c: this.carro) {
		  carro+=c;
		}
		return carro;
	}
	public Carro procurarCarro(int id) {
		
		return this.carro.get(id);
	}
	public void excluirCarro(int id) {
		this.carro.remove(id);
	}
}
