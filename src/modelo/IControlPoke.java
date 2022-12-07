package modelo;

import java.util.ArrayList;

public interface IControlPoke {

	public boolean insert(Pokemon p);

	public boolean update(Pokemon p);

	public boolean delete(Pokemon p, int idPokemon);

	public ArrayList<Pokemon> listaPokes();

}
