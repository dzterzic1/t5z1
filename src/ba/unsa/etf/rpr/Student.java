package ba.unsa.etf.rpr;


public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    private Semestar semestar;

    public Student(String ime, String prezime, int brojIndeksa, Semestar semestar) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.semestar = semestar;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public Semestar getSemestar() {
        return semestar;
    }
}
