package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setTitle("Sobre");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("StarGame");
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblTitulo.setBounds(10, 11, 117, 34);
		getContentPane().add(lblTitulo);
		
		JLabel lblDescricao = new JLabel("Sistema para gestão de estoque e PVD");
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescricao.setBounds(10, 43, 232, 34);
		getContentPane().add(lblDescricao);
		
		JLabel lblAutor = new JLabel("Autor Mike de oliveira");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutor.setBounds(10, 85, 220, 28);
		getContentPane().add(lblAutor);
		
		JLabel lblVersao = new JLabel("Versão 1.0");
		lblVersao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVersao.setBounds(10, 124, 117, 28);
		getContentPane().add(lblVersao);
		
		JLabel lblMit = new JLabel("");
		lblMit.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblMit.setBounds(342, 15, 64, 64);
		getContentPane().add(lblMit);
		
		JLabel lblGithub = new JLabel("");
		lblGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		lblGithub.setBounds(21, 200, 32, 32);
		getContentPane().add(lblGithub);
		
		JLabel lblLink = new JLabel("https://github.com/CiberMik3");
		lblLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/CiberMik3");
			}
		});
		lblLink.setFont(UIManager.getFont("Button.font"));
		lblLink.setHorizontalAlignment(SwingConstants.LEFT);
		lblLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLink.setForeground(new Color(0, 51, 255));
		lblLink.setBounds(63, 204, 179, 28);
		getContentPane().add(lblLink);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fechar apenas o sobre
				dispose();
			}
		});
		btnOk.setBounds(317, 209, 89, 23);
		getContentPane().add(btnOk);
		
		//centralizar
		setLocationRelativeTo(null);
	}// Fim do construtor
	
	//função (metodo) para abrir um link no navegador padrao
	private void link(String url) {
		// a linha a baixo obtem o desktop do cliente 
		Desktop desktop = Desktop.getDesktop();
		// uso do try catch (tratamento de exceções
		try {
			//objeto uri para acessar os metodos necessarios para estabelecer uma conexao com a url (link) 
			URI uri = new URI(url);
			// abrir o link no navegador padrao do cliente
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
