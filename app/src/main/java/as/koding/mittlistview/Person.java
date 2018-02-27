package as.koding.mittlistview;

/**
 * Created by thomasorten on 20.02.2018.
 */

public class Person {

    private String fornavn;
    private String etternavn;
    private int telefon;
    private String addresse;

    public Person(String fornavn, String etternavn, int telefon, String addresse) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.addresse = addresse;
    }

    public Person(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
