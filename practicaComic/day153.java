package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day153 extends Comic implements day2{

    public day153(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day2(Screen s) {

        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);

    }
}
