

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    User client1;
    User client2;
    User seller1;
    User seller2;
    Company company1;
    Property property1;
    Property property2;
    Sell sell1;
    Sell sell2;
    
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        company1 = new Company();
        property1 = new Property("Casa do zé", 15000000.0);
        client1 = new User("José Manuel","911111111","zemanel@yahoo.com");
        client2 = new User("António Francisco","922222222","tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
        this.sell1 = new Sell(client1, seller1, property1);
        this.sell2 = new Sell(client2, seller2, property2);
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
    public void testConstructor(){
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSellers());
        assertNotNull(company1.getProperties());
        assertNotNull(company1.getSells());
    }
    
    @Test
    public void testRegisterClient(){
        assertTrue(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients(){
        assertTrue(company1.registerClient(client1));
        assertTrue(company1.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(company1.registerClient(client1));
        assertFalse(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertFalse(company1.registerClient(null));
    }
    
    
    
    
    @Test
    public void testRegisterSeller(){
        assertTrue(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        assertTrue(company1.registerSeller(seller1));
        assertFalse(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertFalse(company1.registerSeller(null));
    }
    
    
    @Test
    public void testRegisterProperty(){
        assertTrue(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterPropertyDuplicate(){
        assertTrue(company1.registerProperty(property1));
        assertFalse(company1.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyNull(){
        assertFalse(company1.registerProperty(null));
    }
    
    @Test
    public void testCreateSell(){
        assertTrue(company1.createSell(sell1.getClient(),sell1.getSeller(),sell1.getProperty()));
    }
    
    @Test
    public void testCalculateSellsOfTheYear(){
        company1.createSell(sell1.getClient(),sell1.getSeller(),sell1.getProperty());
        company1.createSell(sell2.getClient(),sell2.getSeller(),sell2.getProperty());
        assertEquals(2,company1.calculateSellsOfTheYear(2024));
    }
}
