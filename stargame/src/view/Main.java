package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JToggleButton;
import javax.swing.JList;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Uso da biblioteca flatlaf (swing moderno)
		FlatLightLaf.setup();
		// FlatDarkLaf.setup();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/game-control.png")));
		setResizable(false);
		setTitle("StarGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 36, 75));
		panel.setBounds(0, 0, 203, 534);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 64, 64);
		panel.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/img/converted_image.png")));

		JLabel lblStarGame = new JLabel("StarGame");
		lblStarGame.setFont(new Font("Humnst777 BlkCn BT", Font.BOLD, 23));
		lblStarGame.setBounds(84, 26, 104, 32);
		panel.add(lblStarGame);

		JLabel lblNewLabel_1 = new JLabel("Sistema de pdv");
		lblNewLabel_1.setBounds(84, 56, 98, 14);
		panel.add(lblNewLabel_1);

		JButton btnFornecedores = new JButton(" Fornecedores");
		btnFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFornecedor fornecedor = new frmFornecedor();
				fornecedor.setVisible(true);
			}
		});
		btnFornecedores.setBorderPainted(false);
		btnFornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFornecedores.setBorder(UIManager.getBorder("Button.border"));
		btnFornecedores.setFont(new Font("Scope One", Font.BOLD, 16));
		btnFornecedores.setIcon(new ImageIcon(Main.class.getResource("/img/crowd-of-users.png")));
		btnFornecedores.setBackground(new Color(255, 255, 255));
		btnFornecedores.setBounds(10, 108, 178, 52);
		panel.add(btnFornecedores);

		JButton btnProdutos = new JButton(" Produtos        ");
		btnProdutos.setBorderPainted(false);
		btnProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos.setFont(new Font("Scope One", Font.BOLD, 16));
		btnProdutos.setIcon(new ImageIcon(Main.class.getResource("/img/packages.png")));
		btnProdutos.setBounds(10, 171, 178, 52);
		panel.add(btnProdutos);

		JButton btnStarGame = new JButton(" PDV            ");
		btnStarGame.setBorderPainted(false);
		btnStarGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStarGame.setIcon(new ImageIcon(Main.class.getResource("/img/nucleus.png")));
		btnStarGame.setFont(new Font("Scope One", Font.BOLD, 18));
		btnStarGame.setBounds(10, 234, 178, 52);
		panel.add(btnStarGame);

		JButton btnVendas = new JButton(" Vendas           ");
		btnVendas.setBorderPainted(false);
		btnVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVendas.setIcon(new ImageIcon(Main.class.getResource("/img/growth (1).png")));
		btnVendas.setFont(new Font("Scope One", Font.BOLD, 16));
		btnVendas.setBounds(10, 297, 178, 52);
		panel.add(btnVendas);

		JButton btnSair = new JButton(" Sair                  ");
		btnSair.setBorderPainted(false);
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			// quando clicar no botao
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema", "Confirmar saída", JOptionPane.YES_NO_OPTION);
				//apoio ao intendimento da logica
				System.out.println(resposta);
				if (resposta == 0) {
					System.exit(0);
				}
			}
		});
		btnSair.setIcon(new ImageIcon(Main.class.getResource("/img/log-out.png")));
		btnSair.setFont(new Font("Scope One", Font.BOLD, 16));
		btnSair.setBounds(10, 360, 178, 52);
		panel.add(btnSair);

		JButton btnSobre = new JButton(" Sobre           ");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ativar a tela sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorderPainted(false);
		btnSobre.setFont(new Font("Scope One", Font.BOLD, 16));
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/about.png")));
		btnSobre.setBounds(10, 459, 178, 53);
		panel.add(btnSobre);

		JEditorPane tracejado = new JEditorPane();
		tracejado.setForeground(new Color(128, 255, 255));
		tracejado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tracejado.setBackground(new Color(3, 36, 75));
		tracejado.setText("- - - - - - - - - - -");
		tracejado.setBounds(5, 416, 188, 35);
		panel.add(tracejado);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 534, 784, 27);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblMySQL = new JLabel(" MySQL Desconectado");
		lblMySQL.setIcon(new ImageIcon(Main.class.getResource("/img/database.png")));
		lblMySQL.setBounds(0, 4, 157, 25);
		panel_1.add(lblMySQL);
		
		JLabel lblNewLabel_2 = new JLabel("•");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(144, 4, 42, 21);
		panel_1.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(213, 369, 550, 154);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblDashboardLOGO = new JLabel("");
		lblDashboardLOGO.setFont(new Font("Scope One", Font.BOLD, 18));
		lblDashboardLOGO.setIcon(new ImageIcon(Main.class.getResource("/img/benchmarking (1).png")));
		lblDashboardLOGO.setBounds(216, 11, 64, 48);
		contentPane.add(lblDashboardLOGO);

		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setFont(new Font("Scope One", Font.BOLD, 27));
		lblDashboard.setBounds(281, 11, 280, 37);
		contentPane.add(lblDashboard);

		JLabel lblNewLabel_5 = new JLabel("Visão geral do seu negócio");
		lblNewLabel_5.setBounds(284, 32, 184, 22);
		contentPane.add(lblNewLabel_5);

		JPanel panel_Produtos = new JPanel();
		panel_Produtos.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_Produtos.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_Produtos.setBounds(213, 85, 174, 131);
		contentPane.add(panel_Produtos);
		panel_Produtos.setLayout(null);

		JLabel lblProdutos = new JLabel("");
		lblProdutos.setIcon(new ImageIcon(Main.class.getResource("/img/box.png")));
		lblProdutos.setBounds(10, 9, 33, 33);
		panel_Produtos.add(lblProdutos);

		JLabel lblProdutos1 = new JLabel("Produtos");
		lblProdutos1.setForeground(SystemColor.textHighlight);
		lblProdutos1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProdutos1.setBounds(51, 12, 88, 23);
		panel_Produtos.add(lblProdutos1);

		JLabel lblNewLabel_9 = new JLabel("Total de produtos");
		lblNewLabel_9.setBounds(50, 78, 114, 50);
		panel_Produtos.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("cadastrados");
		lblNewLabel_10.setBounds(50, 104, 80, 27);
		panel_Produtos.add(lblNewLabel_10);

		JPanel panel_Estoque_baixo = new JPanel();
		panel_Estoque_baixo.setBounds(401, 85, 174, 131);
		contentPane.add(panel_Estoque_baixo);
		panel_Estoque_baixo.setLayout(null);

		JLabel lblEstoquebaixo = new JLabel("");
		lblEstoquebaixo.setIcon(new ImageIcon(Main.class.getResource("/img/alert.png")));
		lblEstoquebaixo.setBounds(10, 6, 33, 33);
		panel_Estoque_baixo.add(lblEstoquebaixo);

		JLabel lblEstoquebaixo1 = new JLabel("Estoque baixo");
		lblEstoquebaixo1.setForeground(new Color(255, 215, 0));
		lblEstoquebaixo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstoquebaixo1.setBounds(43, 6, 131, 41);
		panel_Estoque_baixo.add(lblEstoquebaixo1);

		JLabel lblNewLabel_9_1 = new JLabel("Produtos com estoque");
		lblNewLabel_9_1.setBounds(43, 79, 131, 50);
		panel_Estoque_baixo.add(lblNewLabel_9_1);

		JLabel lblNewLabel_9_2 = new JLabel("abaixo do minimo");
		lblNewLabel_9_2.setBounds(43, 92, 112, 50);
		panel_Estoque_baixo.add(lblNewLabel_9_2);

		JPanel panel_Sem_estoque = new JPanel();
		panel_Sem_estoque.setBounds(589, 85, 174, 131);
		contentPane.add(panel_Sem_estoque);
		panel_Sem_estoque.setLayout(null);
		
		JLabel lblSemestoque = new JLabel("");
		lblSemestoque.setIcon(new ImageIcon(Main.class.getResource("/img/out-of-stock.png")));
		lblSemestoque.setBounds(10, 6, 33, 33);
		panel_Sem_estoque.add(lblSemestoque);
		
		JLabel lblSemestoque1 = new JLabel("Sem estoque");
		lblSemestoque1.setForeground(Color.RED);
		lblSemestoque1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSemestoque1.setBounds(46, 3, 121, 41);
		panel_Sem_estoque.add(lblSemestoque1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Produtos sem estoque");
		lblNewLabel_9_1_1.setBounds(43, 81, 131, 50);
		panel_Sem_estoque.add(lblNewLabel_9_1_1);

		JPanel panel_Vendas_hoje = new JPanel();
		panel_Vendas_hoje.setBounds(213, 227, 174, 131);
		contentPane.add(panel_Vendas_hoje);
		panel_Vendas_hoje.setLayout(null);
		
		JLabel lblVendashoje = new JLabel("");
		lblVendashoje.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblVendashoje.setIcon(new ImageIcon(Main.class.getResource("/img/online-shopping.png")));
		lblVendashoje.setBounds(10, 11, 33, 33);
		panel_Vendas_hoje.add(lblVendashoje);
		
		JLabel lblVendashoje1 = new JLabel("Vendas hoje");
		lblVendashoje1.setForeground(Color.GREEN);
		lblVendashoje1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVendashoje1.setBounds(49, 6, 97, 41);
		panel_Vendas_hoje.add(lblVendashoje1);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Total de vendas");
		lblNewLabel_9_1_2.setBounds(49, 79, 131, 50);
		panel_Vendas_hoje.add(lblNewLabel_9_1_2);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("realizadas hoje");
		lblNewLabel_9_2_1.setBounds(49, 92, 112, 50);
		panel_Vendas_hoje.add(lblNewLabel_9_2_1);

		JPanel panel_Itens_vendidos_hoje = new JPanel();
		panel_Itens_vendidos_hoje.setBounds(401, 226, 174, 131);
		contentPane.add(panel_Itens_vendidos_hoje);
		panel_Itens_vendidos_hoje.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/cart.png")));
		lblNewLabel.setBounds(10, 11, 33, 33);
		panel_Itens_vendidos_hoje.add(lblNewLabel);
		
		JLabel lblItendVendidoshoje = new JLabel("Itend vendidos");
		lblItendVendidoshoje.setForeground(new Color(148, 0, 211));
		lblItendVendidoshoje.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItendVendidoshoje.setBounds(50, 0, 197, 41);
		panel_Itens_vendidos_hoje.add(lblItendVendidoshoje);
		
		JLabel lblHoje = new JLabel("hoje");
		lblHoje.setForeground(new Color(148, 0, 211));
		lblHoje.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHoje.setBounds(51, 14, 197, 41);
		panel_Itens_vendidos_hoje.add(lblHoje);

		JPanel panel_Faturamento = new JPanel();
		panel_Faturamento.setBounds(591, 227, 174, 131);
		contentPane.add(panel_Faturamento);
		panel_Faturamento.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/img/currency.png")));
		lblNewLabel_3.setBounds(10, 11, 33, 33);
		panel_Faturamento.add(lblNewLabel_3);
		
		JLabel lblFaturamento = new JLabel("Faturamento");
		lblFaturamento.setForeground(new Color(72, 209, 204));
		lblFaturamento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFaturamento.setBounds(48, 0, 197, 41);
		panel_Faturamento.add(lblFaturamento);
		
		JLabel lblHoje_1 = new JLabel("hoje");
		lblHoje_1.setForeground(new Color(72, 209, 204));
		lblHoje_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHoje_1.setBounds(48, 15, 197, 41);
		panel_Faturamento.add(lblHoje_1);

		JLabel lblCalendario = new JLabel("");
		lblCalendario.setIcon(new ImageIcon(Main.class.getResource("/img/calendar.png")));
		lblCalendario.setBounds(653, 19, 35, 37);
		contentPane.add(lblCalendario);

		lblData = new JLabel("__ /__ /____");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblData.setBounds(681, 20, 94, 34);
		contentPane.add(lblData);

		// Iniciar centralizado

		setLocationRelativeTo(null);

		// iniciar com a tela cheia
		// setExtendedState(JFrame.MAXIMIZED_BOTH);

		// atualizar data
		atualizarData();

	} // FIM DO CONSTRUTOR

	// Função (método) para atualizar a data do sistema
	private void atualizarData() {

		// obter data do systema operacional
		LocalDate hoje = LocalDate.now();
		// formatar data
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// alterar o texto de lblData
		lblData.setText(hoje.format(formato));
	}
}// FIM DA CLASSE MAIN (PRINCIPAL)
