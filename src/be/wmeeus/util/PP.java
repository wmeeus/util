package be.wmeeus.util;

/**
 * 
 * @author wmeeus
 *
 */
public class PP {
	public static String I = "";
	public static String C = "-- ";
	static int depth = 2;
	static int cdepth = 0;
	static boolean comment = false;
	static String commentc = "-- ";
	
	public static void down() {
		cdepth++;
		for (int i=0; i<depth; i++) I += " ";
		C = I + commentc;
	}
	public static void up() {
		if (cdepth>0) {
			cdepth--;
			if (cdepth>0) {
				I = I.substring(0, depth*cdepth);
			} else {
				I = "";
			}
			C = I + commentc;
		}
	}
	
	public static String W(String s, int l) {
		if (s.length()>=l) return s;
		String r = "" + s;
		for (int i=s.length(); i<l; i++) r += " ";
		return r;
	}

	public static String RW(String s, int l) {
		if (s.length()>=l) return s;
		String r = "";
		for (int i=s.length(); i<l; i++) r += " ";
		return r + s;
	}
}
