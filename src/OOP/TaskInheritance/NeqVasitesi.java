package OOP.TaskInheritance;

public class NeqVasitesi {
    String marka;
    String reng;
    double muherrikHecmi;

    public NeqVasitesi(String marka, String reng, double muherrikHecmi) {

        setMarka(marka);
        setReng(reng);
        setMuherrikHecmi(muherrikHecmi);
    }

    public String getReng() {
        return reng;
    }

    public void setReng(String reng) {
        this.reng = reng;
    }

    public double getMuherrikHecmi() {
        return muherrikHecmi;
    }

    public void setMuherrikHecmi(double muherrikHecmi) {
        this.muherrikHecmi = muherrikHecmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "NeqliyyatVasitesi{" +
                "marka='" + marka + '\'' +
                ", reng='" + reng + '\'' +
                ", muherrikHecmi=" + muherrikHecmi +
                '}';
    }
}

