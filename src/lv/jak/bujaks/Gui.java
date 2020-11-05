package lv.jak.bujaks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;

public class Gui {
	public JFrame frame;
	private JTextField skolenuSkaits;
	private JTextField uzvardsI;
	private JTextField vardsI;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField iegutiePunktiI;
	private JTextField maxPunktuSkaitsI;
	private JTextField balleI;

	/**
	 * Launch the application.
	 */
	

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
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel infoPanelis = new JPanel();
		infoPanelis.setBounds(10, 11, 625, 131);
		panel.add(infoPanelis);
		infoPanelis.setLayout(null);
		
		JLabel lblKurss = new JLabel("Kurss");
		lblKurss.setBounds(10, 15, 51, 14);
		infoPanelis.add(lblKurss);
		
		JLabel lblPriekmets = new JLabel("Priek\u0161mets");
		lblPriekmets.setBounds(123, 15, 69, 14);
		infoPanelis.add(lblPriekmets);
		
		JLabel lblIevadietSkolnuSkaitu = new JLabel("Ievadiet skol\u0113nu skaitu");
		lblIevadietSkolnuSkaitu.setBounds(333, 15, 136, 14);
		infoPanelis.add(lblIevadietSkolnuSkaitu);
		
		JComboBox kurss = new JComboBox();
		kurss.setModel(new DefaultComboBoxModel(new String[] {"1.p", "2.p", "3.p", "4.p", "1.d", "2.d", "3.d", "4.d", "1.l", "2.l", "3.l", "4.l", "1.g", "2.g", "3.g", "4.g", "1.k", "2.k", "3.k", "4.k", "1.m", "2.m", "3.m", "4.m"}));
		kurss.setBounds(57, 11, 45, 22);
		infoPanelis.add(kurss);
		
		JComboBox prieksmets = new JComboBox();
		prieksmets.setModel(new DefaultComboBoxModel(new String[] {"Matem\u0101tika", "Latvie\u0161u valoda", "Krievu valoda", "Ang\u013Cu valoda", "Literat\u016Bra", "Programm\u0113\u0161ana", "Glezno\u0161ana", "Sabiedr\u012Bba", "\u010Cig\u0101nu valoda"}));
		prieksmets.setBounds(197, 11, 125, 22);
		infoPanelis.add(prieksmets);
		
		skolenuSkaits = new JTextField();
		skolenuSkaits.setBounds(476, 12, 45, 20);
		infoPanelis.add(skolenuSkaits);
		skolenuSkaits.setColumns(10);
		
		JButton pievienotSkolenus = new JButton("+");
		pievienotSkolenus.setBounds(543, 11, 41, 23);
		infoPanelis.add(pievienotSkolenus);
		
		JRadioButton vispPrieksmeti = new JRadioButton("Visp\u0101r\u012Bgie priek\u0161meti");
		buttonGroup.add(vispPrieksmeti);
		vispPrieksmeti.setBounds(10, 49, 182, 23);
		infoPanelis.add(vispPrieksmeti);
		
		JRadioButton profPrieksmets = new JRadioButton("Prof. priek\u0161mets");
		buttonGroup.add(profPrieksmets);
		profPrieksmets.setBounds(10, 75, 182, 23);
		infoPanelis.add(profPrieksmets);
		
		JRadioButton modulPrieksmeti = new JRadioButton("Prof./Modu\u013Ci");
		buttonGroup.add(modulPrieksmeti);
		modulPrieksmeti.setBounds(10, 101, 113, 23);
		infoPanelis.add(modulPrieksmeti);
		
		JPanel aizpildesDati = new JPanel();
		aizpildesDati.setBounds(10, 167, 625, 303);
		panel.add(aizpildesDati);
		aizpildesDati.setLayout(null);
		
		JLabel lblVrds = new JLabel("V\u0101rds");
		lblVrds.setBounds(159, 22, 48, 14);
		aizpildesDati.add(lblVrds);
		
		JLabel lblIegtiePunkti = new JLabel("Ieg\u016Btie punkti");
		lblIegtiePunkti.setBounds(258, 22, 105, 16);
		aizpildesDati.add(lblIegtiePunkti);
		
		JLabel lblMaksimloPunktuSkaits = new JLabel("Maksim\u0101lo punktu skaits");
		lblMaksimloPunktuSkaits.setBounds(361, 22, 143, 14);
		aizpildesDati.add(lblMaksimloPunktuSkaits);
		
		JLabel lblBalle = new JLabel("Balle");
		lblBalle.setBounds(545, 22, 48, 14);
		aizpildesDati.add(lblBalle);
		
		uzvardsI = new JTextField();
		uzvardsI.setBounds(29, 57, 80, 20);
		aizpildesDati.add(uzvardsI);
		uzvardsI.setColumns(10);
		
		vardsI = new JTextField();
		vardsI.setBounds(138, 57, 80, 20);
		aizpildesDati.add(vardsI);
		vardsI.setColumns(10);
		
		iegutiePunktiI = new JTextField();
		iegutiePunktiI.setColumns(10);
		iegutiePunktiI.setBounds(250, 57, 80, 20);
		aizpildesDati.add(iegutiePunktiI);
		
		maxPunktuSkaitsI = new JTextField();
		maxPunktuSkaitsI.setColumns(10);
		maxPunktuSkaitsI.setBounds(383, 57, 80, 20);
		aizpildesDati.add(maxPunktuSkaitsI);
		
		balleI = new JTextField();
		balleI.setColumns(10);
		balleI.setBounds(518, 57, 80, 20);
		aizpildesDati.add(balleI);
		
		JLabel lblUzvrds = new JLabel("Uzv\u0101rds");
		lblUzvrds.setBounds(42, 22, 48, 14);
		aizpildesDati.add(lblUzvrds);
		
		JButton saveBtn = new JButton("Save");
		saveBtn.setBounds(546, 481, 89, 23);
		panel.add(saveBtn);
	}
}
