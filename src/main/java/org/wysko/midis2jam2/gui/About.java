/*
 * Copyright (C) 2021 Jacob Wysko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://www.gnu.org/licenses/.
 */

/*
 * Created by JFormDesigner on Wed Jun 30 12:30:26 EDT 2021
 */

package org.wysko.midis2jam2.gui;

import org.wysko.midis2jam2.Midis2jam2;
import org.wysko.midis2jam2.util.Utils;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ResourceBundle;

import static org.wysko.midis2jam2.util.Utils.exceptionToLines;

/**
 * Displays information about midis2jam2.
 *
 * @author Jacob Wysko
 */
@SuppressWarnings({"java:S1213", "FieldCanBeLocal", "java:S1450"})
public class About extends JDialog {
	
	public About() {
		initComponents();
	}
	
	public About(Frame owner, boolean modal) {
		super(owner, modal);
		initComponents();
	}
	
	/**
	 * Opens a hyperlink in the default browser.
	 *
	 * @param hle the hyperlink event
	 */
	private static void hyperlinkUpdate(HyperlinkEvent hle) {
		if (HyperlinkEvent.EventType.ACTIVATED.equals(hle.getEventType())) {
			try {
				Desktop.getDesktop().browse(hle.getURL().toURI());
			} catch (IOException | URISyntaxException ex) {
				Midis2jam2.getLOGGER().warning(() -> "Could not open page.\n" + exceptionToLines(ex));
			}
		}
	}
	
	@SuppressWarnings("all")
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("i18n.about");
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		websiteLink = new JEditorPane();
		copyrightInfo = new JLabel();
		licenseInfo = new JEditorPane();
		
		//======== this ========
		setTitle(bundle.getString("About.this.title"));
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		//======== panel1 ========
		{
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout) panel1.getLayout()).columnWidths = new int[]{683, 0};
			((GridBagLayout) panel1.getLayout()).rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout) panel1.getLayout()).columnWeights = new double[]{1.0, 1.0E-4};
			((GridBagLayout) panel1.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			
			//---- label1 ----
			label1.setIcon(new ImageIcon(getClass().getResource("/rounded.png")));
			panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(15, 0, 5, 0), 0, 0));
			
			//---- label2 ----
			label2.setText("midis2jam2");
			label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
			panel1.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 0), 0, 0));
			
			//---- label3 ----
			label3.setText("vX.X.X");
			panel1.add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 0), 0, 0));
			
			//---- label4 ----
			label4.setText(bundle.getString("About.what_is_midis2jam2"));
			panel1.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 0), 0, 0));
			
			//---- websiteLink ----
			websiteLink.setBackground(UIManager.getColor("darcula.background"));
			websiteLink.setContentType("text/html");
			websiteLink.setText(bundle.getString("About.websiteLink.text"));
			websiteLink.setEditable(false);
			websiteLink.setOpaque(false);
			panel1.add(websiteLink, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 0), 0, 0));
			
			//---- copyrightInfo ----
			copyrightInfo.setText("<html>\n<div style=\"text-align:center;\">\nCopyright \u00a9 2021 Jacob Wysko<br/>\n<small>Some assets Copyright \u00a9 2007 Scott Haag (used with permission)</small>\n</div>\n</html>");
			copyrightInfo.setFont(copyrightInfo.getFont().deriveFont(copyrightInfo.getFont().getSize() - 2f));
			panel1.add(copyrightInfo, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 5, 0), 0, 0));
			
			//---- licenseInfo ----
			licenseInfo.setBackground(UIManager.getColor("darcula.background"));
			licenseInfo.setContentType("text/html");
			licenseInfo.setText("<html>\n<div style=\"text-align:center\">\nThis program comes with absolutely no warranty.<br/>\nSee the <a href=\"https://www.gnu.org/licenses/gpl-3.0.en.html\">GNU General Public License, version 3</a> for details.\n</div>\n</html>\n\n");
			licenseInfo.setEditable(false);
			licenseInfo.setOpaque(false);
			panel1.add(licenseInfo, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
					new Insets(0, 0, 15, 0), 0, 0));
		}
		contentPane.add(panel1, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		
		
		// Set version number
		
		var version = Utils.resourceToString("/version.txt");
		label3.setText("v" + version);
		
		licenseInfo.addHyperlinkListener(About::hyperlinkUpdate);
		websiteLink.addHyperlinkListener(About::hyperlinkUpdate);
	}
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel panel1;
	
	private JLabel label1;
	
	private JLabel label2;
	
	private JLabel label3;
	
	private JLabel label4;
	
	private JEditorPane websiteLink;
	
	private JLabel copyrightInfo;
	
	private JEditorPane licenseInfo;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}