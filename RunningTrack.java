public class RunningTrack implements Obstacle {
    public void overcome(Participants participants) {
        participants.run();
        System.out.println("- пробежал");
        System.out.println();
    }


}
