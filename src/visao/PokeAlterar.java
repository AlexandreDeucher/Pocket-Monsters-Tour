package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ControlPoke;
import modelo.Pokemon;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokeAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtPokemon;
	private JTextField txtNome;
	private JTextField txtPeso;
	private JTextField txtAlt;
	private JTextField txtInsignia;
	private JTextField txtId;
	private JTextField txtDoce;
	private Pokemon pokemonSelecionado;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	public PokeAlterar(Pokemon pokemonSelecionado) {
		this.pokemonSelecionado = pokemonSelecionado;
		
		if(this.pokemonSelecionado != null) {
			// setar os dados do pokemon nos campos de texto
			
			
			txtNome.setText(this.pokemonSelecionado.getNomePoke());
			txtPeso.setText(this.pokemonSelecionado.getPeso());
			txtAlt.setText(this.pokemonSelecionado.getAltura());
			txtInsignia.setText(this.pokemonSelecionado.getInsignia());
			txtId.setText(this.pokemonSelecionado.getId());
			txtDoce.setText(this.pokemonSelecionado.getDoce());
			
			
			
		}
	}
	public PokeAlterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPokemon = new JTextField();
		txtPokemon.setHorizontalAlignment(SwingConstants.CENTER);
		txtPokemon.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtPokemon.setText("Pokedéx");
		txtPokemon.setEditable(false);
		txtPokemon.setEnabled(false);
		txtPokemon.setBounds(143, 23, 180, 55);
		contentPane.add(txtPokemon);
		txtPokemon.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(174, 101, 119, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(174, 144, 119, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAlt = new JTextField();
		txtAlt.setBounds(174, 187, 119, 20);
		contentPane.add(txtAlt);
		txtAlt.setColumns(10);
		
		txtInsignia = new JTextField();
		txtInsignia.setBounds(174, 230, 119, 20);
		contentPane.add(txtInsignia);
		txtInsignia.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBounds(174, 273, 119, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtDoce = new JTextField();
		txtDoce.setBounds(174, 316, 119, 20);
		contentPane.add(txtDoce);
		txtDoce.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pokemon novoPokemon = new Pokemon();

				String nome = txtNome.getText();
				if (nome == null || nome.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo NOME está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setNomePoke(nome);
				}

				String peso = txtPeso.getText();
				if (peso == null || peso.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo PESO está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setPeso(peso);
				}

				String insignia = txtInsignia.getText();
				if (insignia == null || insignia.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo INSIGNIA está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setInsignia(insignia);
				}

				String id = txtId.getText();
				if (id == null || id.isEmpty()) {

					JOptionPane.showMessageDialog(null,
							"O campo ID está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setId(id);
				}

				String doce = txtDoce.getText();
				if (doce == null || doce.isEmpty()) {

					JOptionPane.showMessageDialog(null,
							"O campo DOCE está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setDoce(doce);
				}

				String altura = txtAlt.getText();
				if (altura == null || altura.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo ALTURA está vazio, por favor preencha devidamente o campo.");
				} else {
					novoPokemon.setAltura(altura);
				}

				ControlPoke tabelaPoke = ControlPoke.getInstancias();
				boolean insert = tabelaPoke.insert(novoPokemon);

				if (insert == true) {
					JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

					txtNome.setText(null);
					txtPeso.setText(null);
					txtInsignia.setText(null);
					txtId.setText(null);
					txtAlt.setText(null);
					txtDoce.setText(null);

					dispose();

					Poke poke = new Poke();
					poke.setLocationRelativeTo(null);
					poke.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "ERRO no cadastro");
				}
			}
		});
		btnAlterar.setBounds(189, 359, 89, 23);
		contentPane.add(btnAlterar);		
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Poke poke = new Poke();
				poke.setLocationRelativeTo(null);
				poke.setVisible(true);
			}
		});
		btnNewButton.setBounds(410, 359, 89, 23);
		contentPane.add(btnNewButton);
	
	}
}
