package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 282);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 228, 228));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Perfil.class.getResource("/visao/profile-removebg-preview.png")));
		lblNewLabel.setBounds(10, 49, 128, 128);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setForeground(new Color(255, 255, 255));
		txtNome.setBackground(new Color(0, 128, 192));
		txtNome.setText("nome");
		txtNome.setBounds(165, 73, 301, 69);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
	}
}
