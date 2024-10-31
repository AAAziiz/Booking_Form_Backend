package codsoft.backend.TestIntegration.cucumber.config;

import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
public class DatabaseCleanup {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void clearDatabase() {
        System.out.println("Clearing the users table...");
        jdbcTemplate.execute("TRUNCATE TABLE users"); // Adjust the table name if necessary
    }
}