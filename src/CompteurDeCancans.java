public class CompteurDeCancans implements Cancaneur {
  Cancaneur cancaneur;
  static int nbCancans = 0;

  public CompteurDeCancans(Cancaneur cancaneur){
    this.cancaneur = cancaneur;
  }


  public static int getNbCancans() {
    return nbCancans;
  }

  @Override
  public void cancaner() {
    cancaneur.cancaner();
    nbCancans ++;
  }
}
