public class SoundMain {
  public static void main(String[] args) {
    Duck duck = new DuckSound();

    Cat duckSoundAdapter = new DuckSoundAdapter(duck);
    System.out.println("Suara Kucing Yaitu\nMeowwww Meowwww!!!!" );
    System.out.println("-------------------");
    System.out.println("Suara Kucing KW Yaitu ");
    duckSoundAdapter.sound();

  }
}
