import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel ordPanel;
	private JPanel newPanel;
	private JPanel manPanel;
	private JLabel idLabel;
	private JTextField txtID;
	private JLabel idName;
	private JTextField txtWName;
	private JButton btnAddWarehouse;
	private JTextArea NewWareTXTarea;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		LinkedList<specWarehouse> Warehouses = new LinkedList();
		
		setTitle("Warehouse Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 489, 261);
		contentPane.add(tabbedPane);
		
		ordPanel = new JPanel();
		tabbedPane.addTab("Order", null, ordPanel, null);
		
		newPanel = new JPanel();
		tabbedPane.addTab("New Warehouse", null, newPanel, null);
		
		idLabel = new JLabel("Warehouse ID:");
		idLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newPanel.add(idLabel);
		
		txtID = new JTextField();
		newPanel.add(txtID);
		txtID.setColumns(10);
		
		idName = new JLabel("Warehouse Name:");
		idName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newPanel.add(idName);
		
		txtWName = new JTextField();
		newPanel.add(txtWName);
		txtWName.setColumns(10);
		
		btnAddWarehouse = new JButton("Add Warehouse");
		btnAddWarehouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddWarehouseClicked();
			}
		});
		newPanel.add(btnAddWarehouse);
		
		NewWareTXTarea = new JTextArea();
		NewWareTXTarea.setTabSize(0);
		NewWareTXTarea.setRows(8);
		NewWareTXTarea.setColumns(50);
		newPanel.add(NewWareTXTarea);
		
		manPanel = new JPanel();
		tabbedPane.addTab("Manage Warehouse", null, manPanel, null);
		manPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("Select Warehouse to Modify:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		manPanel.add(lblNewLabel);
		
		//String[] itemsArray = items.toArray(new String[items.size()]);
		comboBox = new JComboBox();
		comboBox.setMinimumSize(new Dimension(55, 22));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		manPanel.add(comboBox);
		
		btnNewButton = new JButton("Pull Warehouse");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		manPanel.add(btnNewButton);
		for (specWarehouse warehouse : Warehouses) {
			comboBox.addItem(warehouse.getName());
		}

	}

	protected void btnAddWarehouseClicked() {
		
		specWarehouse warehouse = new specWarehouse(txtID.getText(),txtWName.getText());
		NewWareTXTarea.append("Added Warehouse:"+warehouse.toString());
		comboBox.addItem(warehouse.getName());
		
	}
}
