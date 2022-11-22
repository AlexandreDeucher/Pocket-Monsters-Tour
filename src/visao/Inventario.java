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
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Inventario extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 816, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(42, 51, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPerfil = new JButton("perfil");
		btnPerfil.setForeground(new Color(255, 255, 255));
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Perfil().setVisible(true);
			}
		});
		btnPerfil.setBackground(new Color(119, 118, 123));
		btnPerfil.setBounds(10, 11, 139, 23);
		contentPane.add(btnPerfil);
		
		JButton btnPokedex = new JButton("pokedéx");
		btnPokedex.setForeground(new Color(255, 255, 255));
		btnPokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Poke poke = new Poke();
				poke.setLocationRelativeTo(null);
				poke.setVisible(true);
			}
		});
		btnPokedex.setBackground(new Color(119, 118, 123));
		btnPokedex.setBounds(322, 11, 139, 23);
		contentPane.add(btnPokedex);
		
		JButton btnMissao = new JButton("Missões");
		btnMissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Missoes().setVisible(true);
			}
		});
		btnMissao.setBackground(new Color(119, 118, 123));
		btnMissao.setForeground(new Color(255, 255, 255));
		btnMissao.setBounds(161, 11, 149, 23);
		contentPane.add(btnMissao);
		
		JLabel lblNewLabel = new JLabel("poção");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("doce");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(231, 301, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ovo");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(264, 101, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("pokebola");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(32, 301, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("fruta");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(423, 301, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inventario.class.getResource("/visao/charizzard.png")));
		label.setBounds(455, -51, 349, 419);
		contentPane.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 120, 139, 141);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(25, 317, 139, 167);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(203, 317, 132, 167);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(404, 317, 139, 175);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(229, 120, 139, 141);
		contentPane.add(textArea_4);
	}
}
