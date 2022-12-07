package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.ControlPoke;
import modelo.Pokemon;
import java.awt.Color;

public class Poke extends JFrame {

	private JPanel contentPane;
	private static ArrayList<Pokemon> tabelaPokemon;
	private ControlPoke controlPoke;
	private Pokemon pokemonSelecionado;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Poke() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(204, 0, 102));
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				TelaPokedex pokedex = new TelaPokedex(pokemonSelecionado);
				pokedex.setLocationRelativeTo(null);
				pokedex.setVisible(true);

			}
		});
		btnCadastrar.setBounds(434, 286, 101, 23);
		contentPane.add(btnCadastrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 83, 409, 226);
		contentPane.add(scrollPane);

		ControlPoke controlPoke = ControlPoke.getInstancias();
		ArrayList<Pokemon> listaPokemon = controlPoke.listaPokes();

		JTable table = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "Altura", "Peso", "Insignia", "Doce", "Id" });
		table.setModel(modelo);
		if (listaPokemon.size() > 0 && listaPokemon != null) {
			for (Pokemon pokemon : listaPokemon) {
				modelo.addRow(new Object[] { pokemon.getNomePoke(), pokemon.getAltura(), pokemon.getPeso(),
						pokemon.getInsignia(), pokemon.getDoce(), pokemon.getId() });
			}
		}
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicaoPessoa = table.getSelectedRow();
				pokemonSelecionado = listaPokemon.get(posicaoPessoa);
				pokemonSelecionado.getNomePoke();
				pokemonSelecionado.getPeso();
				pokemonSelecionado.getAltura();
				pokemonSelecionado.getInsignia();
				pokemonSelecionado.getDoce();
				pokemonSelecionado.getId();
			}
		});
		scrollPane.setViewportView(table);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(new Color(255, 255, 255));
		btnAlterar.setBackground(new Color(204, 0, 102));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				PokeAlterar tp = new PokeAlterar(pokemonSelecionado);
				tp.setVisible(true);

			}
		});
		btnAlterar.setBounds(35, 49, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setForeground(new Color(255, 255, 255));
		btnDeletar.setBackground(new Color(204, 0, 102));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pokemonSelecionado != null) {
					listaPokemon.remove(listaPokemon);
					listaPokemon.remove(pokemonSelecionado);
				}
			}
		});
		btnDeletar.setBounds(310, 49, 89, 23);
		contentPane.add(btnDeletar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 0, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventario inventario = new Inventario();
				inventario.setLocationRelativeTo(null);
				inventario.setVisible(true);
			}
		});
		btnNewButton.setBounds(434, 252, 101, 23);
		contentPane.add(btnNewButton);
	}
}
