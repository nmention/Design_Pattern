public class AdapteurDOie implements Cancaneur{
  Oie oie;

  public AdapteurDOie(Oie oie){
    this.oie = oie;
  }

  @Override
  public void cancaner() {
      oie.cacarder();
  }
}
