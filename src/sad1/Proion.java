package sad1;

import java.util.ArrayList;

public class Proion {
	
	private String kodikosProiontos;
	private String onoma;
	private String syntomiPerigrafi;
	private String brand;
	private String noumero;
	private String xroma;
	private Eidos eidos;
	private ArrayList<Katigoria> katigories;
	private double timiPolisis;
	private double timiAgoras;
	private int posotitaPromitheyti;
	private int katotatoOrio;
	private int epithymitiPosotita;
	
	public Proion(String kP, String on, String sP, String br, String nr, 
			String xr, Eidos eid, Katigoria kat, double tP, double tA, int pP) {
		
		kodikosProiontos = kP;
		onoma = on;
		syntomiPerigrafi = sP;
		brand = br;
		noumero = nr;
		xroma = xr;
		eidos = eid;
		katigories = kat;
		timiPolisis = tP;
		timiAgoras = tA;
		posotitaPromitheyti = pP;
		katotatoOrio = 0;
		epithymitiPosotita = 0;	
	}
	
	public Proion anazitisiProiontos(String kodikos) {
		if (kodikos == this.kodikosProiontos) {
			return this;
		}
	}
}

