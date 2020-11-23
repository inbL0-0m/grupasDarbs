package lv.jak.rapkouski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Ó÷ôüçäó {
	// UUU UUA AUU AUG GUU UCU CCU ACU
	// F L I M V S P T Y N W G *
	// UUUUUAAUUAUGGUUUCUCCUACU

	// FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY
	// FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY
	// FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY
	// FLIMVSPTY FLIMVSPTY FLIMVSPTY FLIMVSPTY
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> proteini = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String RNS = input.next();
		// for(int i = 0;i <= RNS.length(); i++) {

		System.out.println(Arrays.toString(RNS.split("(?<=\\G.{3})")));

		if (RNS.equals("UUU") || RNS.contains("UUC")) {
			// String PheF = "F";
			// System.out.print( PheF);
			proteini.add("F");
		}
		if (RNS.contains("UUA") || RNS.contains("UUG") || RNS.contains("CUU") || RNS.contains("CUC")
				|| RNS.contains("CUA") || RNS.contains("CUG")) {
			// String LeuL = "L";
			// System.out.print( LeuL);
			proteini.add("L");

		}
		if (RNS.contains("AUU") || RNS.contains("AUC") || RNS.contains("AUA")) {
			// String IleI = "I";
			// System.out.print(IleI );
			proteini.add("I");
		}
		if (RNS.contains("AUG")) {
			// String MetM = "M";
			// System.out.print(MetM );
			proteini.add("M");
		}
		if (RNS.contains("GUU") || RNS.contains("GUC") || RNS.contains("GUA") || RNS.contains("GUG")) {
			// String ValV = "V";
			// System.out.print(ValV );
			proteini.add("V");
		}
		if (RNS.contains("UCU") || RNS.contains("UCC") || RNS.contains("UCA") || RNS.contains("UCG")
				|| RNS.contains("AGU") || RNS.contains("AGC")) {
			// String SerS = "S";
			// System.out.print( SerS);
			proteini.add("S");
		}
		if (RNS.contains("CCU") || RNS.contains("CCC") || RNS.contains("CCA") || RNS.contains("CCG")) {
			// String ProP = "P";
			// System.out.print(ProP);
			proteini.add("P");
		}
		if (RNS.contains("ACU") || RNS.contains("ACC") || RNS.contains("ACA") || RNS.contains("ACG")) {
			// String ThrT = "T";
			// System.out.print(ThrT );
			proteini.add("T");
		}
		if (RNS.contains("GCU") || RNS.contains("GCC") || RNS.contains("GCA") || RNS.contains("GCG")) {
			// String AlaA = "A";
			// System.out.print(AlaA );
			proteini.add("A");
		}
		if (RNS.contains("UAU") || RNS.contains("UAC")) {
			// String TyrY = "Y";
			// System.out.print( TyrY);
			proteini.add("Y");
		}
		if (RNS.contains("CAU") || RNS.contains("CAC")) {
			// String HisH = "H";
			// System.out.print(HisH);
			proteini.add("H");
		}
		if (RNS.contains("CAA") || RNS.contains("CAG")) {
			// String GlnQ = "Q";
			// System.out.print(GlnQ);
			proteini.add("Q");
		}
		if (RNS.contains("AAU") || RNS.contains("AAC")) {
			// String AsnN = "N";
			// System.out.print(GlnQ);
			proteini.add("N");
		}
		if (RNS.contains("AAA") || RNS.contains("AAG")) {
			// String LysK = "K";
			// System.out.print(GlnQ);
			proteini.add("K");
		}
		if (RNS.contains("GAU") || RNS.contains("GAC")) {
			// String AspD = "D";
			// System.out.print(GlnQ);
			proteini.add("D");
		}
		if (RNS.contains("GAA") || RNS.contains("GAG")) {
			// String GluE = "E";
			// System.out.print(GlnQ);
			proteini.add("E");
		}
		if (RNS.contains("UGU") || RNS.contains("UGC")) {
			// String CysC = "C";
			// System.out.print(GlnQ);
			proteini.add("C");
		}
		if (RNS.contains("UGG")) {
			// String TrpW = "W";
			// System.out.print(GlnQ);
			proteini.add("W");
		}
		if (RNS.contains("CGU") || RNS.contains("CGC") || RNS.contains("CGA") || RNS.contains("CGG")
				|| RNS.contains("AGA") || RNS.contains("AGG")) {
			// String ArgR = "R";
			// System.out.print(GlnQ);
			proteini.add("R");
		}
		if (RNS.contains("GGU") || RNS.contains("GGC") || RNS.contains("GGA") || RNS.contains("GGG")) {
			// String GlyG = "G";
			// System.out.print(GlnQ);
			proteini.add("G");
		}
		if (RNS.contains("UAA") || RNS.contains("UAG") || RNS.contains("UGA")) {
			// String Stop = "*";
			// System.out.print(GlnQ);
			proteini.add("*");
		}
		// }
		for (int i = 0; i < proteini.size(); i++) {
			System.out.print(proteini.get(i));

		}

	}

}
