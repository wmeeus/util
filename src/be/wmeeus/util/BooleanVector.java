package be.wmeeus.util;
import java.util.*;

public class BooleanVector {
	ArrayList<Boolean> v = new ArrayList<Boolean>();

	public BooleanVector(int w) {
		for (int i=0; i<w; i++) {
			v.add(Boolean.FALSE);
		}
	}

	public void set(int n, boolean b) {
		if (n>=0 && n<v.size()) {
			if (b) {
				v.set(n, Boolean.TRUE);
			} else {
				v.set(n, Boolean.FALSE);
			}
		}
	}
	
	public boolean testAndSet(int n) {
		if (n<0 || n>v.size()-1) return false; // TODO throw exception
		if (v.get(n).booleanValue()) return false;
		v.set(n, Boolean.TRUE);
		return true;
	}
	
	public void set(int s, int e, boolean b) {
		if (s>e || s<0 || e>v.size()-1) return; // TODO throw exception
		for (int i=s; i<=e; i++) 
			if (b) {
				v.set(i, Boolean.TRUE);
			} else {
				v.set(i, Boolean.FALSE);
			}
	}
	
	public boolean testAndSet(int s, int e) {
		if (s>e || s<0 || e>v.size()-1) return false; // TODO throw exception
		for (int i=s; i<=e; i++) 
			if (v.get(i).booleanValue()) return false;
		for (int i=s; i<=e; i++) 
			v.set(i, Boolean.TRUE);
		return true;
	}
	
	public boolean get(int n) {
		if (n>v.size()) return false; // TODO exception??
		return v.get(n).booleanValue();
	}

	private String bool2bit(boolean b) {
		if (b) return "1";
		return "0";
	}
	
	public String toString() {
		String r = "";
		for (int i=v.size()-1; i>=0; i--)
			r += bool2bit(v.get(i).booleanValue());
		return r;
	}
	
}
