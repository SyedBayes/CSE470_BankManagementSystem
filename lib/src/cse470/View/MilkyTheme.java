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
public class MilkyTheme extends DefaultMetalTheme {

	public String getName () {

		 return "Worthable Milky";

	}

	private final ColorUIResource primary1 = new ColorUIResource(0, 0, 0);
	private final ColorUIResource primary2 = new ColorUIResource(235, 235, 235);
	private final ColorUIResource primary3 = new ColorUIResource(250, 250, 250);
	private final ColorUIResource secondary2 = new ColorUIResource(204, 204, 204);
	private final ColorUIResource secondary3 = new ColorUIResource(250, 250, 250);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }
	protected ColorUIResource getSecondary2() { return secondary2; }
	protected ColorUIResource getSecondary3() { return secondary3; }

}