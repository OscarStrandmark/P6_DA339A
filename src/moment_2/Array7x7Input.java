package moment_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.*;

public class Array7x7Input extends JFrame {

	public Array7x7Input() {
		setLayout(new BorderLayout());
		
		JPanel centerPane = new JPanel(new GridLayout(2, 1));
		
		JPanel centerNorthPane = new JPanel(new GridLayout(3,1));
		
		JPanel CNNPane = new JPanel(new GridLayout(1,2));
		
		JLabel colNbr = new JLabel("Column nbr:");
		JTextField JTFNorth = new JTextField();
		CNNPane.add(colNbr);
		CNNPane.add(JTFNorth);
		
		JButton CNCBtn = new JButton("Read column");
		JButton CNSBtn = new JButton("Write column");
		
		centerNorthPane.add(CNNPane);
		centerNorthPane.add(CNCBtn);
		centerNorthPane.add(CNSBtn);
		
		JPanel centerSouthPane = new JPanel(new GridLayout(3,1));
		
		JPanel CSNPane = new JPanel(new GridLayout(1,2));
		
		JLabel rowNbr = new JLabel("Row nbr:");
		JTextField JTFSouth = new JTextField();
		CSNPane.add(rowNbr);
		CSNPane.add(JTFSouth);
		
		JButton CSCBtn = new JButton("Read row");
		JButton CSSBtn = new JButton("Write row");
		
		centerSouthPane.add(CSNPane);
		centerSouthPane.add(CSCBtn);
		centerSouthPane.add(CSSBtn);
		
		centerPane.add(centerNorthPane);
		centerPane.add(centerSouthPane);
		
		//centerPane.setPreferredSize(new Dimension(500,300));
		add(centerPane,BorderLayout.CENTER);
		JPanel eastPane = new JPanel(new GridLayout(7,1));
		
		JTextField JTFE1 = new JTextField();
		JTextField JTFE2 = new JTextField();
		JTextField JTFE3 = new JTextField();
		JTextField JTFE4 = new JTextField();
		JTextField JTFE5 = new JTextField();
		JTextField JTFE6 = new JTextField();
		JTextField JTFE7 = new JTextField();

		
		eastPane.add(JTFE1);
		eastPane.add(JTFE2);
		eastPane.add(JTFE3);
		eastPane.add(JTFE4);
		eastPane.add(JTFE5);
		eastPane.add(JTFE6);
		eastPane.add(JTFE7);

		eastPane.setPreferredSize(new Dimension(40, 250));
		
		add(eastPane, BorderLayout.EAST);
		JPanel southPane = new JPanel(new BorderLayout());
		
		JPanel JTFSPanel = new JPanel(new GridLayout(1,7));
		JTextField JTFS1 = new JTextField();
		JTextField JTFS2 = new JTextField();
		JTextField JTFS3 = new JTextField();
		JTextField JTFS4 = new JTextField();
		JTextField JTFS5 = new JTextField();
		JTextField JTFS6 = new JTextField();
		JTextField JTFS7 = new JTextField();

		JTFSPanel.add(JTFS1);
		JTFSPanel.add(JTFS2);
		JTFSPanel.add(JTFS3);
		JTFSPanel.add(JTFS4);
		JTFSPanel.add(JTFS5);
		JTFSPanel.add(JTFS6);
		JTFSPanel.add(JTFS7);
		JTFSPanel.setPreferredSize(new Dimension(250,0));
		
		JPanel paddingSouth = new JPanel();
		paddingSouth.setPreferredSize(new Dimension(40,40));
		
		southPane.add(JTFSPanel,BorderLayout.CENTER);
		southPane.add(paddingSouth,BorderLayout.EAST);
		
		add(southPane, BorderLayout.SOUTH);
	}
}
