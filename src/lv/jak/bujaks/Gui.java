package lv.jak.bujaks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
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
	int atzime = 0;
	public JFrame frame;
	public ActionEvent event;
	public ActionListener listener;

	public Gui() {
		initialize();

	}

	Audzeknis audzeknis = null;
	String skolenuSkaitsStr = "";
	String maxPunktiToStr;
	int skolenuSkaitsToInt = 0;
	int maxPunkti;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JTextField vardsGet;
	public JTextField uzvardsGet;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton add = new JButton("Rezult\u0101ts");
		add.setAction((Action) (listener));
		add.setBounds(395, 235, 28, 23);
		panel.add(add);

		JLabel maxPunktuSkaitsLabel = new JLabel("Max punkti");
		maxPunktuSkaitsLabel.setBounds(25, 28, 91, 14);
		panel.add(maxPunktuSkaitsLabel);

		JLabel iegutiePunktiLabel = new JLabel("Iegutie pnkti");
		iegutiePunktiLabel.setBounds(25, 80, 101, 14);
		panel.add(iegutiePunktiLabel);

		JSpinner iegutiePunkti = new JSpinner();
		iegutiePunkti.setBounds(169, 77, 41, 20);
		panel.add(iegutiePunkti);

		JSpinner maxPunktiSpinner = new JSpinner();
		maxPunktiSpinner.setBounds(169, 25, 41, 20);
		panel.add(maxPunktiSpinner);

		JLabel procenti = new JLabel("procenti");
		procenti.setBounds(265, 222, 70, 14);
		panel.add(procenti);

		JRadioButton visparejie = new JRadioButton("Visp\u0101r\u0113jie");
		buttonGroup.add(visparejie);
		visparejie.setBounds(249, 25, 109, 23);
		panel.add(visparejie);

		JRadioButton prof = new JRadioButton("Prof 2020./2021.m.g");
		buttonGroup.add(prof);
		prof.setBounds(249, 64, 176, 23);
		panel.add(prof);

		JRadioButton pec = new JRadioButton("Prof/Modu\u013Ci sakot ar 2021.m.g");
		buttonGroup.add(pec);
		pec.setBounds(249, 103, 223, 23);
		panel.add(pec);

		JLabel lblNewLabel = new JLabel("procenti");
		lblNewLabel.setBounds(169, 222, 70, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("atzime");
		lblNewLabel_1.setBounds(169, 258, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("atzime");
		lblNewLabel_2.setBounds(265, 258, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lableVards = new JLabel("V\u0101rds");
		lableVards.setBounds(25, 140, 46, 14);
		panel.add(lableVards);

		vardsGet = new JTextField();
		vardsGet.setBounds(96, 137, 86, 20);
		panel.add(vardsGet);
		vardsGet.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Uzv\u0101rds");
		lblNewLabel_3.setBounds(212, 140, 46, 14);
		panel.add(lblNewLabel_3);

		uzvardsGet = new JTextField();
		uzvardsGet.setBounds(306, 137, 86, 20);
		panel.add(uzvardsGet);
		uzvardsGet.setColumns(10);

		ArrayList<Audzeknis> list = new ArrayList();
		String atzimeStr;

		add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// radio buttons
				int a = (int) maxPunktiSpinner.getValue();
				int b = (int) iegutiePunkti.getValue();
				int c = (int) (((double) b / a) * 100);
				procenti.setText(c + "%");

				if (pec.isSelected()) {
					atzime = aprekinaGaitaPec(c);
				} else if (prof.isSelected()) {
					atzime = aprekinaGaitaTagad(c);
				} else {
					atzime = aprekinaGaitaPirms(c);
				}
				String vards = vardsGet.getText();
				String uzvards = uzvardsGet.getText();

				audzeknis = new Audzeknis(vards, uzvards, atzime);
				list.add(audzeknis);
				System.out.println(list);
				System.out.println(atzime);
				for (Audzeknis audzeknis : list) {
					System.out.println(audzeknis.getAtzime());
					System.out.println(audzeknis.getUzvards());
					System.out.println(audzeknis.getVards());
				}
			}

			// aprekinu gaita
			public int aprekinaGaitaPirms(int c) {
				int atzime = 0;
				if (c >= 1 && c < 11) {
					atzime = 1;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 12 && c < 22) {
					atzime = 2;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 23 && c < 32) {
					atzime = 3;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 33 && c < 46) {
					atzime = 4;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 47 && c < 59) {
					atzime = 5;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 60 && c < 69) {
					atzime = 6;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 70 && c < 79) {
					atzime = 7;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 80 && c < 89) {
					atzime = 8;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 90 && c < 95) {
					atzime = 9;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 96 && c < 100) {
					atzime = 10;
					lblNewLabel_2.setText(atzime + "");
				}

				return atzime;
			}

			public int aprekinaGaitaTagad(int c) {
				int atzime = 0;
				if (c >= 1 && c <= 18) {
					atzime = 1;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 19 && c <= 34) {
					atzime = 2;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 35 && c <= 49) {
					atzime = 3;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 50 && c <= 59) {
					atzime = 4;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 60 && c < 68) {
					atzime = 5;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 69 && c <= 76) {
					atzime = 6;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 77 && c <= 83) {
					atzime = 7;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 84 && c <= 90) {
					atzime = 8;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 91 && c <= 95) {
					atzime = 9;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 96 && c <= 100) {
					atzime = 10;
					lblNewLabel_2.setText(atzime + "");
				}
				return atzime;
			}

			public int aprekinaGaitaPec(int c) {
				int atzime = 0;
				if (c >= 1 && c < 14) {
					atzime = 1;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 15 && c < 22) {
					atzime = 2;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 23 && c < 44) {
					atzime = 3;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 45 && c < 59) {
					atzime = 4;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 60 && c < 67) {
					atzime = 5;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 68 && c < 75) {
					atzime = 6;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 76 && c < 83) {
					atzime = 7;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 84 && c < 91) {
					atzime = 8;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 92 && c < 96) {
					atzime = 9;
					lblNewLabel_2.setText(atzime + "");
				} else if (c >= 97 && c < 100) {
					atzime = 10;
					lblNewLabel_2.setText(atzime + "");
				}
				return atzime;

			}
		});
	}
}
