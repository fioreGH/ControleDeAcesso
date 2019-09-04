package ProjetoSenhaAcesso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Acesso ao Sistema");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntreComSeu = new JLabel("Entre com seu Login: ");
		lblEntreComSeu.setBounds(35, 51, 156, 16);
		contentPane.add(lblEntreComSeu);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(209, 46, 205, 26);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblEntreComA = new JLabel("Entre com a sua senha:");
		lblEntreComA.setBounds(35, 101, 166, 16);
		contentPane.add(lblEntreComA);
		
		JButton btnEntrar = new JButton("Entrar...");
		btnEntrar.setEnabled(false);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Bem Vindo ao Sistema..." );
								
			}
		});
		btnEntrar.setBounds(35, 168, 117, 29);
		contentPane.add(btnEntrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfLogin.setText("");
				pass.setText("");
			}
		});
		btnLimpar.setBounds(164, 168, 117, 29);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair...");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(297, 168, 117, 29);
		contentPane.add(btnSair);
		
		pass = new JPasswordField();
		pass.setEditable(false);
		pass.setBounds(209, 96, 205, 26);
		contentPane.add(pass);
		
		JButton btnValidarSenha = new JButton("Validar Senha");
		btnValidarSenha.setEnabled(false);
		
		JButton btnValidarLogin = new JButton("Validar Login");
		btnValidarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int contSenha = 3;
				String login = tfLogin.getText();
				
				
			
				while(!login.equals("Raphael")) 
				{
					
					
					login = JOptionPane.showInputDialog("Login invalido, tente novamente, voce ainda tem "+ contSenha + " tentativas");
					contSenha--;
					
					if(contSenha == 0 && !login.equals("Raphael"))
					{
						JOptionPane.showMessageDialog(null, "Usuario sem acesso ao sistema, o sistema será encerrado..." );
						System.exit(0);
					}
				}
				
				tfLogin.setText("");
				tfLogin.setEditable(false);
				btnValidarLogin.setEnabled(false);
				pass.setEditable(true);;
				btnValidarSenha.setEnabled(true);
			}
		});
		btnValidarLogin.setBounds(436, 48, 124, 23);
		contentPane.add(btnValidarLogin);
		
		
		btnValidarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int contSenha = 3;
				
				String senha = String.valueOf(pass.getPassword());
			
				while(!senha.equals("UNIP")) 
				{
					contSenha--;
					
					senha = JOptionPane.showInputDialog("Senha invalida, tente novamente, voce ainda tem "+ contSenha + " tentativas");
					
					
				if(contSenha == 0 && !senha.equals("UNIP"))
				{
					JOptionPane.showMessageDialog(null, "Usuario sem acesso ao sistema, o sistema será encerrado..." );
					System.exit(0);
				}
				}
				pass.setText("");
				pass.setEditable(false);
				btnValidarSenha.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Acesse o sistema clicando no botão ENTRAR..." );
				btnEntrar.setEnabled(true);
				
				
			}
		});
		btnValidarSenha.setBounds(436, 98, 124, 23);
		contentPane.add(btnValidarSenha);
	}
}
