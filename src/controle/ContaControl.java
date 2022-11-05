package controle;

import java.util.ArrayList;

import modelo.Conta;

public class ContaControl {
	private ArrayList<Conta> tabelaConta;
	
	public ContaControl() { this.tabelaConta = new ArrayList<>(); }
	
	//Insert
	public boolean insert(Conta c) {
		
		/*
		tabelaConta.add(name);
		tabelaConta.add(password);
		tabelaConta.add(date);
		tabelaConta.add(email);
		*/
		return false;
	}
	//Update
	public boolean update(Conta c) {
		
		
		return  false;
	}
	
	//Delete
	public boolean delete(Conta c, int idConta) {
		
		
		return false;
	}
	
	//Select
	public ArrayList<Conta> listaContas() {
		
		
		return null;
	}
}
