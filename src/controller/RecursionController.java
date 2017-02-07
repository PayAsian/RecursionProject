package controller;

import javax.swing.JOptionPane;

import model.RecursionTool;
import view.RecursionFrame;

public class RecursionController 
{
public void start()
{
	JOptionPane.showMessageDialog(baseFrame, "look we are doing math");
}

private RecursionFrame baseFrame;
private RecursionTool mathTool;

public RecursionController()
{
	this.mathTool = new RecursionTool();
	this.baseFrame = new RecursionFrame(this);
	
}

public String transferFactorial(String input)
{
	String factorialInfo = "The factorial of " + input + " is ";
	
	if(isValid(input))
	{
		factorialInfo += mathTool.calculateFactorial(Double.parseDouble(input));
	}
	
	return factorialInfo;
}

private boolean isValid(String testValue)
{
	try
	{
		double test = Double.parseDouble(testValue);
		if(test >= 0)
		{
		return true;	
		}
		else
		{
			return false;
		}
	}
	catch(NumberFormatException error)
	{
		JOptionPane.showMessageDialog(baseFrame, "Type in a valic number >= 0");
		return false;
	}
}
}
