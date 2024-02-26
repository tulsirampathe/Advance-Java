import java.util.*;

interface x {
    public void play();

    public void pause();

    public void stop();
}

class AudioPlayer implements x {
    public void play() {
        System.out.println("Audio is Played.");
    }

    public void pause() {
        System.out.println("Audio is Pause");
    }

    public void stop() {
        System.out.println("Audio is stop");
    }
}

class VideoPlayer implements x {
    public void play() {
        System.out.println("Video is Played.");
    }

    public void pause() {
        System.out.println("Video is Pause");
    }

    public void stop() {
        System.out.println("Video is stop");
    }
}

public class Media {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("How to lisen song : ");
        System.out.println("1. Audio \n2.Video");
        int n = in.nextInt();

        AudioPlayer A = new AudioPlayer();
        VideoPlayer V = new VideoPlayer();

        if (n == 1) {
            System.out.println("1. Play \n2. Pause \n3.Stop");
            int choise = in.nextInt();

            do {
                switch (choise) {
                    case 1:
                        A.play();
                        System.out.println("2.Pause \n3.Stop");
                        choise = in.nextInt();
                        break;

                    case 2:
                        A.pause();
                        System.out.println("1. Play");
                        choise = in.nextInt();
                        break;

                    case 3:
                        A.stop();
                        System.out.println("1. Play");
                        choise = in.nextInt();
                        break;

                    default:
                        System.out.println("Wrong input");
                }

            } while (choise != 3);

        } else if (n == 2) {
            System.out.println("1. Play \n2. Pause \n3. Stop");
            int choise = in.nextInt();

            do {
                switch (choise) {
                    case 1:
                        V.play();
                        System.out.println("2. Pause \n3. Stop");
                        choise = in.nextInt();
                        break;

                    case 2:
                        V.pause();
                        System.out.println("1. Play");
                        choise = in.nextInt();
                        break;

                    case 3:
                        V.stop();
                        System.out.println("1. Play");
                        choise = in.nextInt();
                        break;

                    default:
                        System.out.println("Wrong input");
                }

            } while (choise != 3);
        } else {
            System.out.println("Wrong Input");
        }
    }
}