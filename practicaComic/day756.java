package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day756 extends Comic implements day6{

    public day756(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day6(Screen s) {
        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }

}
