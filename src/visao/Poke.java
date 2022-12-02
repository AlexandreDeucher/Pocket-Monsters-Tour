package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.ControlPoke;
import modelo.Pokemon;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Poke extends JFrame {

	private JPanel contentPane;
	private static ArrayList<Pokemon> tabelaPokemon;
	private ControlPoke controlPoke;
	private Pokemon pokemonSelecionado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poke frame = new Poke();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Poke() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				pokedex pokedex = new pokedex();
				pokedex.setLocationRelativeTo(null);
				pokedex.setVisible(true);

			}
		});
		btnCadastrar.setBounds(434, 286, 85, 23);
		contentPane.add(btnCadastrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 83, 409, 226);
		contentPane.add(scrollPane);

		ControlPoke controlPoke = ControlPoke.getInstancias();
		ArrayList<Pokemon> listaPokemon = controlPoke.listaPokes();

		JTable table = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Altura", "Peso", "Insignia", "Doce", "Id"  });
		table.setModel(modelo);
		if (listaPokemon.size() > 0 && listaPokemon != null) {
			for (Pokemon pokemon : listaPokemon) {
				modelo.addRow(new Object[] { pokemon.getNomePoke(), pokemon.getAltura(), pokemon.getPeso(), pokemon.getInsignia(), pokemon.getDoce(), pokemon.getId() });
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
				//txtNomePoke.setText(pokemonSelecionado.getNome());
				//txtCPF.setText(pokemonSelecionado.getCpf());
			}
		});
		scrollPane.setViewportView(table);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAlterar.setBounds(35, 49, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(310, 49, 89, 23);
		contentPane.add(btnDeletar);
	}
}
