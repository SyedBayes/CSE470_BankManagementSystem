/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import cse470.Model.DeleteCustomer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Syed Bayes Iqbal
 */
public class DeleteCustomerTest {
    
    public DeleteCustomerTest() {
    }

 
    @Test
    public void testDeleteRecord() {
        DeleteCustomer  h = new DeleteCustomer();
	assertEquals(true, h.deleteRecord("1030"));
    }
}