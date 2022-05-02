package practicaMona;

import imonsh.Screen;

public class polimorfismoOctoCat {

    public static void main(String[] args) throws InterruptedException{
        Octocats();
    }

    public static void Octocats(){
        Screen s = new Screen();
        Octocat nux = new Nuxtocat("Nuxtocat","admiring new tech!!!!","C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\NUX_Octodex.gif");
        Octocat yogi = new Yogitocat("Yogitocat", "meditating...", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\yogitocat.png");
        Octocat daft = new DaftPunk("DaftPunktoCat", "Singing...", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\daftpunktocat-guy.gif");
        Octocat iron = new IronCat("IronCat", "defending the world!!!", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\ironcat.jpg");
        Octocat female = new FemaleCodertocat("FemaleCodertocat", "waiting a team to work...", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\femalecodertocat.png", "Female");
        Octocat support = new Supportcat("Supportcat", "assisting users.", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\supportcat.png", "female");
        Octocat collab = new Collabcats("Collabcats", "working together for better results!!!!", "C:\\Users\\n22j1\\IdeaProjects\\DemoLaunchX\\src\\practicaMona\\collabocats.jpg", "male or female", 1);

        try{
            nux.show();
            Thread.sleep(7000);

            yogi.show();
            Thread.sleep(7000);

            daft.show();
            Thread.sleep(7000);

            iron.show();
            Thread.sleep(7000);

            female.show();
            Thread.sleep(7000);

            support.show();
            Thread.sleep(7000);

            collab.show();
            Thread.sleep(7000);


        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
};
