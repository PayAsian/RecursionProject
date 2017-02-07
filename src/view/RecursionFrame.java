package view;

import javax.swing.JFrame;
import java.awt.Dimension;
import controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel appPanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RecursionPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
}
