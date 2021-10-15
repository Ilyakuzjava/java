public class Wall implements Obstacle {
    @Override
    public void overcome(Participants participants) {
        participants.jump();
        System.out.println("- перепрыгнул");
    }


}
