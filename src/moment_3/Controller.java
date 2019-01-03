package moment_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import moment_1.Array7;
import moment_1.Array7x7;

public class Controller implements ActionListener, DocumentListener {

	private Test2UI ui;
	private Array7x7 currentArray;
	private Array7 leftColumn = new Array7();
	private Array7 rightColumn = new Array7();
	
	public Controller(Test2UI ui, Array7x7 array) {
		this.ui = ui;
		currentArray = array;
		
		ui.updateInterface(array.toIntArray());
	}
	
	// Initierar Lyssnare
	public void initController() {
		ui.getShiftLeftBtn().addActionListener(this);
		ui.getShiftRightBtn().addActionListener(this);
		
		for(int i = 0; i < ui.getLeftTxtFldCol().length; i++) {
			ui.getLeftTxtFldCol()[i].getDocument().addDocumentListener(this);
			ui.getRightTxtFldCol()[i].getDocument().addDocumentListener(this);
		}
	}
	
	// Metoder för alla Listeners: 
	public void insertUpdate(DocumentEvent e) {
		if( e.getDocument().getProperty("columnArray") == ui.getLeftTxtFldCol()) {
			for (int i = 0; i < ui.getLeftTxtFldCol().length; i++) {
				leftColumn.setElement(i, Integer.parseInt(ui.getLeftTxtFldCol()[i].getText()));  
			}
		}
		else {
			for (int i = 0; i < ui.getRightTxtFldCol().length; i++) {
				rightColumn.setElement(i, Integer.parseInt(ui.getRightTxtFldCol()[i].getText()));  
			}		
		}
	}

	public void removeUpdate(DocumentEvent e) {
		if( e.getDocument().getProperty("columnArray") == ui.getLeftTxtFldCol()) {
			
			for (int i = 0; i < ui.getLeftTxtFldCol().length; i++) {
				try {
					leftColumn.setElement(i, Integer.parseInt(ui.getLeftTxtFldCol()[i].getText()));
				}
				catch(NumberFormatException exc) {
				}
			}
		}
		else {
			try {
				for (int i = 0; i < ui.getRightTxtFldCol().length; i++) {
					rightColumn.setElement(i, Integer.parseInt(ui.getRightTxtFldCol()[i].getText()));  
				}
			}
			catch (NumberFormatException exc) {
			}
		}		
	}

	
	public void changedUpdate(DocumentEvent e) {
		if( e.getDocument().getProperty("columnArray") == ui.getLeftTxtFldCol()) {
			
			for (int i = 0; i < ui.getLeftTxtFldCol().length; i++) {
				leftColumn.setElement(i, Integer.parseInt(ui.getLeftTxtFldCol()[i].getText()));  
			}
		}
		else {
			
			for (int i = 0; i < ui.getRightTxtFldCol().length; i++) {
				rightColumn.setElement(i, Integer.parseInt(ui.getRightTxtFldCol()[i].getText()));  
			}		
		}		
	}

	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == ui.getShiftLeftBtn()) {
			leftColumn = currentArray.shiftLeft(rightColumn);
			ui.updateInterface(currentArray.toIntArray());
			ui.resetTextFieldColumns();
		}
		else {
			rightColumn = currentArray.shiftRight(leftColumn);
			ui.updateInterface(currentArray.toIntArray());
			ui.resetTextFieldColumns();
		}
	}
}
