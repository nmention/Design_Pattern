public class Begue implements Cancaneur{

  Cancaneur cancaneur;

  public Begue(Cancaneur cancaneur){
    this.cancaneur = cancaneur;
  }
  @Override
  public void cancaner() {
    cancaneur.cancaner();
    cancaneur.cancaner();

  }

}
