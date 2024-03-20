

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
