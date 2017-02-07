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

public String transerFactorial(String input)
{
	String factorialInfo = "The factorial of " + input + " is ";
	
	if(isValid(input))
	{
		factorialInfo += mathTool.calculateFactorial(Integer.parseInt(input));
	}
	
	return factorialInfo;
}

private boolean isValid(String testValue)
{
	try
	{
		int test = Integer.parseInt(testValue);
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
