

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    Property property1;
    Property property2;
    User client1;
    User client2;
    User seller1;
    User seller2;
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp(){
        this.property1 = new Property("T3 Monte Belo", 150000.0);
        this.property2 = new Property("T7 Monte Belo", 1500000.0);
        this.client1 = new User("José Manuel","911111111","zemanel@yahoo.com");
        this.client2 = new User("António Francisco","922222222","tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testProperty(){
        assertEquals("T3 Monte Belo",property1.getDescription()); 
        assertEquals(150000.0,property1.getPrice());
    }
    
    @Test
    public void testToString(){
        assertEquals("Descricao : " + "T3 Monte Belo" +  "/n" + "Preco     : "+ 150000.0 + " Euros",property1.toString());
    }
    
}
