import javax.swing.*;
import java.awt.*;

public class roberts_program12 {
	
	private static int width = 700;
	private static int height = 350;
	private static int width2 = 350;
	public static void main(String[] args) {
		// left buttons
		javax.swing.JButton sortIntsButton = new javax.swing.JButton("sort ints");
		javax.swing.JButton addToBSTButton = new javax.swing.JButton("add to bst");
		javax.swing.JButton addToTreeSetButton = new javax.swing.JButton("add to treeset");
		javax.swing.JButton addToPriorityQueueButton = new javax.swing.JButton("add to priority queue");
		javax.swing.JButton addToHashSetButton = new javax.swing.JButton("add to hashset");
		javax.swing.JButton addToArrayListButton = new javax.swing.JButton("add to arraylist");
		javax.swing.JButton addToSortedArrayListButton = new javax.swing.JButton("add to sorted arraylist");
		javax.swing.JButton addToArrayButton = new javax.swing.JButton("add to array");

		// Left labels
		javax.swing.JLabel sortIntsLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel  addToBSTLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToTreeSetLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToPriorityQueueLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToHashSetLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToArrayListLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToSortedArrayListLabel = new javax.swing.JLabel("no result");
		javax.swing.JLabel addToArrayLabel = new javax.swing.JLabel("no result");

		// right buttons
		javax.swing.JButton searchSortedIntsButton = new javax.swing.JButton("search sorted ints");
		javax.swing.JButton searchBSTButton = new javax.swing.JButton("search bst");
		javax.swing.JButton searchTreeSetButton = new javax.swing.JButton("search treeset");
		javax.swing.JButton searchPriorityQueueButton = new javax.swing.JButton("search priority queue");
		javax.swing.JButton searchHashSetButton = new javax.swing.JButton("search hashset");
		javax.swing.JButton searchArrayListButton = new javax.swing.JButton("search arraylist");
		javax.swing.JButton searchSortedArrayList = new javax.swing.JButton("search sorted arraylist");
		javax.swing.JButton searchArrayButton = new javax.swing.JButton("search array");

		// right labels
		javax.swing.JLabel searchSortedIntsLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchBSTLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchTreeSetLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchPriorityQueueLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchHashSetLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchArrayListLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchSortedArrayListLabel = new javax.swing.JLabel();
		javax.swing.JLabel searchArrayLabel = new javax.swing.JLabel();
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
		java.awt.GridBagConstraints leftButtonPanelConstraints = new java.awt.GridBagConstraints();

		leftButtonPanelConstraints.weightx = 1;
		leftButtonPanelConstraints.weighty = 1;
		leftButtonPanelConstraints.fill = GridBagConstraints.NONE;
		leftButtonPanelConstraints.anchor = GridBagConstraints.LINE_START;


		// left buttons gridbag assignments
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 0;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(sortIntsButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 1;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToBSTButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 2;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToTreeSetButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 3;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToPriorityQueueButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 4;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToHashSetButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 5;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToArrayListButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 6;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToSortedArrayListButton, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 7;
		leftButtonPanelConstraints.gridwidth = 1;
		leftGridBagLayout.setConstraints(addToArrayButton, leftButtonPanelConstraints);

		// add left buttons to panel
		leftButtonPanel.add(sortIntsButton);
		leftButtonPanel.add(addToBSTButton);
		leftButtonPanel.add(addToTreeSetButton);
		leftButtonPanel.add(addToPriorityQueueButton);
		leftButtonPanel.add(addToHashSetButton);
		leftButtonPanel.add(addToArrayListButton);
		leftButtonPanel.add(addToSortedArrayListButton);
		leftButtonPanel.add(addToArrayButton);

		// left label gridbag assignment
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 0;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(sortIntsLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 1;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToBSTLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 2;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToTreeSetLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 3;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToPriorityQueueLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 4;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToHashSetLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 5;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToArrayListLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 6;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToSortedArrayListLabel, leftButtonPanelConstraints);

		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 7;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftGridBagLayout.setConstraints(addToArrayLabel, leftButtonPanelConstraints);

		// add left labels to panel
		leftButtonPanel.add(sortIntsLabel);
		leftButtonPanel.add(addToBSTLabel);
		leftButtonPanel.add(addToTreeSetLabel);
		leftButtonPanel.add(addToPriorityQueueLabel);
		leftButtonPanel.add(addToHashSetLabel);
		leftButtonPanel.add(addToArrayListLabel);
		leftButtonPanel.add(addToSortedArrayListLabel);
		leftButtonPanel.add(addToArrayLabel);

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



	//Start of backend
	//DONE
	private static int[] sortValues, searchValues, unsortedValues, sortedValues;
	private static java.util.TreeSet<Integer> treeSetValues = new java.util.TreeSet<>();
	private static java.util.HashSet<Integer> hashSetValues = new java.util.HashSet<>();
	private static java.util.PriorityQueue<Integer> priorityQueueValues = new java.util.PriorityQueue<>();
	private static java.util.ArrayList<Integer> arrayListValues = new java.util.ArrayList<>();
	private static java.util.ArrayList<Integer> sortedArrayListValues = new java.util.ArrayList<>();
	private static roberts_BinarySearchTree bst = new roberts_BinarySearchTree();

	// DONE
	private static int[] selectionSort() {
		int[] valuesCopy = sortValues.clone();
		for (int i = 0; i < valuesCopy.length; i++) {
			for (int j = 0; j < valuesCopy.length; j++) {
				if (valuesCopy[j] < valuesCopy[i]) {
					int temp = valuesCopy[i];
					valuesCopy[i] = valuesCopy[j];
					valuesCopy[j] = temp;
				}
			}
		}
		return valuesCopy;

	}

	//DONE
	private static int searchInts()
	{
		int left = 0;
		int right = sortedValues.length - 1;
		int count = 0;
		for (int searchValue : searchValues) {
			while (left <= right) {
				int middle = (left + right) / 2;
				if (searchValue < sortedValues[middle]) {
					right = middle - 1;
				} else if (searchValue > sortedValues[middle]) {
					left = middle + 1;
				} else {
					count++;
				}
			}
		}
		return count;

	}

	// DONE
	private static void addToBinarySearchTree()
	{
		for (int sortValue : sortValues)
		{
			Node currentNode = new Node(sortValue);
			bst.insertNode(currentNode);
		}
	}
	// DONE
	private static int searchBinarySearchTree()
	{
		int count = 0;
		for (int searchValue : searchValues) {
			if (bst.getNode(bst.getRoot(), searchValue) != null) {
				count++;
			}
		}
		return count;
	}
	// DONE
	private static void addToTreeSet()
	{
		for(int sortValue : sortValues)
		{
			treeSetValues.add(sortValue);
		}
	}
	// DONE
	private static int searchTreeSet()
	{
		int count = 0;
		for(int searchValue : searchValues) {
			if (treeSetValues.contains(searchValue)) {
				count++;
			}
		}
		return count;
	}

	private static void addToHashSet()
	{
		for(int sortValue : sortValues)
		{
			hashSetValues.add(sortValue);
		}
	}
	//DONE
	private static int searchHashSet()
	{
		int count = 0;
		for(int searchValue : searchValues) {
			if (hashSetValues.contains(searchValue)) {
				count++;
			}
		}
		return count;
	}
	// DONE
	private static void addToPriorityQueue()
	{
		for(int sortValue : sortValues)
		{
			priorityQueueValues.add(sortValue);
		}
	}
	//DONE
	private static int searchPriorityQueue()
	{
		int count = 0;
		for (int searchValue : searchValues) {
			if (priorityQueueValues.contains(searchValue)) {
				count++;
			}
		}
		return count;
	}
	// DONE
	private static void addToArrayList()
	{
		for(int sortValue : sortValues)
		{
			arrayListValues.add(sortValue);
		}
	}
	//DONE
	private static int searchArrayList()
	{
		int count = 0;
		for(int searchValue : searchValues) {
			if (arrayListValues.contains(searchValue)) {
				count++;
			}
		}
		return count;
	}
	// DONE
	private static void addToSortedArrayList()
	{
		for (int sortValue : sortValues) {
			sortedArrayListValues.add(sortValue);
		}
		java.util.Collections.sort(sortedArrayListValues);
	}
	//DONE
	private static int searchSortedArrayList()
	{
		int count = 0;
		for(int searchValue : searchValues) {
			if(java.util.Collections.binarySearch(sortedArrayListValues, searchValue) >= 0) {
				count++;
			}
		}
		return count;
	}
	// DONE
	private static void addToArray()
	{
		unsortedValues = sortValues.clone();
	}
	//DONE
	private static int searchArray()
	{
		int count = 0;
		for ( int searchValue : searchValues ) {
			for (int arrayValue : unsortedValues) {
				if (searchValue == arrayValue) count++;
			}
		}
		return count;
	}
	//TODO readData()
	private static void readData(String filename, boolean readSortValues)
	{
		if (readSortValues == true) {
			try {

			}
			catch (Exception e) {

			}
		}
		else {
			try {

			}
			catch (Exception e) {

			}
		}
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
