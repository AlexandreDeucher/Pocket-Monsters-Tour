package visao;

import java.awt.EventQueue; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ContaControl;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import modelo.Conta;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtDate;
	private JTextField txtSenha;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(42, 51, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtName = new JTextField();
		txtName.setBounds(178, 39, 118, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(178, 138, 118, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtDate = new JTextField();
		txtDate.setBounds(178, 85, 118, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(106, 45, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(106, 141, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("DDN");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(106, 88, 35, 14);
		contentPane.add(lblNewLabel_2);

		txtSenha = new JTextField();
		txtSenha.setBounds(178, 188, 118, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(106, 191, 46, 14);
		contentPane.add(lblNewLabel_3);

		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Conta novaConta = new Conta();

				String name = txtName.getText();
				if (name == null || name.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo NOME está vazio, por favor preencha devidamente o campo.");
				} else {
					novaConta.setName(name);
				}

				String email = txtEmail.getText();
				if (email == null || email.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo EMAIL está vazio, por favor preencha devidamente o campo.");
				} else {
					novaConta.setEmail(email);
				}

				String senha = txtSenha.getText();
				if (senha == null || senha.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"O campo SENHA está vazio, por favor preencha devidamente o campo.");
				} else {
					novaConta.setPassword(senha);
				}

				ContaControl tabelaConta = ContaControl.getInstancia();
				
				boolean insert = tabelaConta.insert(novaConta);
				
				if (insert == true) {
					JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

					txtName.setText(null);
					txtEmail.setText(null);
					txtSenha.setText(null);

					dispose();

					Login login = new Login();
					login.setLocationRelativeTo(null);
					login.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "ERRO no cadastro");
				}

			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(119, 118, 123));
		btnNewButton.setBounds(178, 231, 118, 23);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("voltar");
		btnNewButton_1.setBackground(new Color(119, 118, 123));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(178, 266, 118, 23);
		contentPane.add(btnNewButton_1);

	}
}
