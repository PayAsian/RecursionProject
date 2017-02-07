package view;

import controller.RecursionController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JTextArea RecDisplay;
	private JTextField RecField;
	private JButton FibButton;
	private JButton FactButton;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		RecDisplay = new JTextArea(5, 25);
		RecField = new JTextField(25);
		FibButton = new JButton("LIES");
		FactButton = new JButton("THETRUTH");
		
		
		
		setupRecDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupRecDisplay() 
	{
		RecDisplay.setEditable(false);
		RecDisplay.setEnabled(false);
		RecDisplay.setLineWrap(true);
		RecDisplay.setWrapStyleWord(true);
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(RecDisplay);
		this.add(FibButton);
		this.add(FactButton);
		this.add(RecField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, RecField, 22, SpringLayout.SOUTH, RecDisplay);
		baseLayout.putConstraint(SpringLayout.WEST, RecField, 0, SpringLayout.WEST, RecDisplay);
		baseLayout.putConstraint(SpringLayout.EAST, RecField, 0, SpringLayout.EAST, RecDisplay);
		baseLayout.putConstraint(SpringLayout.NORTH, RecDisplay, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, RecDisplay, 57, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, FibButton, 57, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, FibButton, -84, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, FactButton, 187, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, FactButton, -93, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		FactButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent click)
				{
					RecDisplay.setText(baseController.transferFactorial(RecField.getText()));
				}
		});
		FibButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					RecDisplay.setText(baseController.transferFibonacci(RecField.getText()));
				}
			});
			}
	}


