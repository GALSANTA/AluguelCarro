package model;

import java.util.ArrayList;

public class AluguelDAO {
	
	ArrayList<Aluguel> aluguel = new ArrayList<>();
	
	public void cadastrarAluguel(Aluguel aluguel) {

		this.aluguel.add(aluguel);
	}

	public String listarAluguel() {
		String aluguel = "";
		for (Aluguel c : this.aluguel) {
			aluguel += c;
		}
		return aluguel;
	}

	public Aluguel procurarAluguel(int id) {

		return this.aluguel.get(id);
	}

	public void excluirAluguel(int id) {
		this.aluguel.remove(id);
	}

}
