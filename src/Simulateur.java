public class Simulateur {

  public void simuler(){
    Fabrique fabrique = new FabriqueCompteur();
    Cancaneur colvert = fabrique.creerColvert();
    Cancaneur mandarin = fabrique.creerMandarin();
    Cancaneur canardEnPlastique = fabrique.creerCanardPlastique();
    Cancaneur appeau = fabrique.creerAppeau();
    Cancaneur oie = fabrique.creerOie();



    TroupeCancaneur troupe = new TroupeCancaneur();
    troupe.ajouter(fabrique.creerAppeau());
    troupe.ajouter(fabrique.creerOie());


    //Cancaneur oieBegue = new Begue(new AdapteurDOie(new Oie()));
    System.out.println("Simulateur de Canards");
    simuler(colvert);
    simuler(mandarin);
    simuler(canardEnPlastique);
    simuler(appeau);
    simuler(oie);

    System.out.println();
    System.out.println();

    simuler(troupe);
    //simuler(oieBegue);
    System.out.println("Nous avons compté " + CompteurDeCancans.getNbCancans() + " cancans");
  }
  public void simuler(Cancaneur c){
    c.cancaner();
  }
}
