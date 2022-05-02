package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class next extends Comic implements day10{

    public next(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Day10(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Times New Roman", 28, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }
}
