package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ExemploJTable.Pessoa;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Poke extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTable table;

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
		txtTitulo.setBounds(91, 341, 203, 39);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
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
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicaoPessoa = table.getSelectedRow();
				pessoaSelecionada = listaPessoas.get(posicaoPessoa);
				txtNome.setText(pessoaSelecionada.getNome());
				txtCPF.setText(pessoaSelecionada.getCpf());
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF" }));

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 14, 46, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(57, 11, 142, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(209, 14, 46, 14);
		contentPane.add(lblCpf);

		txtCPF = new JTextField();
		txtCPF.setBounds(265, 11, 142, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(cpf);
				listaPessoas.add(p);
				atualizarJTable();
				limparCampos();

			}
		});
		btnAdicionar.setBounds(20, 42, 89, 23);
		contentPane.add(btnAdicionar);

		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pessoaSelecionada != null) {
					listaPessoas.remove(pessoaSelecionada);
					atualizarJTable();
					limparCampos();
				}

			}
		});
		btnRemover.setBounds(120, 42, 89, 23);
		contentPane.add(btnRemover);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int posicao = listaPessoas.indexOf(pessoaSelecionada);

				String novoNome = txtNome.getText();
				String novoCPF = txtCPF.getText();
				pessoaSelecionada.setNome(novoNome);
				pessoaSelecionada.setCpf(novoCPF);

				listaPessoas.set(posicao, pessoaSelecionada);
				atualizarJTable();
				limparCampos();

			}
		});
		btnAlterar.setBounds(219, 42, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(318, 42, 89, 23);
		contentPane.add(btnFechar);
		
		table_1 = new JTable();
		table_1.setBounds(20, 91, 396, 221);
		contentPane.add(table_1);
	}

	protected void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
	}

	protected void atualizarJTable() {
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF" });

		for (int i = 0; i < listaPessoas.size(); i++) {
			Pessoa p = listaPessoas.get(i);
			modelo.addRow(new Object[] { p.getNome(), p.getCpf() });
		}

		table.setModel(modelo);

		}	
		
	
}
