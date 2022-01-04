/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse470.View;
import cse470.Model.*;
import cse470.Controller.*;
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
import java.io.*;
import java.util.*;

public class PropertiesMetalTheme extends DefaultMetalTheme {

	private String name = "Custom Theme";
	private ColorUIResource primary1;
	private ColorUIResource primary2;
	private ColorUIResource primary3;
	private ColorUIResource secondary1;
	private ColorUIResource secondary2;
	private ColorUIResource secondary3;
	private ColorUIResource black;
	private ColorUIResource white;

	public PropertiesMetalTheme ( InputStream stream ) {

		initColors();
		loadProperties(stream);

	}

	private void initColors() {

		primary1 = super.getPrimary1();
		primary2 = super.getPrimary2();
		primary3 = super.getPrimary3();
		secondary1 = super.getSecondary1();
		secondary2 = super.getSecondary2();
		secondary3 = super.getSecondary3();
		black = super.getBlack();
		white = super.getWhite();

	}

	private void loadProperties (InputStream stream) {

		Properties prop = new Properties();		
		try {
			prop.load(stream);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		Object tempName = prop.get("name");
		if (tempName != null) {
			name = tempName.toString();
		}
		Object colorString = null;
		colorString = prop.get ("primary1");		
		if (colorString != null){
			primary1 = parseColor(colorString.toString());
		}
		colorString = prop.get("primary2");
		if (colorString != null) {
			primary2 = parseColor(colorString.toString());
		}
		colorString = prop.get("primary3");
		if (colorString != null) {
			primary3 = parseColor(colorString.toString());
		}
		colorString = prop.get("secondary1");
		if (colorString != null) {
			secondary1 = parseColor(colorString.toString());
		}
		colorString = prop.get("secondary2");
		if (colorString != null) {
			secondary2 = parseColor(colorString.toString());
		}
		colorString = prop.get("secondary3");
		if (colorString != null) {
			secondary3 = parseColor(colorString.toString());
		}
		colorString = prop.get("black");
		if (colorString != null) {
			black = parseColor(colorString.toString());
		}
		colorString = prop.get("white");
		if (colorString != null) {
			white = parseColor(colorString.toString());
		}
	}

	public String getName() { return name; }
	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }
	protected ColorUIResource getSecondary1() { return secondary1; }
	protected ColorUIResource getSecondary2() { return secondary2; }
	protected ColorUIResource getSecondary3() { return secondary3; }
	protected ColorUIResource getBlack() { return black; }
	protected ColorUIResource getWhite() { return white; }

	private ColorUIResource parseColor(String s) {
		int red = 0;
		int green = 0;
		int blue = 0;
		try {
			StringTokenizer st = new StringTokenizer(s, ",");
			red = Integer.parseInt(st.nextToken());
			green = Integer.parseInt(st.nextToken());
			blue = Integer.parseInt(st.nextToken());
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Couldn't parse color :" + s);
		}
	
		return new ColorUIResource(red, green, blue);
	}

}