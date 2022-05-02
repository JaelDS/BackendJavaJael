package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

public class Portada1 extends Comic implements PortadaCallbacks{
    public Portada1(String draw, String history) {
        super(draw, history);
    }

    @Override
    public void Portada(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Times New Roman", 28, Colors.PrestigeBlue);
        s.showImage(getDraw());
        s.setBounds(200, 100, 1100, 900);
    }
}
