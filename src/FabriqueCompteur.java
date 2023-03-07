public class FabriqueCompteur implements Fabrique{

  @Override
  public Cancaneur creerColvert() {
    return new CompteurDeCancans(new Colvert());
  }

  @Override
  public Cancaneur creerMandarin() {
    return new CompteurDeCancans(new Mandarin());
  }

  @Override
  public Cancaneur creerCanardPlastique() {
    return new CompteurDeCancans(new CanardPlastique());
  }

  @Override
  public Cancaneur creerAppeau() {
    return new CompteurDeCancans(new Appeau());
  }

  @Override
  public Cancaneur creerOie() {
    return new CompteurDeCancans(new AdapteurDOie(new Oie()));
  }
}
