package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class pokedex extends JFrame {

	private JPanel contentPane;
	private JTextField txtCharizard;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pokedex frame = new pokedex();
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
	public pokedex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 431);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCharizard = new JTextField();
		txtCharizard.setForeground(new Color(192, 192, 192));
		txtCharizard.setEditable(false);
		txtCharizard.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtCharizard.setText("Pokedéx");
		txtCharizard.setBounds(133, 11, 167, 42);
		contentPane.add(txtCharizard);
		txtCharizard.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(232, 68, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 123, 112, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 177, 112, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(232, 235, 112, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(232, 291, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(354, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("peso");
		lblNewLabel_1.setBounds(354, 126, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("altura");
		lblNewLabel_2.setBounds(354, 180, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insignia");
		lblNewLabel_3.setBounds(354, 238, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("id");
		lblNewLabel_4.setBounds(354, 294, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("Cadastrar Pokemon");
		btnNewButton.setBounds(49, 347, 197, 23);
		contentPane.add(btnNewButton);
	}

}
