package it.betalent.corso;

import java.sql.*;
import java.util.Properties;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException {

		//Infomrazioni di connessione dentro properties (siamo costretti per via della Timezone)
		Properties properties = new Properties();

		String url = "jdbc:mysql://localhost:3306/libri";
		properties.put("user", "root");
		properties.put("password", "root");
		properties.put("serverTimezone", "UTC");

		//connessione con try-with-resources (notare che ce ne sono tre)
		try(Connection connection = DriverManager.getConnection(url, properties)) {

			connection.setAutoCommit(false);

			//Creazione dell'oggetto statement
			try(Statement statement = connection.createStatement()) {

//SEZIONE CREAZIONE - executeUpdate()

				String insert = "insert into autori (nome, cognome, genere_preferito) values('Marcello', 'Simoni', 'Storico')";
				int result1 = statement.executeUpdate(insert);
				System.out.println("RESULT:" + result1);

//SEZIONE LETTURA - executeQuery()

				//Stringa con il comando
				String query1 = "select * from autori";


				//Il resultSet raccoglie i dati in righe (ognuno dei next) e accede alle colonne 
				//con il get+tipo di dato nella colonna

				ResultSet result2 = statement.executeQuery(query1);
				System.out.println("RISULTATO LETTURA:");
				while(result2.next()) {
					//Passare in ingresso il nome della colonna
					int id = result2.getInt("ID");
					String nome = result2.getString("nome"); 
					String cognome  = result2.getString ("cognome");
					String generePreferito = result2.getString("genere_Preferito");
					System.out.println(nome + " " + cognome + " " + generePreferito);
				}
				 			
			}

			System.out.println();

//SEZIONE MODIFICA (UPDATE - DELETE) - executeUpdate()   

			//update = "update autori set nome=Robert , cognome=Sawyer where id=2";
			String update = "update autori set nome=?, cognome=? where id=?";

			try(PreparedStatement preparedStatement = connection.prepareStatement(update)) {

				preparedStatement.setString(1, "Alessandro");
				preparedStatement.setString(2, "Manzoni");
				preparedStatement.setInt(3, 2);

				//Questo metodo esegue la query e restituisce anche il numero di righe modificate
				int righeModificate = preparedStatement.executeUpdate();
				System.out.println("Righe modificate: " + righeModificate);

				connection.commit();

			} catch (Exception e) {
				connection.rollback();
				System.out.println("Eseguito un rollback");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}