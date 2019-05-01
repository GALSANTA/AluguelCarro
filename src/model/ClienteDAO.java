package model;

import java.util.ArrayList;

public class ClienteDAO {

	ArrayList<Cliente> cliente = new ArrayList<>();

	public void cadastrarCliente(Cliente cliente) {

		this.cliente.add(cliente);
	}

	public String listarCliente() {
		String cliente = "";
		for (Cliente c : this.cliente) {
			cliente += c;
		}
		return cliente;
	}

	public Cliente procurarCliente(int id) {

		return this.cliente.get(id);
	}

	public void excluirCliente(int id) {
		this.cliente.remove(id);
	}

}
