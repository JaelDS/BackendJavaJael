package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class GhostSpider extends Spiderman implements GwenSpider{

    public GhostSpider(String universe, String name, int dusrability, int energy, int fightSkills, int intelligence, int speed, int strength, String gender, double heigth, double weight, String url) {
        super(universe, name, dusrability, energy, fightSkills, intelligence, speed, strength, gender, heigth, weight, url);
    }

    @Override

    public void strength(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Times New Roman", 28, Colors.Innuendo);
        s.showImage("C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMultiverse\\Spider-Man-Strength-Lifting-Comic.png");
        s.setBounds(200, 100, 1100, 900);

    }

    @Override
    public void Swing(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Times New Roman", 28, Colors.Innuendo);
        s.showImage("C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMultiverse\\swingGwen.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void wallcrawling(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Times New Roman", 28, Colors.Innuendo);
        s.showImage("C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMultiverse\\wallgwen.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Times New Roman", 28, Colors.Innuendo);
        s.showImage("C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMultiverse\\OK4J6G2LDZAGPG54TAF7NW2Z34.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

}
