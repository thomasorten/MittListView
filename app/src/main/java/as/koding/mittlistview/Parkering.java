package as.koding.mittlistview;

/**
 * Created by thomasorten on 27.02.2018.
 */

public class Parkering {

    private String navn;
    private String adresse;

    public Parkering(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
