package lv.jak.bujaks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Gui {

	public JFrame frame;
	public ActionEvent event;
	public ActionListener listener;

	public Gui() {
		initialize();

	}

	String skolenuSkaitsStr = "";
	String maxPunktiToStr;
	int skolenuSkaitsToInt = 0;
	int maxPunkti;

	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel label = new JLabel("Ievadiet Skolenu skaitu");
		label.setBounds(25, 29, 174, 14);
		panel.add(label);

		JButton add = new JButton("New button");
		add.setAction((Action) (listener));
		add.setBounds(232, 201, 28, 23);
		panel.add(add);

		JLabel maxPunktuSkaitsLabel = new JLabel("Max punkti");
		maxPunktuSkaitsLabel.setBounds(25, 68, 91, 14);
		panel.add(maxPunktuSkaitsLabel);

		JSpinner skolenuSkaits = new JSpinner();
		skolenuSkaits.setBounds(169, 26, 41, 17);
		panel.add(skolenuSkaits);

		JLabel iegutiePunktiLabel = new JLabel("Iegutie pnkti");
		iegutiePunktiLabel.setBounds(25, 103, 101, 14);
		panel.add(iegutiePunktiLabel);

		JSpinner iegutiePunkti = new JSpinner();
		iegutiePunkti.setBounds(169, 100, 41, 20);
		panel.add(iegutiePunkti);

		JSpinner maxPunktiSpinner = new JSpinner();
		maxPunktiSpinner.setBounds(169, 65, 41, 20);
		panel.add(maxPunktiSpinner);

		JLabel procenti = new JLabel("New label");
		procenti.setBounds(164, 147, 46, 14);
		panel.add(procenti);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Visp\u0101r\u0113jie");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(249, 25, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Prof 2020./2021.m.g");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(249, 64, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Prof/Modu\u013Ci sakot ar 2021.m.g");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(249, 103, 174, 23);
		panel.add(rdbtnNewRadioButton_2);

		
		
		add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int a = (int) maxPunktiSpinner.getValue();
				
				System.out.println(a);
			}
		});

	}
}
