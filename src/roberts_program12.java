
public class roberts_program12 {
	
	private static int width = 700;
	private static int height = 350;
	private static int width2 = 350;
	public static void main(String[] args) {
		
		// frame
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setPreferredSize(new java.awt.Dimension(width, height));
		frame.setMinimumSize(new java.awt.Dimension(width, height));
		frame.setMaximumSize(new java.awt.Dimension(width, height));
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		// menu bar
		javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
		
		// file menu
		javax.swing.JMenu fileMenu = new javax.swing.JMenu("File");
		menuBar.add(fileMenu);
		
		// file menu items 
		javax.swing.JMenuItem fileReadSortFile = new javax.swing.JMenuItem("Read sort file");
		javax.swing.JMenuItem fileReadSearchFile = new javax.swing.JMenuItem("Read search file");
		javax.swing.JMenuItem fileExit = new javax.swing.JMenuItem("Exit");
		
		fileMenu.add(fileReadSortFile);
		fileMenu.add(fileReadSearchFile);
		fileMenu.add(fileExit);
		
		// file menu action listeners
		MenuItemActionListener fileExitMenuItemActionListner = new MenuItemActionListener(fileExit);
		MenuItemActionListener fileReadSortFileMenuItemActionListener = new MenuItemActionListener(fileReadSortFile);
		MenuItemActionListener fileReadSearchFileMenuItemActionListner = new MenuItemActionListener(fileReadSearchFile);
		
		fileReadSearchFile.addActionListener(fileReadSearchFileMenuItemActionListner);
		fileReadSortFile.addActionListener(fileReadSortFileMenuItemActionListener);
		fileExit.addActionListener(fileExitMenuItemActionListner);
		
		// left button panel
		javax.swing.JPanel leftButtonPanel = new javax.swing.JPanel();
		leftButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0, 255), 2));
		leftButtonPanel.setPreferredSize(new java.awt.Dimension(width2, height));
		leftButtonPanel.setMinimumSize(new java.awt.Dimension(width2, height));
		java.awt.GridBagLayout leftGridBagLayout = new java.awt.GridBagLayout();
		leftButtonPanel.setLayout(leftGridBagLayout);
		
		// right button panel
		javax.swing.JPanel rightButtonPanel = new javax.swing.JPanel();
		rightButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0, 255), 2));

		rightButtonPanel.setPreferredSize(new java.awt.Dimension(width2, height));
		rightButtonPanel.setMinimumSize(new java.awt.Dimension(width2, height));
		java.awt.GridBagLayout rightGridBagLayout = new java.awt.GridBagLayout();
		rightButtonPanel.setLayout(rightGridBagLayout);
		
		// main panel
		javax.swing.JPanel mainButtonPanel = new javax.swing.JPanel();
		mainButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 2, 255), 2));
		javax.swing.BoxLayout boxLayout = new javax.swing.BoxLayout(mainButtonPanel, javax.swing.BoxLayout.X_AXIS);
		mainButtonPanel.setLayout(boxLayout);
		mainButtonPanel.add(leftButtonPanel);
		mainButtonPanel.add(rightButtonPanel);
		
		javax.swing.JPanel mainPanel = new javax.swing.JPanel();
		mainPanel.setLayout(new java.awt.BorderLayout());
		mainPanel.add(menuBar, java.awt.BorderLayout.NORTH);
		mainPanel.add(mainButtonPanel, java.awt.BorderLayout.CENTER);
		
		frame.setContentPane(mainPanel);
		frame.validate();
		frame.setVisible(true);
	}
	
	static class MenuItemActionListener implements java.awt.event.ActionListener
	{
		// the menu item associated with the action listener, so that we can
		// share this one class with multiple menu items
		private javax.swing.JMenuItem m;
		
		MenuItemActionListener(javax.swing.JMenuItem m)
		{
			this.m = m;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + m.getText() + " menu item");
			
			// if exit is selected from the file menu, exit the program
			if( m.getText().toLowerCase().equals("exit") )
			{
				
				System.exit(0);
			}
			if( m.getText().toLowerCase().equals("read sort file") )
			{
				
				System.out.println("read sort file");
			}
			if( m.getText().toLowerCase().equals("read search file") )
			{
				
				System.out.println("read search file");
			}
		}
	}
	
	static class ButtonActionListener implements java.awt.event.ActionListener
	{
		// the button associated with the action listener, so that we can
		// share this one class with multiple buttons
		private javax.swing.JButton b;
		
		ButtonActionListener(javax.swing.JButton b)
		{
			this.b = b;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + b.getText() + " button");
		}
	}

}
