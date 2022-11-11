package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Missoes extends JFrame {

	private JPanel contentPane;
	private JTextField txtVejaOSeu;
	private JTextField txtAbraAAba;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 121);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVejaOSeu = new JTextField();
		txtVejaOSeu.setText("Veja o seu perfil");
		txtVejaOSeu.setEditable(false);
		txtVejaOSeu.setBounds(10, 11, 94, 20);
		contentPane.add(txtVejaOSeu);
		txtVejaOSeu.setColumns(10);
		
		txtAbraAAba = new JTextField();
		txtAbraAAba.setText("Abra a aba batalhas");
		txtAbraAAba.setEditable(false);
		txtAbraAAba.setBounds(10, 42, 120, 20);
		contentPane.add(txtAbraAAba);
		txtAbraAAba.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(111, 10, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(136, 41, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
	}

}
