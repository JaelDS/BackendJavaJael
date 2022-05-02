package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class day837 extends Comic implements day8{

    public day837(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day8(Screen s) {
        s.repaint();
        s.out(showMessage(), "Times New Roman", 60, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }
}
