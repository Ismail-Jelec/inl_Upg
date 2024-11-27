public class logikKlass {
    private int antalTecken;
    private int antalRader;

    public logikKlass() {
        this.antalTecken = 0;
        this.antalRader = 0;
    }


    public int räknaTecken(String text) {
        this.antalTecken = text.replaceAll("\\n", "").length();
        return this.antalTecken;
    }


    public int räknaRader(String text) {
        this.antalRader = text.split("\\n").length;
        return this.antalRader;
    }


    public int getAntalTecken() {
        return this.antalTecken;
    }


    public int getAntalRader() {
        return this.antalRader;
    }
}
