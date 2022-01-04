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
 * @author Simon Biswas Prince
 */
public class WithdrawMoneyTest {
    
    public WithdrawMoneyTest() {
    }
    

  @Test
  public void testEditRecordWithdraw() {
     WithdrawMoney p= new WithdrawMoney();
     p.editRecordWithdraw("4006", 500);
     assertEquals(4800, p.viewAmount("4006"));
	}

}
