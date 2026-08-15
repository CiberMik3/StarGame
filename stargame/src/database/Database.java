package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	// Informações do banco de dados
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbstargame";
	private String user = "root";
	private String password = "";

	// metodo (função) para conectar o banco
	public Connection conectar() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password); // abre uma conexão com o branco
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// metodo para testar a conexão (status de conexão)
	public boolean testarConexao() {

		// a linah abaixo cria o objeto con que e responsavel pro estabelecer a conexão
		// com o banco
		Connection con = conectar();

		// se nao conseguir estabelecer a conexão
		if (con == null) {
			return false;
		}

		// na tentativa de dehcar aconexão
		try {
			con.close(); // encerrar a conexão apos o teste
			return true;// retorno verdadeiro para Main
		} catch (Exception e) {
			// se nao conseguir fechar a conexão
			System.out.println(e);
			return false;
		}
	}

}
