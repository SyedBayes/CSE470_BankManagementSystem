/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCode;

import cse470.Model.WithdrawMoney;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Syed Bayes Iqbal
 */
public class WithdrawMoneyTest {
    
    public WithdrawMoneyTest() {
    }
    

  @Test
  public void testEditRecordWithdraw() {
     WithdrawMoney p= new WithdrawMoney();
     p.editRecordWithdraw("1020", 500);
     assertEquals(5500, p.viewAmount("1020"));
	}

}
