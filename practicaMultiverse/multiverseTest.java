package practicaMultiverse;

import imonsh.Screen;

public class multiverseTest {
    public static void main(String[] args) throws InterruptedException{

        testMiles();
    }

    private static void testMiles() throws InterruptedException{
        Screen screen = new Screen();
        MilesMorales miles = new MilesMorales(
                "Earth-1610",
                "Miles Morales",
                3,
                2,
                3,
                2,
                3,
                4,
                "Male",
                1.57,
                56.7,
                "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMultiverse\\MilesMoarales.jpg"
        );

        GhostSpider gwen = new GhostSpider(
                "Earth-65",
                "Ghost-Spider",
                3,
                1,
                3,
                3,
                3,
                4,
                "Female",
                1.60,
                56.7,
                ""
        );

        zombieSpidey z = new zombieSpidey(
                "Earth-2149",
                "Spiderman",
                0,
                0,
                0,
                0,
                0,
                0,
                "Male",
                0,
                88.4,
                ""
        );
        Runnable attack = new Runnable(){
            public void run(){

                try{

                    miles.strength(screen);
                    Thread.sleep(5000);

                    miles.spiderSense(screen);
                    Thread.sleep(5000);

                    miles.Swing(screen);
                    Thread.sleep(5000);

                    miles.wallcrawling(screen);
                    Thread.sleep(5000);

                    miles.camouflage(screen);
                    Thread.sleep(5000);

                    miles.venomBlast(screen);
                    Thread.sleep(5000);

                    miles.energyBlast(screen);
                    Thread.sleep(5000);

                    gwen.strength(screen);
                    Thread.sleep(5000);

                    gwen.spiderSense(screen);
                    Thread.sleep(5000);

                    gwen.Swing(screen);
                    Thread.sleep(5000);

                    gwen.wallcrawling(screen);
                    Thread.sleep(5000);

                    z.strength(screen);
                    Thread.sleep(5000);

                    z.spiderSense(screen);
                    Thread.sleep(5000);

                    z.Swing(screen);
                    Thread.sleep(5000);

                    z.wallcrawling(screen);
                    Thread.sleep(5000);

                    z.undead(screen);
                    Thread.sleep(5000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread attackSpidy = new Thread(attack);
        attackSpidy.start();
    }
}
