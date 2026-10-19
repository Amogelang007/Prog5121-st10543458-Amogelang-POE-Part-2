/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */


public class MessageTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testValidNumber(){
        Message m = new Message(0, "+27718693002", "Hi");
        assertTrue(m.checkRecipientCell().contains("sucessfully"));
    }
    
    @Test
    public void testInvalidNumber(){
        Message m = new Message(0, "0718693002", "Hi");
        assertTrue(m.checkRecipientCell().contains("incorrectly"));
    }

    @Test
    public void testShortMessage(){
        Message m = new Message(0, "+27718693002", "Hello");
        assertEquals("Message ready to send.", m.checkMessage());
    }
    
    @Test
    public void testSendOption(){
        Message m = new Message(0, "+27718693002", "Hi");
        assertEquals("Message successfully sent.", m.SentMessage(1));
    }

    /**
     * Test of makeId method, of class Message.
     */
    @org.junit.Test
    public void testMakeId() {
       System.out.println("makeId");
       Message instance = new Message(0, "+2718693002", "Test");
       String result = instance.makeId();
       String expResult = result;
       assertEquals(expResult, result);
    }
    /**
     * Test of checkMessageID method, of class Message.
     */
    @org.junit.Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = new Message(0, "+27718693002", "Hi");
        boolean result = instance.checkMessageID();
        boolean expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @org.junit.Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = new Message(0, "+27718693002", "Hi");
        String result = instance.checkRecipientCell();
        String expResult = result;
        assertEquals(expResult, result);
      
    }

    /**
     * Test of checkMessage method, of class Message.
     */
    @org.junit.Test
    public void testCheckMessage() {
        System.out.println("checkMessage");
        Message instance = new Message(0, "+27718693002", "Hi");
        String result = instance.checkMessage();
        String expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of makeHash method, of class Message.
     */
    @org.junit.Test
    public void testMakeHash() {
        System.out.println("makeHash");
        Message instance = new Message(0, "+2718693002", "Hi");
        String result = instance.makeHash();
        String expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @org.junit.Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = new Message(0, "+2718693002", "Hi");
        String result = instance.createMessageHash();
        String expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SentMessage method, of class Message.
     */
    @org.junit.Test
    public void testSentMessage() {
        System.out.println("SentMessage");
        int choice = 0;
        Message instance = new Message(0, "+2718693002", "Hi");
        String result = instance.SentMessage(choice);
        String expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @org.junit.Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Message instance = new Message(0, "+2718693002", "Hi");
        String result = instance.printMessages();
        String expResult = result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTotalMessagess method, of class Message.
     */
    @org.junit.Test
    public void testReturnTotalMessagess() {
        System.out.println("returnTotalMessagess");
        Message instance = new Message(0, "+2718693002", "Hi");
        int result = instance.returnTotalMessagess();
        int expResult = result;
        assertEquals(expResult, result);
       
    }

    /**
     * Test of showFull method, of class Message.
     */
    @org.junit.Test
    public void testShowFull() {
        System.out.println("showFull");
        Message instance = new Message(0, "+2718693002", "Hi");
        instance.showFull();
        
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @org.junit.Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = new Message(0, "+2718693002", "Hi");
        instance.storeMessage();
      
    }
}