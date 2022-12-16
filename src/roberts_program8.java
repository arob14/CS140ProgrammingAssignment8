import java.awt.*;
import java.util.ArrayList;


//TODO action listeners for buttons

public class roberts_program8 {
	
	private static int width = 700;
	private static int height = 350;
	private static int width2 = 350;
	// left buttons
	private static javax.swing.JButton sortIntsButton = new javax.swing.JButton("sort ints");
	private static javax.swing.JButton addToBSTButton = new javax.swing.JButton("add to bst");
	private static javax.swing.JButton addToTreeSetButton = new javax.swing.JButton("add to treeset");
	private static 	javax.swing.JButton addToPriorityQueueButton = new javax.swing.JButton("add to priority queue");
	private static 	javax.swing.JButton addToHashSetButton = new javax.swing.JButton("add to hashset");
	private static 	javax.swing.JButton addToArrayListButton = new javax.swing.JButton("add to arraylist");
	private static javax.swing.JButton addToSortedArrayListButton = new javax.swing.JButton("add to sorted arraylist");
	private static javax.swing.JButton addToArrayButton = new javax.swing.JButton("add to array");

	// Left labels
	private static javax.swing.JLabel sortIntsLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel  addToBSTLabel = new javax.swing.JLabel("no result");
	private static 	javax.swing.JLabel addToTreeSetLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel addToPriorityQueueLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel addToHashSetLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel addToArrayListLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel addToSortedArrayListLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel addToArrayLabel = new javax.swing.JLabel("no result");

	// right buttons
	private static javax.swing.JButton searchSortedIntsButton = new javax.swing.JButton("search sorted ints");
	private static 	javax.swing.JButton searchBSTButton = new javax.swing.JButton("search bst");
	private static javax.swing.JButton searchTreeSetButton = new javax.swing.JButton("search treeset");
	private static javax.swing.JButton searchPriorityQueueButton = new javax.swing.JButton("search priority queue");
	private static javax.swing.JButton searchHashSetButton = new javax.swing.JButton("search hashset");
	private static javax.swing.JButton searchArrayListButton = new javax.swing.JButton("search arraylist");
	private static javax.swing.JButton searchSortedArrayListButton = new javax.swing.JButton("search sorted arraylist");
	private static javax.swing.JButton searchArrayButton = new javax.swing.JButton("search array");

	// right labels
	private static javax.swing.JLabel searchSortedIntsLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchBSTLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchTreeSetLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchPriorityQueueLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchHashSetLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchArrayListLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchSortedArrayListLabel = new javax.swing.JLabel("no result");
	private static javax.swing.JLabel searchArrayLabel = new javax.swing.JLabel("no result");
	public static void main(String[] args) {
		//disable all buttons initially
		sortIntsButton.setEnabled(false);
		addToBSTButton.setEnabled(false);
		addToTreeSetButton.setEnabled(false);
		addToPriorityQueueButton.setEnabled(false);
		addToHashSetButton.setEnabled(false);
		addToArrayListButton.setEnabled(false);
		addToSortedArrayListButton.setEnabled(false);
		addToArrayButton.setEnabled(false);

		searchSortedIntsButton.setEnabled(false);
		searchBSTButton.setEnabled(false);
		searchTreeSetButton.setEnabled(false);
		searchPriorityQueueButton.setEnabled(false);
		searchHashSetButton.setEnabled(false);
		searchArrayListButton.setEnabled(false);
		searchSortedArrayListButton.setEnabled(false);
		searchArrayButton.setEnabled(false);
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
		MenuItemActionListener fileReadSortFileMenuItemActionListener = new MenuItemActionListener(fileReadSortFile, args[0]);
		MenuItemActionListener fileReadSearchFileMenuItemActionListner = new MenuItemActionListener(fileReadSearchFile, args[1]);
		
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
		java.awt.GridBagConstraints rightButtonPanelConstraints = new java.awt.GridBagConstraints();

		rightButtonPanelConstraints.weightx = 1;
		rightButtonPanelConstraints.weighty = 1;
		rightButtonPanelConstraints.fill = GridBagConstraints.NONE;
		rightButtonPanelConstraints.anchor = GridBagConstraints.LINE_START;

		// right button gridbag
		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 0;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchSortedIntsButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 1;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchBSTButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 2;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchTreeSetButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 3;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchPriorityQueueButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 4;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchHashSetButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 5;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchArrayListButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 6;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchSortedArrayListButton, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 0;
		rightButtonPanelConstraints.gridy = 7;
		rightButtonPanelConstraints.gridwidth = 1;
		rightGridBagLayout.setConstraints(searchArrayButton, rightButtonPanelConstraints);

		// right label gridbag
		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 0;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchSortedIntsLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 1;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchBSTLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 2;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchTreeSetLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 3;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchPriorityQueueLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 4;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchHashSetLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 5;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchArrayListLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 6;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchSortedArrayListLabel, rightButtonPanelConstraints);

		rightButtonPanelConstraints.gridx = 1;
		rightButtonPanelConstraints.gridy = 7;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightGridBagLayout.setConstraints(searchArrayLabel, rightButtonPanelConstraints);

		// add right buttons and labels
		rightButtonPanel.add(searchSortedIntsButton);
		rightButtonPanel.add(searchBSTButton);
		rightButtonPanel.add(searchTreeSetButton);
		rightButtonPanel.add(searchPriorityQueueButton);
		rightButtonPanel.add(searchHashSetButton);
		rightButtonPanel.add(searchArrayListButton);
		rightButtonPanel.add(searchSortedArrayListButton);
		rightButtonPanel.add(searchArrayButton);

		rightButtonPanel.add(searchSortedIntsLabel);
		rightButtonPanel.add(searchBSTLabel);
		rightButtonPanel.add(searchTreeSetLabel);
		rightButtonPanel.add(searchPriorityQueueLabel);
		rightButtonPanel.add(searchHashSetLabel);
		rightButtonPanel.add(searchArrayListLabel);
		rightButtonPanel.add(searchSortedArrayListLabel);
		rightButtonPanel.add(searchArrayLabel);
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

		//create action listeners
		ButtonActionListener sortIntsAL = new ButtonActionListener(sortIntsButton, sortIntsLabel);
		ButtonActionListener addToBSTAL = new ButtonActionListener(addToBSTButton, addToBSTLabel);
		ButtonActionListener addToHashSetAL = new ButtonActionListener(addToHashSetButton, addToHashSetLabel);
		ButtonActionListener addToTreeSetAL = new ButtonActionListener(addToTreeSetButton, addToTreeSetLabel);
		ButtonActionListener addToPriorityQueueAL = new ButtonActionListener(addToPriorityQueueButton,addToPriorityQueueLabel);
		ButtonActionListener addToArrayListAL = new ButtonActionListener(addToArrayListButton, addToArrayListLabel);
		ButtonActionListener addToSortedArrayListAL = new ButtonActionListener(addToSortedArrayListButton, addToSortedArrayListLabel);
		ButtonActionListener addToArrayAL = new ButtonActionListener(addToArrayButton, addToArrayLabel);

		ButtonActionListener searchSortedIntsAL = new ButtonActionListener(searchSortedIntsButton, searchSortedIntsLabel);
		ButtonActionListener searchBSTAL = new ButtonActionListener(searchBSTButton, searchBSTLabel);
		ButtonActionListener searchHashSetAL = new ButtonActionListener(searchHashSetButton, searchHashSetLabel);
		ButtonActionListener searchTreeSetAL = new ButtonActionListener(searchTreeSetButton, searchTreeSetLabel);
		ButtonActionListener searchPriorityQueueAL = new ButtonActionListener(searchPriorityQueueButton,searchPriorityQueueLabel);
		ButtonActionListener searchArrayListAL = new ButtonActionListener(searchArrayListButton, searchArrayListLabel);
		ButtonActionListener searchSortedArrayListAL = new ButtonActionListener(searchSortedArrayListButton,searchSortedArrayListLabel);
		ButtonActionListener searchArrayAL = new ButtonActionListener(searchArrayButton, searchArrayLabel);

		//add AL's to buttons
		sortIntsButton.addActionListener(sortIntsAL);
		addToBSTButton.addActionListener(addToBSTAL);
		addToHashSetButton.addActionListener(addToHashSetAL);
		addToTreeSetButton.addActionListener(addToTreeSetAL);
		addToPriorityQueueButton.addActionListener(addToPriorityQueueAL);
		addToArrayListButton.addActionListener(addToArrayListAL);
		addToSortedArrayListButton.addActionListener(addToSortedArrayListAL);
		addToArrayButton.addActionListener(addToArrayAL);

		searchSortedIntsButton.addActionListener(searchSortedIntsAL);
		searchBSTButton.addActionListener(searchBSTAL);
		searchHashSetButton.addActionListener(searchHashSetAL);
		searchTreeSetButton.addActionListener(searchTreeSetAL);
		searchPriorityQueueButton.addActionListener(searchPriorityQueueAL);
		searchArrayListButton.addActionListener(searchArrayListAL);
		searchSortedArrayListButton.addActionListener(searchSortedArrayListAL);
		searchArrayButton.addActionListener(searchArrayAL);


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
	private static boolean searchValuesRead = false;
	private static boolean intsSorted = false;
	private static boolean bstFull = false;
	private static boolean treeSetFull = false;
	private static boolean hashSetFull = false;
	private static boolean priorityQueueFull = false;
	private static boolean arrayListFull = false;
	private static boolean sortedArrayListFull = false;
	private static boolean arrayFull = false;


	// DONE
	private static void selectionSort() {
		sortedValues = sortValues.clone();
		int min;
		for (int i = 0; i < sortedValues.length; i++) {
			min = i;
			for (int j = i+1; j < sortedValues.length; j++) {
				if (sortedValues[j] < sortedValues[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = sortedValues[i];
				sortedValues[i] = sortedValues[min];
				sortedValues[min] = temp;
			}
		}
		intsSorted = true;
		if (searchValuesRead) searchSortedIntsButton.setEnabled(true);

	}

	//DONE
	private static int searchInts()
	{
		int count = 0;
		for (int searchValue : searchValues) {
			int bottom = 0;
			int top = sortedValues.length - 1;
			while (bottom <= top) {
				int middle = (bottom + top) / 2;

				if (searchValue < sortedValues[middle]) {
					top = middle - 1;
				}
				else if (searchValue > sortedValues[middle]) {
					bottom = middle + 1;
				}
				else if(searchValue == sortedValues[middle]) {
					count++;
					break;
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
		bstFull = true;
		if (searchValuesRead) searchBSTButton.setEnabled(true);
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
		treeSetFull = true;
		if (searchValuesRead) searchTreeSetButton.setEnabled(true);
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
		hashSetFull = true;
		if (searchValuesRead) searchHashSetButton.setEnabled(true);
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
		priorityQueueFull = true;
		if (searchValuesRead) searchPriorityQueueButton.setEnabled(true);
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
		arrayListFull = true;
		if (searchValuesRead) searchArrayListButton.setEnabled(true);
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
		sortedArrayListFull = true;
		if (searchValuesRead) searchSortedArrayListButton.setEnabled(true);
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
		arrayFull = true;
		if (searchValuesRead) searchArrayButton.setEnabled(true);
	}
	//DONE
	private static int searchArray()
	{
		int count = 0;
		for ( int searchValue : searchValues ) {
			for (int arrayValue : unsortedValues) {
				if (searchValue == arrayValue)
					count++;
			}
		}
		return count;
	}
	//TODO readData()
	private static void readData(String filename, boolean readSortValues)
	{
		java.util.ArrayList<Integer> tempValues = new ArrayList<Integer>();
		if (readSortValues) {
			try {
				java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
				String inn;
				while ( (inn = input.readLine()) != null) {
					tempValues.add(Integer.parseInt(inn));
				}
				input.close();
				sortValues = new int[tempValues.size()];
				for (int i = 0; i < tempValues.size(); i++) {
					sortValues[i] = tempValues.get(i);
				}

				sortIntsButton.setEnabled(true);
				addToBSTButton.setEnabled(true);
				addToTreeSetButton.setEnabled(true);
				addToPriorityQueueButton.setEnabled(true);
				addToHashSetButton.setEnabled(true);
				addToArrayListButton.setEnabled(true);
				addToSortedArrayListButton.setEnabled(true);
				addToArrayButton.setEnabled(true);
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		else {
			try {
				java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
				String inn;
				while ( (inn = input.readLine()) != null) {
					tempValues.add(Integer.parseInt(inn));
				}
				input.close();
				searchValues = new int[tempValues.size()];
				for (int i = 0; i < tempValues.size(); i++) {
					searchValues[i] = tempValues.get(i);
				}

				searchValuesRead = true;

				if(intsSorted) searchSortedIntsButton.setEnabled(true);
				if(bstFull) searchBSTButton.setEnabled(true);
				if(treeSetFull) searchTreeSetButton.setEnabled(true);
				if(priorityQueueFull) searchPriorityQueueButton.setEnabled(true);
				if(hashSetFull) searchHashSetButton.setEnabled(true);
				if(arrayListFull) searchArrayListButton.setEnabled(true);
				if(sortedArrayListFull) searchSortedArrayListButton.setEnabled(true);
				if(arrayFull) searchArrayButton.setEnabled(true);
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

	static class MenuItemActionListener implements java.awt.event.ActionListener
	{
		// the menu item associated with the action listener, so that we can
		// share this one class with multiple menu items
		private javax.swing.JMenuItem m;
		private String filename;
		
		MenuItemActionListener(javax.swing.JMenuItem m, String filename)
		{
			this.m = m;
			this.filename = filename;
		}
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
				readData(filename, true);
				System.out.println("read sort file");
			}
			if( m.getText().toLowerCase().equals("read search file") )
			{
				readData(filename, false);
				System.out.println("read search file");
			}
		}
	}
	
	static class ButtonActionListener implements java.awt.event.ActionListener
	{
		// the button associated with the action listener, so that we can
		// share this one class with multiple buttons
		private javax.swing.JButton b;
		private javax.swing.JLabel l;
		
		ButtonActionListener(javax.swing.JButton b, javax.swing.JLabel l)
		{
			this.b = b;
			this.l = l;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + b.getText() + " button");

			if(b.getText().toLowerCase().equals("sort ints")) {
				long t0 = System.currentTimeMillis();
				selectionSort();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to bst")) {
				long t0 = System.currentTimeMillis();
				addToBinarySearchTree();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to treeset")) {
				long t0 = System.currentTimeMillis();
				addToTreeSet();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to priority queue")) {
				long t0 = System.currentTimeMillis();
				addToPriorityQueue();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to hashset")) {
				long t0 = System.currentTimeMillis();
				addToHashSet();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to arraylist")) {
				long t0 = System.currentTimeMillis();
				addToArrayList();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to sorted arraylist")) {
				long t0 = System.currentTimeMillis();
				addToSortedArrayList();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("add to array")) {
				long t0 = System.currentTimeMillis();
				addToArray();
				long t1 = System.currentTimeMillis();
				l.setText(t1-t0 + "ms");

			}
			if(b.getText().toLowerCase().equals("search sorted ints")) {
				long t0 = System.currentTimeMillis();
				int count = searchInts();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search bst")) {
				long t0 = System.currentTimeMillis();
				int count = searchBinarySearchTree();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search treeset")) {
				long t0 = System.currentTimeMillis();
				int count = searchTreeSet();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search priority queue")) {
				long t0 = System.currentTimeMillis();
				int count = searchPriorityQueue();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search hashset")) {
				long t0 = System.currentTimeMillis();
				int count = searchHashSet();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search arraylist")) {
				long t0 = System.currentTimeMillis();
				int count = searchArrayList();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search sorted arraylist")) {
				long t0 = System.currentTimeMillis();
				int count = searchSortedArrayList();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
			if(b.getText().toLowerCase().equals("search array")) {
				long t0 = System.currentTimeMillis();
				int count = searchArray();
				long t1 = System.currentTimeMillis();
				long time = t1 - t0;
				l.setText(count+" / "+ time + "ms");

			}
		}
	}

}
