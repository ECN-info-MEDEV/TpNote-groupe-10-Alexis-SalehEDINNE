package ecn.edu.medev;

public class Personne {

    private int pas=0;

    public void marcher(){
        this.pas+=1;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
}
