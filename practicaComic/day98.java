package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day98 extends Comic implements day1{

    public day98(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day1(Screen s) {

        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }

}
