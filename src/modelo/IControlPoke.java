package modelo;

import java.util.ArrayList;

public interface IControlPoke {

	public boolean insert(Pokemon p);

	public boolean update(Pokemon p, Long idPokemon);

	public boolean delete(Pokemon p, Long idPokemon);

	public ArrayList<Pokemon> listaPokes();

}
