package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ContaControl;
import controle.ControlPoke;
import modelo.Conta;
import modelo.Pokemon;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Pokemon;
import javax.swing.SwingConstants;

public class TelaPokedex extends JFrame {

	private JPanel contentPane;
	private JTextField txtCharizard;
	private JTextField txtNome;
	private JTextField txtPeso;
	private JTextField txtAlt;
	private JTextField txtInsignia;
	private JTextField txtId;
	private JTextField txtDoce;
	private JButton btnNewButton;
	private Pokemon pokemonSelecionado;

	/**
	 * Create the frame.
	 */
	public TelaPokedex(Pokemon pokemonSelecionado) {
		this.pokemonSelecionado = pokemonSelecionado;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCharizard = new JTextField();
		txtCharizard.setHorizontalAlignment(SwingConstants.CENTER);
		txtCharizard.setForeground(new Color(192, 192, 192));
		txtCharizard.setEditable(false);
		txtCharizard.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtCharizard.setText("Pokedéx");
		txtCharizard.setBounds(203, 23, 167, 42);
		contentPane.add(txtCharizard);
		txtCharizard.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(232, 88, 112, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(232, 131, 112, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		txtAlt = new JTextField();
		txtAlt.setBounds(232, 174, 112, 20);
		contentPane.add(txtAlt);
		txtAlt.setColumns(10);

		txtInsignia = new JTextField();
		txtInsignia.setBounds(232, 217, 112, 20);
		contentPane.add(txtInsignia);
		txtInsignia.setColumns(10);

		txtId = new JTextField();
		txtId.setBounds(232, 260, 112, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDoce = new JTextField();
		txtDoce.setBounds(232, 303, 112, 20);
		contentPane.add(txtDoce);
		txtDoce.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(354, 71, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("peso");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(354, 112, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("altura");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(354, 157, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Insignia");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(354, 202, 92, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("id");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(354, 248, 46, 14);
		contentPane.add(lblNewLabel_4);

		btnNewButton = new JButton("Cadastrar Pokemon");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
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
					novoPokemon.setId(Long.valueOf(id));
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
		btnNewButton.setBounds(203, 346, 180, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_5 = new JLabel("Doce");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(354, 285, 46, 14);
		contentPane.add(lblNewLabel_5);
	}
}
