package codsoft.backend.TestIntegration.cucumber;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import codsoft.backend.dtos.SignupRequest;
import codsoft.backend.dtos.UserDTO;
import codsoft.backend.models.User;
import codsoft.backend.repositories.UserRepository;
import codsoft.backend.services.AuthService;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;


@Testcontainers
@SpringBootTest

public class UserAccountManagementSteps {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private AuthService authService;
    User  existingUser;
    UserDTO existingUserDTO;

    @ParameterType(".*")
    public String name(String value) {
        return value;
    }
    @ParameterType(".*")
    public String email(String value) {
        return value;
    }
    @ParameterType(".*")
    public String password(String value) {
        return value;
    }
    @ParameterType(".*")
    public String username(String value) {
        return value;
    }
    @ParameterType(".*")
    public String userEmail(String value) {
        return value;
    }
    @ParameterType(".*")
    public String userPassword(String value) {
        return value;
    }


    // Scenario 1: Add a new user with valid information
    @When(value = "a sign-up request is sent for a new user with name {name}, email {email}, and password {password}")
    public void signUpRequest_SentForNewUser(String name, String email, String password) throws Throwable{
        SignupRequest newUser = new SignupRequest();
        newUser.setEmail(email);
        newUser.setName(name);
        newUser.setPassword(password);
        existingUserDTO= authService.createUser(newUser);
        System.out.println("UserDTO: " + existingUserDTO);
    }

    @Then(value = "the new user with email {email} is successfully registered and appears in the user list")
    public void verifyUserIsRegistered(String email)throws Throwable {
        System.out.println("UserDTO: " + existingUserDTO);
        existingUser = userRepo.findByEmail(email);
        System.out.println("Existing User: " + existingUser);
        assertNotNull(existingUser);
        assertTrue(userRepo.findAll().contains(existingUser), "User should be registered.");
    }


    // Scenario 2: Add a new user with invalid information (name, email, password already exist)
    @When("a sign-up request is sent for a new user with username {username}, email {userEmail}, and Password{userPassword}")
    public void signUpRequest_SentFor_NewUser(String name, String email,String password) throws Throwable{
        SignupRequest newUser = new SignupRequest();
        newUser.setEmail(email);
        newUser.setName(name);
        newUser.setPassword(password);
        existingUserDTO= authService.createUser(newUser);
        System.out.println("UserDTO: " + existingUserDTO);
    }

    @Then("the sign-up should be rejected due to the uniqueness constraint of the name, email and id combination")
    public void verifySignUpRejectedForDuplicateUser() throws Throwable{
        assertNull(existingUserDTO);
    }


}
