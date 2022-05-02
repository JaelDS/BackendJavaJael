package practicaComic;

import imonsh.Screen;

public class storyTell {

    public static void main(String[] args) throws InterruptedException {
        tell();
    }

    private static void tell() throws InterruptedException {
        Screen screen = new Screen();

        next n = new next(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\nextweek.png",
                "\n"
        );

        Smash s = new Smash(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\Comic.png",
                "\n"+"If you're alive, SMASH YOUR DREAMS!!!!."+"\n"
        );

        day837 d7 = new day837(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY837.png",
                "\n"+"We thought that home office could give us rest and comfort but now we´re more exhausted."+"\n"
        );

        day800 d6 = new day800(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY800.png",
                "\n"+"We live disparaging our health until we're sick enough to stop doing stuff."+"\n"
        );

        day756 d5 = new day756(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY756.png",
                "\n"+"We spend our life dissatisfied until we live some hard things."+"\n"
        );

        day416 d4 = new day416(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY416.png",
                "\n"+"We're human beings more diversified, more completed and happier; know we're humans attached to the internet."+"\n"
        );

        day300 d3 = new day300(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY300.png",
                "\n"+"Fear is a powerful weapon."+"\n"
        );

        day229 d2 = new day229(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY229.png",
                "\n"+"No one knows the real value of people until we can't see them."+"\n"
        );

        day153 d1 = new day153(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY153.png",
                "\n"+"Sometimes making the easiest could lead to the worsest."+"\n"
        );

        day98 d = new day98(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\DAY98.png",
                "\n"+"We're living in more quiet times since COVID wasn't a known disease... So here are some thoughts post-COVID"+"\n"
        );

        Portada1 portada = new Portada1(
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaComic\\Portada.png",
                ""
        );

        {

            Runnable portada1 = new Runnable() {
                public void run() {

                    try {
                        portada.Portada(screen);
                        Thread.sleep(15000);

                        d.Day1(screen);
                        Thread.sleep(15000);

                        d1.Day2(screen);
                        Thread.sleep(15000);

                        d2.Day3(screen);
                        Thread.sleep(15000);

                        d3.Day4(screen);
                        Thread.sleep(15000);

                        d4.Day5(screen);
                        Thread.sleep(15000);

                        d5.Day6(screen);
                        Thread.sleep(15000);

                        d6.Day7(screen);
                        Thread.sleep(15000);

                        d7.Day8(screen);
                        Thread.sleep(15000);

                        s.Day9(screen);
                        Thread.sleep(15000);

                        n.Day10(screen);
                        Thread.sleep(15000);

                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            };
            Thread startComic = new Thread(portada1);
            startComic.start();
        }
    }
}