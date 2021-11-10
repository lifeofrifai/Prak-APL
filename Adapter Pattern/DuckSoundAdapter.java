public class DuckSoundAdapter implements Cat  {
  private Duck duck;

  public DuckSoundAdapter(Duck duck) {
    this.duck = duck;
  }


  @Override
  public void sound(){
    duck.sound();
  }
}
