package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Aluguel;
import model.AluguelDAO;

public class Main {
	
	public static void main(String[] args) {
		
		//testando Carro
		
		/*Carro carro = new Carro(0,"FIAT","ARGO","KKD-6417");
		Carro carro2 = new Carro(1,"VW","GOL","KKD-6417");
		
		CarroDAO carroDAO = new CarroDAO();
		
		
		carroDAO.cadastrarCarro(carro);
		carroDAO.cadastrarCarro(carro2);
		carroDAO.excluirCarro(0);

		System.out.println(carroDAO.listarCarros().toString());*/
		
		
		//testando Cliente
		
		/*Cliente cliente = new Cliente(0,"Fernando","00.000.000-00","000.000.000-00","(73)9170-4765",null);
		Cliente cliente1 = new Cliente(1,"João","00.000.000-00","000.000.000-00","(73)9170-4765",null);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.cadastrarCliente(cliente);
		clienteDAO.cadastrarCliente(cliente1);
		
		System.out.println(clienteDAO.listarCliente().toString());*/
		
		
		//testando Aluguel 
		
	
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data_inicial;
		Date data_final;
		
		
		try {
			data_inicial = formato.parse("23/04/2019");
			data_final = formato.parse("24/04/2019");
			Aluguel aluguel = new Aluguel(0, 1, 1, data_inicial, data_final);
			AluguelDAO aluguelDAO  = new AluguelDAO();
			
			aluguelDAO.cadastrarAluguel(aluguel);
			
			System.out.println(aluguelDAO.listarAluguel().toString());
			

			
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
     	
		
		
	}

}
