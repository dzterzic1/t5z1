package ba.unsa.etf.rpr;

import java.util.Set;

public class Predmet {
    private String nazivPredmeta;
    private int ECTSbodovi;
    private boolean obavezan;
    private Set<Student> studenti;

    public Predmet(String nazivPredmeta, int ECTSbodovi, boolean jelObavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.ECTSbodovi = ECTSbodovi;
        this.obavezan = jelObavezan;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getECTSbodovi() {
        return ECTSbodovi;
    }

    public boolean isObavezan() {
        return obavezan;
    }

    public Set<Student> getStudenti() {
        return studenti;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setECTSbodovi(int ECTSbodovi) {
        this.ECTSbodovi = ECTSbodovi;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    public void setStudenti(Set<Student> studenti) {
        this.studenti = studenti;
    }
}
