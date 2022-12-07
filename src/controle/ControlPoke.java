package controle;

import java.util.ArrayList;

import modelo.IControlPoke;
import modelo.Pokemon;

public class ControlPoke implements IControlPoke {
	private static ArrayList<Pokemon> tabelaPoke;

	private static ControlPoke instancias;

	private ControlPoke() {
	}

	public static ControlPoke getInstancias() {

		if (instancias == null) {
			instancias = new ControlPoke();
			tabelaPoke = new ArrayList<>();

		}
		return instancias;
	}

	// Insert
	public boolean insert(Pokemon p) {

		if (p != null) {
			tabelaPoke.add(p);
			return true;
		}

		return false;
	}

	// Update
	public boolean update(Pokemon p) {

		return false;
	}

	// Delete
	public boolean delete(Pokemon p, int idPokemon) {

		return false;
	}

	public Pokemon buscarPokePorId(Long id) {

		for (Pokemon pokemon : tabelaPoke) {
			if (pokemon.getId() == id) {
				return pokemon;
			}
		}

		return null;
	}

	// Select
	public ArrayList<Pokemon> listaPokes() {
		return tabelaPoke;
	}

}
