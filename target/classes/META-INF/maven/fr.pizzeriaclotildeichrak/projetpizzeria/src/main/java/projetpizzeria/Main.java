package projetpizzeria;


import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection connection = dbConnection.connect();

        if (connection != null) {
        	 new PageAcceuil().setVisible(true);
            System.out.println("Application Pizzeria d�marr�e avec succ�s !");
        } else {
            System.out.println("�chec de la connexion � la base de donn�es.");
        }
    }
}