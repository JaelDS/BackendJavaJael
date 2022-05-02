package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day229 extends Comic implements day3{

    public day229(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day3(Screen s) {
        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }
}
