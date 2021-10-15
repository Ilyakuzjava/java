public class main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new Wall(),new RunningTrack() };
        Participants[] participants = {new Cat(),new Human(),new Robot()};

        for(int i=0; i < participants.length; i++) {
            for(int j=0; j < obstacles.length; j++) {
                obstacles[j].overcome(participants[i]);
            }
        }
    }
}
