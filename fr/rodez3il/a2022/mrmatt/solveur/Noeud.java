package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeChainee;
import fr.rodez3il.a2022.mrmatt.solveur.structures.DictionnaireChaine;
import fr.rodez3il.a2022.mrmatt.sources.*;

public class Noeud {

  private DictionnaireChaine<Integer, String> configuration;
  private Niveau etatNiveau;
  private Noeud[] fils;
  private String commandes;
  private boolean visiter;

  public Noeud(DictionnaireChaine<Integer, String> configuration, Niveau etatNiveau, ListeChainee<String> commandes) {
    this.configuration = configuration;
    this.etatNiveau = etatNiveau;
    this.fils = new Noeud[4];
    this.visiter = false;
  }

  /*
   * 
   * @return this.fils retourne la liste des noeuds fils du noeud actuel
   */
  public Noeud[] getFils() {
    return this.fils;
  }

  /*
   *
   * @return this.visiter retourne le noeud a déjà été visité
   */
  public Boolean visiter() {
    return this.visiter;
  }

  // ToDo
  public void calculerFils() {
    if (visiter() != null) {
      configuration.inserer(this.fils.length, etatNiveau.toString());
      Commande[] commandesNoeud = Commande.values();
      for (int i = 0; i < 4; i++) {
        Niveau nouvelEtat = this.etatNiveau;
        Commande c = lireCommande(i*2);
        if(etatNiveau.jouer(c) == true){
          String nouvelleChaine = this.commande + nouvelEtat;
          Integer hash = nouvelEtat.hashCode();
          String valeurChaine = configuration.get(hash);
          if(nouvelEtat.estGagne()){
            System.out.println("Solution trouvée : " + nouvelleChaine);
          }
        }
      }
    }
  }

  /*
  * @param obj object à comparer
  * @return retourne si l'object comparé est égale à celui du comparant
  */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Noeud)) {
      return false;
    }
    Noeud other = (Noeud) obj;
    return this.etatNiveau.toString().equals(other.etatNiveau.toString());
  }

  /*
  * @return retourne le hash d'un noeud
  */
  @Override
  public int hashCode() {
    return this.configuration.hashCode()
        * this.etatNiveau.hashCode()
        * this.fils.hashCode()
        * this.commandes.hashCode();
  }

}
