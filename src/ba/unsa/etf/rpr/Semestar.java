package ba.unsa.etf.rpr;

import java.util.Set;

public class Semestar {
    private String kojiSemestar;
    private Set<Predmet> predmeti;

    public Semestar(String kojiSemestar, Set<Predmet> predmeti) {
        this.kojiSemestar = kojiSemestar;
        this.predmeti = predmeti;
    }

    public String getKojiSemestar() {
        return kojiSemestar;
    }

    public void setKojiSemestar(String kojiSemestar) {
        this.kojiSemestar = kojiSemestar;
    }

    public Set<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Set<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
}
