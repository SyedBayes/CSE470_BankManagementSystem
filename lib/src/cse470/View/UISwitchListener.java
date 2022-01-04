/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse470.View;

/**
 *
 * @author Simon Biswas Prince
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.beans.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import cse470.Model.*;
import cse470.Controller.*;
/**
  * This class listens for UISwitches, and updates a given component.
  *
  * @version 1.4 04/23/99
  * @author Steve Wilson
  */
public class UISwitchListener implements PropertyChangeListener {
    JComponent componentToSwitch;

    public UISwitchListener(JComponent c) {
        componentToSwitch = c;
    }

    public void propertyChange(PropertyChangeEvent e) {
        String name = e.getPropertyName();
	if (name.equals("lookAndFeel")) {
	    SwingUtilities.updateComponentTreeUI(componentToSwitch);
	    componentToSwitch.invalidate();
	    componentToSwitch.validate();
	    componentToSwitch.repaint();
	}
    }
}
