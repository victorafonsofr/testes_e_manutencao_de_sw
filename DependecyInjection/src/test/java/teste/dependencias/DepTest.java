/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste.dependencias;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.dependecyinjection.Usuario;

/**
 *
 * @author afonsvfdeb
 */
public class DepTest {
    
    public DepTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testeStringsNulasOuVazias(){
        Usuario user = new Usuario("sffbs","eihvier@ahcdj","12424g2"); // nome/email/senha
        
        assertNotNull(user.getNome());
        assertNotNull(user.getEmail());
        assertNotNull(user.getSenha());
        
        assertNotEquals("", user.getNome());
        assertNotEquals("", user.getEmail());
        assertNotEquals("", user.getSenha());
    
    }
    
    @Test
    public void CamposValidos(){
        Usuario user = new Usuario("sffbs","eihvie%r@a1_hcdj","12424g2"); 

        //testando o campo nome
        String regex = "^[A-Za-zA-ZÀ-ÿ ]+$"; //o nome só pode ter caracteres comuns e espaços
        Boolean testeNome = user.getNome().matches(regex);
        
        assertEquals(true, testeNome);
        
        //testando email
        regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+$"; //para verificar o email com validação de caracteres de dominio e usuario
        Boolean testeEmail = user.getEmail().matches(regex);
        
        assertEquals(true, testeEmail);
        
    }
    //também poderia fazer com duas funções de teste separadas mas preferi fazer tudo junto

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
