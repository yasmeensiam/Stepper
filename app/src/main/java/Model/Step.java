package Model;

/**
 * Created by yasmeen on 3/20/2016.
 */
public class Step {
   private String number;
   private String name_step;
   private int icon;

    public Step(String number, String name_step) {
        this.number = number;
        this.name_step = name_step;
    }

    public Step(String number, int icon) {
        this.number = number;
        this.name_step = name_step;
        this.icon = icon;

    }

    public int getIcon() {
        return icon;
    }

    public String getNumber() {
        return number;
    }

    public String getName_step() {
        return name_step;
    }
}
