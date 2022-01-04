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
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import cse470.Model.*;
import cse470.Controller.*;
public class SolidTheme extends DefaultMetalTheme {

	public String getName() {

		return "Inside Solid";
	}

	private final ColorUIResource primary1 = new ColorUIResource(0, 0, 0);
	private final ColorUIResource primary2 = new ColorUIResource(220, 220, 220);
	private final ColorUIResource primary3 = new ColorUIResource(230, 230, 230);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}

