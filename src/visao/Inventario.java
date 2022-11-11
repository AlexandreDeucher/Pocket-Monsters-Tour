package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPerfil = new JButton("perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Perfil().setVisible(true);
			}
		});
		btnPerfil.setBackground(new Color(0, 0, 255));
		btnPerfil.setBounds(10, 11, 57, 23);
		contentPane.add(btnPerfil);
		
		JButton btnPokedex = new JButton("pokedéx");
		btnPokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new pokedex().setVisible(true);
			}
		});
		btnPokedex.setBackground(new Color(0, 0, 255));
		btnPokedex.setBounds(368, 11, 73, 23);
		contentPane.add(btnPokedex);
		
		JButton btnMissao = new JButton("Missões");
		btnMissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Missoes().setVisible(true);
			}
		});
		btnMissao.setBackground(new Color(0, 0, 255));
		btnMissao.setForeground(new Color(0, 0, 0));
		btnMissao.setBounds(174, 11, 89, 23);
		contentPane.add(btnMissao);
		
		textField = new JTextField();
		textField.setBounds(10, 147, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 147, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(343, 147, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("poção");
		lblNewLabel.setBounds(33, 166, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("doce");
		lblNewLabel_1.setBounds(368, 166, 29, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ovo");
		lblNewLabel_2.setBounds(204, 166, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 265, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(343, 265, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("pokebola");
		lblNewLabel_3.setBounds(33, 284, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("fruta");
		lblNewLabel_4.setBounds(368, 284, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
