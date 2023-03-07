public class FabriqueCancaneur implements Fabrique {


  @Override
  public Cancaneur creerColvert() {
    return new Colvert();
  }

  @Override
  public Cancaneur creerMandarin() {
    return new Mandarin();
  }

  @Override
  public Cancaneur creerCanardPlastique() {
    return new CanardPlastique();
  }

  @Override
  public Cancaneur creerAppeau() {
    return new Appeau();
  }

  @Override
  public Cancaneur creerOie() {
    return new AdapteurDOie(new Oie());
  }
}



