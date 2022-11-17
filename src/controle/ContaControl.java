package controle;

import java.util.ArrayList;

import modelo.Conta;

public class ContaControl {
	private ArrayList<Conta> tabelaConta;

	public ContaControl() {
		this.tabelaConta = new ArrayList<>();
	}

	// Insert
	public boolean insert(Conta c) {

		if (c != null) {
			this.tabelaConta.add(c);
			return true;
		}

		return false;
	}

	// Update
	public boolean update(Conta c) {

		return false;
	}

	// Delete
	public boolean delete(Conta c, int idConta) {

		return false;
	}

	// Select
	public ArrayList<Conta> listaContas() {

		return null;
	}

	public Conta login(String usuario, String senha) {

		for (Conta conta : tabelaConta) {
			if (conta.getEmail().equals(usuario) && conta.getPassword().equals(senha)) {
				return conta;
			}
		}

		return null;

	}
}
