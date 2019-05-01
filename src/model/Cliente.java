package model;

public class Cliente {
	
	private int id_cliente;
	private String nome;
	private String rg;
	private String cpf;
	private String numero1;
	private String numero2;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int id_cliente, String nome, String rg, String cpf, String numero1, String numero2) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumero1() {
		return numero1;
	}
	public void setNumero1(String numero1) {
		this.numero1 = numero1;
	}
	public String getNumero2() {
		return numero2;
	}
	public void setNumero2(String numero2) {
		this.numero2 = numero2;
	}
	
	@Override
	public String toString() {
		return "[Cliente id_cliente=" + id_cliente + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", numero1="
				+ numero1 + ", numero2=" + numero2 + "]\n";
	}
	

}
