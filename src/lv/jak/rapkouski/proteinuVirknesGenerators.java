package lv.jak.rapkouski;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;

public class proteinuVirknesGenerators {

	private JFrame frame;
	private JTextField RNSField;
	private JTextField DNSField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proteinuVirknesGenerators window = new proteinuVirknesGenerators();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public proteinuVirknesGenerators() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 122, 450, 128);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel ProtVirk = new JLabel();// SUDA
		ProtVirk.setBounds(10, 11, 430, 106);
		panel_2.add(ProtVirk);
		ProtVirk.setBackground(Color.WHITE);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(524, 122, 450, 128);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel DNSLabel = new JLabel();// ILI SUDA
		DNSLabel.setBounds(10, 11, 430, 106);
		panel_1.add(DNSLabel);

		JTextPane txtpnRns = new JTextPane();
		txtpnRns.setEditable(false);
		txtpnRns.setBackground(SystemColor.control);
		txtpnRns.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		txtpnRns.setText("RNS");
		txtpnRns.setBounds(524, 11, 46, 20);
		panel.add(txtpnRns);

		JTextPane txtpnDns = new JTextPane();
		txtpnDns.setEditable(false);
		txtpnDns.setBackground(SystemColor.control);
		txtpnDns.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		txtpnDns.setText("DNS");
		txtpnDns.setBounds(10, 11, 99, 20);
		panel.add(txtpnDns);

		RNSField = new JTextField();
		RNSField.setBounds(524, 42, 450, 35);
		panel.add(RNSField);
		RNSField.setColumns(10);

		// String RNS = "aaaaaaaa";

		DNSField = new JTextField();
		DNSField.setColumns(10);
		DNSField.setBounds(10, 42, 450, 35);
		panel.add(DNSField);

		JButton Generet = new JButton("Proteina Virkne");
		Generet.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String RNS = RNSField.getText();

				for (int i = 0; i <= RNS.length(); i++) {
					if (RNS.contains("UUU") || RNS.contains("UUC")) {
						// String PheF = "F";

					} else if (RNS.contains("UUA") || RNS.contains("UUG") || RNS.contains("CUU") || RNS.contains("CUC")
							|| RNS.contains("CUA") || RNS.contains("CUG")) {
						String LeuL = "L";
					} else if (RNS.contains("AUU") || RNS.contains("AUC") || RNS.contains("AUA")) {
						String IleI = "I";
					} else if (RNS.contains("AUG")) {
						String MetM = "M";
					} else if (RNS.contains("GUU") || RNS.contains("GUC") || RNS.contains("GUA")
							|| RNS.contains("GUG")) {
						String ValV = "V";
					} else if (RNS.contains("UCU") || RNS.contains("UCC") || RNS.contains("UCA")
							|| RNS.contains("UCG")) {
						String SerS = "S";
					} else if (RNS.contains("CCU") || RNS.contains("CCC") || RNS.contains("CCA")
							|| RNS.contains("CCG")) {
						String ProP = "P";
					} else if (RNS.contains("ACU") || RNS.contains("ACC") || RNS.contains("ACA")
							|| RNS.contains("ACG")) {
						String ThrT = "T";
					} else if (RNS.contains("GCU") || RNS.contains("GCC") || RNS.contains("GCA")
							|| RNS.contains("GCG")) {
						String AlaA = "A";
					} else if (RNS.contains("UAU") || RNS.contains("UAC")) {
						String TyrY = "Y";
					} else if (RNS.contains("CAU") || RNS.contains("CAC")) {
						String CauC = "C";
					} else if (RNS.contains("CAA") || RNS.contains("CAG")) {
						String CauC = "C";
					}
				}

			}
		});

		Generet.setBounds(10, 88, 450, 23);
		panel.add(Generet);

		JButton Rezultati = new JButton("DNS >>> RNS");
		Rezultati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (DNSField.getText().equals(null)) {
				} else {
					String DNSS = DNSField.getText();
					String newDNSS = DNSS.replace("T", "U");
					DNSLabel.setText(newDNSS);
				}
			}
		});
		Rezultati.setBounds(524, 88, 450, 23);
		panel.add(Rezultati);
	}
}