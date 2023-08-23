
// Classes representing musical instruments
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the guitar");
    }
}
