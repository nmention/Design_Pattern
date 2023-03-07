import java.util.ArrayList;
import java.util.List;

public class TroupeCancaneur implements Cancaneur{
  List<Cancaneur> liste;


  public TroupeCancaneur(){
    liste = new ArrayList<>();
  }

  public void ajouter(Cancaneur cancaneur){
    this.liste.add(cancaneur);
  }

  public void supprime(Cancaneur cancaneur){
    this.liste.remove(cancaneur);
  }
  @Override
  public void cancaner() {
    for (Cancaneur cancaneur : liste){
      cancaneur.cancaner();
    }
  }


}
