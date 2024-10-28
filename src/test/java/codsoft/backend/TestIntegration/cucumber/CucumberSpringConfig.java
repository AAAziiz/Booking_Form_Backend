package codsoft.backend.TestIntegration.cucumber;

import codsoft.backend.BackendApplication;
import codsoft.backend.TestIntegration.cucumber.config.DatabaseCleanup;
import codsoft.backend.TestIntegration.cucumber.config.IntegrationTest;

import codsoft.backend.TestIntegration.cucumber.config.MySqlTestContainer;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@CucumberContextConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/FeatureFiles")
@SpringBootTest(classes = { BackendApplication.class, DatabaseCleanup.class, MySqlTestContainer.class})
@ActiveProfiles("cucumber")
@IntegrationTest
public class CucumberSpringConfig {


}
