package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteSeuUsuario;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(37, 0, 98));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(38, 0, 85));
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(419, 26, 351, 370);
		contentPane.add(panel);
		panel.setLayout(null);

		txtDigiteSeuUsuario = new JTextField();
		txtDigiteSeuUsuario.setForeground(new Color(128, 128, 128));
		txtDigiteSeuUsuario.setBackground(new Color(235, 227, 199));
		txtDigiteSeuUsuario.setBounds(84, 188, 193, 20);
		panel.add(txtDigiteSeuUsuario);
		txtDigiteSeuUsuario.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Usu\u00E1rio");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(160, 162, 101, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(160, 219, 46, 14);
		panel.add(lblNewLabel_4);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnEntrar.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(159, 0, 88));
		btnEntrar.setBounds(122, 292, 121, 25);
		panel.add(btnEntrar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/visao/bulba_hw-removebg-preview (1).png")));
		lblNewLabel.setBounds(105, 11, 156, 129);
		panel.add(lblNewLabel);

		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(84, 240, 198, 19);
		panel.add(pwdSenha);

		pwdSenha.setEchoChar('*');
		
		JCheckBox checkBoxVerSenha = new JCheckBox("");
		checkBoxVerSenha.setBackground(new Color(36, 31, 49));
		checkBoxVerSenha.setBounds(290, 236, 21, 23);
		panel.add(checkBoxVerSenha);
		checkBoxVerSenha.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pwdSenha.getEchoChar()== '*') {
					pwdSenha.setEchoChar((char) 0);
				}else {
					pwdSenha.setEchoChar('*');
				}
			}
		});

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 105, 391, 370);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/visao/charizzard.png")));

		JLabel lblNewLabel_5 = new JLabel("Pocket Monsters Tour");
		lblNewLabel_5.setFont(new Font("Yu Gothic Light", Font.BOLD, 22));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 6, 283, 59);
		contentPane.add(lblNewLabel_5);
	}
}
