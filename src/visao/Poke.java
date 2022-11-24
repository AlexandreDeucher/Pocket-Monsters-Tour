package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Poke extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;

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
		setBounds(100, 100, 601, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTitulo = new JTextField();
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitulo.setForeground(new Color(255, 255, 255));
		txtTitulo.setBackground(new Color(102, 0, 51));
		txtTitulo.setEditable(false);
		txtTitulo.setEnabled(false);
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTitulo.setText("Seus Pokemons");
		txtTitulo.setBounds(118, 30, 201, 39);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JList list = new JList();
		list.setBounds(36, 101, 365, 279);
		contentPane.add(list);
		
		JButton btnCadastroPoke = new JButton("Cadastrar");
		btnCadastroPoke.setForeground(new Color(255, 255, 255));
		btnCadastroPoke.setBackground(new Color(102, 0, 51));
		btnCadastroPoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				pokedex pokedex = new pokedex();
				pokedex.setLocationRelativeTo(null);
				pokedex.setVisible(true);
				
			}
		});
		btnCadastroPoke.setBounds(452, 316, 100, 23);
		contentPane.add(btnCadastroPoke);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(102, 0, 51));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inventario inventario = new Inventario();
				inventario.setLocationRelativeTo(null);
				inventario.setVisible(true);
			}
		});
		btnVoltar.setBounds(452, 282, 100, 23);
		contentPane.add(btnVoltar);
	}
}
