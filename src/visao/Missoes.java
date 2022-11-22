package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Missoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Missoes frame = new Missoes();
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
	public Missoes() {
		setBackground(new Color(42, 51, 70));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(42, 51, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Missoes.class.getResource("/visao/bulba_hw-removebg-preview (1).png")));
		label.setBounds(20, 98, 180, 218);
		contentPane.add(label);
		
		JButton btnVejaOSeu = new JButton("Veja o seu perfil");
		btnVejaOSeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Perfil Perfil = new Perfil();
				Perfil.setLocationRelativeTo(null);
				Perfil.setVisible(true);
				
			}
		});
		btnVejaOSeu.setForeground(new Color(255, 255, 255));
		btnVejaOSeu.setBackground(new Color(94, 92, 100));
		btnVejaOSeu.setBounds(20, 13, 180, 25);
		contentPane.add(btnVejaOSeu);
		
		JButton btnAbraAAba = new JButton("volte ao inventario");
		btnAbraAAba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inventario inventario = new Inventario();
				inventario.setLocationRelativeTo(null);
				inventario.setVisible(true);
			}
		});
		btnAbraAAba.setForeground(new Color(255, 255, 255));
		btnAbraAAba.setBackground(new Color(94, 92, 100));
		btnAbraAAba.setBounds(20, 50, 180, 25);
		contentPane.add(btnAbraAAba);
		
		JTextArea txtrGvb = new JTextArea();
		txtrGvb.setFont(new Font("L M Mono Prop10", Font.PLAIN, 16));
		txtrGvb.setForeground(new Color(255, 255, 255));
		txtrGvb.setBackground(new Color(119, 118, 123));
		txtrGvb.setText("Missões incompletas");
		txtrGvb.setBounds(265, 33, 204, 250);
		contentPane.add(txtrGvb);
		
		JTextArea txtrMissesConcludas = new JTextArea();
		txtrMissesConcludas.setFont(new Font("L M Mono Prop10", Font.PLAIN, 16));
		txtrMissesConcludas.setForeground(new Color(255, 255, 255));
		txtrMissesConcludas.setBackground(new Color(119, 118, 123));
		txtrMissesConcludas.setText("Missões concluídas");
		txtrMissesConcludas.setBounds(481, 32, 208, 251);
		contentPane.add(txtrMissesConcludas);
	}
}
