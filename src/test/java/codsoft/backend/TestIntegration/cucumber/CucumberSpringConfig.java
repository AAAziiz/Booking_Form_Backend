package codsoft.backend.TestIntegration.cucumber;
import codsoft.backend.BackendApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import jakarta.annotation.PostConstruct;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest(classes = BackendApplication.class)
@CucumberContextConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/FeatureFiles")
@ActiveProfiles("cucumber")
public class CucumberSpringConfig {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @BeforeClass
    public void setUp() {
        truncateUsersTable();
    }

    private void truncateUsersTable() {
        jdbcTemplate.execute("TRUNCATE TABLE users;");
    }


}
