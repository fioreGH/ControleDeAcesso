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
	private int contSenha = 0;

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
		setBounds(100, 100, 450, 238);
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
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				
				String login = tfLogin.getSelectedText();
				
				String senha = String.valueOf(pass.getPassword());
				
				if (tfLogin.getText().equals("Raphael") && (senha.equals("UNIP")&& contSenha < 3))
				{
					JOptionPane.showMessageDialog(null, "Bem Vindo ao Sistema!");
					
				}else if (contSenha == 3) {
		            JOptionPane.showMessageDialog(null, "Excedeu o numero de tentativas, usuário bloqueado! o programa será encerrado.");
		            System.exit(0);
				
				}else { 
		            JOptionPane.showMessageDialog(null, "Tente Novamente, você ainda tem mais, "+(3-contSenha)+" tentativas");
		            contSenha++;
		            tfLogin.setText("");
		            pass.setText("");
		            contentPane.setVisible(true);
		            
		        }
				
				
				

				
				
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
		pass.setBounds(209, 96, 205, 26);
		contentPane.add(pass);
	}
}
