/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import cse470.Model.DepositMoney;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Syed Bayes Iqbal
 */
public class DepositMoneyTest {
    public DepositMoneyTest(){
    }
   
   
    

    

//    @Test
//    public void testViewAmount(){
//        DepositMoney d= new DepositMoney();
//	Assert.assertEquals(5500, d.viewAmount("1020"));
//    }
    
    @Test
        public void testEditRecordDeposit(){
            DepositMoney d= new DepositMoney();
                d.editRecordDeposit("1020", 500);
                assertEquals(7000, d.viewAmount("1020"));
    }
}
