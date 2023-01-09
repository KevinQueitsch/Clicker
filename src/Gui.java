import java.awt.EventQueue;





import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Event;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;




public class Gui{
	// Varibalen
	private int count = 0;
	
	
	private JFrame frmClickerV;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmClickerV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClickerV = new JFrame();
		frmClickerV.setResizable(false);
		
		Image img = new ImageIcon(this.getClass().getResource("/click.png")).getImage();
		frmClickerV.setIconImage(img);
		
		frmClickerV.setTitle("Clicker");
		frmClickerV.setBounds(100, 100, 238, 364);
		frmClickerV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmClickerV.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
		);
		
		JButton btnNewButton = new JButton("Press");
		btnNewButton.setBackground(new Color(102, 204, 102));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		
		JPanel panel_2 = new JPanel();
		
		JButton btnNewButtonReset = new JButton("Reset");
		btnNewButtonReset.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButtonReset.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButtonReset_minusEins = new JButton("-1");
		btnNewButtonReset_minusEins.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButtonReset_minusEins.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButtonReset_minusEins, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
						.addComponent(btnNewButtonReset, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButtonReset, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButtonReset_minusEins, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
		);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Clicker");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		frmClickerV.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frmClickerV.setJMenuBar(menuBar);
		
		JMenu mnNewMenuFile = new JMenu("File");
		menuBar.add(mnNewMenuFile);
		
		JMenuItem mntmNewMenuSaveAs = new JMenuItem("Save As");
		mnNewMenuFile.add(mntmNewMenuSaveAs);
		
		JMenu mnNewMenuAbout = new JMenu("About");
		menuBar.add(mnNewMenuAbout);
		
		JMenuItem mntmNewMenuAbout = new JMenuItem("About");
		mnNewMenuAbout.add(mntmNewMenuAbout);
		
	
		//-----------------------------------------------------------Mein Code---------------------------------------------------
		
		btnNewButton.addActionListener(actionEvent -> {
			count++;
			textField.setText(String.valueOf(count));
				
		});
		
		btnNewButtonReset.addActionListener(actionEvent -> {
			count = 0;
			textField.setText(String.valueOf(count));
		
		});
		
		btnNewButtonReset_minusEins.addActionListener(actionEvent -> {
			count = count -1;
			textField.setText(String.valueOf(count));
			
			if(count < 0) {
				count = 0;
				textField.setText(String.valueOf(count));
			}
			
		});
		// -----Menubar-----
		
		// Save As
		mntmNewMenuSaveAs.addActionListener(ActionEvent -> {
			// Convert (int) count -> (String) stgCount
			String stgCount = String.valueOf(count);
			
	        JFileChooser chooser = new JFileChooser();
	        int option = chooser.showSaveDialog(null);
	        
	        if(option == JFileChooser.APPROVE_OPTION) {
	        	File selectedFile = chooser.getSelectedFile();
	        	
	        	FileWriter fw = null;
	        	try {
	        		fw = new FileWriter(selectedFile);
	        		fw.write(stgCount); 				
	        		fw.close();
	        	} catch (IOException ioe) {
	        		ioe.printStackTrace();
	        	} finally {
	        		if(fw != null) {
	        			try {
	        				fw.close();
	        			}catch (IOException e) {
	        			}
	        			
	        		}
	        		
	        	}
	        	
	        }
	        
		});
	
		// Show About
		mntmNewMenuAbout.addActionListener(ActionEvent -> {
			About ab = new About();
			ab.main(null);
		});
	
	}
}