package modelo;

import java.util.ArrayList;

public interface IContaControl {

	public boolean insert(Conta c);

	public boolean update(Conta c);

	public boolean delete(Conta c, int idConta);

	public ArrayList<Conta> listaContas();

	public Conta login(String usuario, String senha);

}
