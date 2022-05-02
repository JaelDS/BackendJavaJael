package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day416 extends Comic implements day5{

    public day416(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day5(Screen s) {

        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);

    }
}
