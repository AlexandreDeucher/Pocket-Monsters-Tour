package controle;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Conta;
import modelo.IContaControl;

public class ContaControl implements IContaControl {

	private static ArrayList<Conta> tabelaConta;
	private static ContaControl instancia;
	
	private ContaControl() {}

	public static ContaControl getInstancia() {

		if (instancia == null) {
			instancia = new ContaControl();
			tabelaConta = new ArrayList<>();

			Conta c = new Conta();
			c.setName("admin");
			c.setEmail("admin");
			c.setPassword("admin");
			c.setDataNascimento(LocalDate.now());
			tabelaConta.add(c);

		}
		return instancia;
	}

	// Insert
	public boolean insert(Conta c) {

		if (c != null) {
			tabelaConta.add(c);
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
