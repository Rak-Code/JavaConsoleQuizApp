package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/quiz_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Rak@1411"; 

    public static Connection connect() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void saveScore(String userName, int score) {
        String query = "INSERT INTO quiz_scores (user_name, score) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userName);
            stmt.setInt(2, score);
            stmt.executeUpdate();
            System.out.println("Score saved to the database successfully!");
        } catch (Exception e) {
            System.err.println("Error saving score: " + e.getMessage());
        }
    }
}

