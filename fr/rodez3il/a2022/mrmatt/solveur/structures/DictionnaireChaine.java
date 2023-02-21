package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {

  class Entree<C, V> {
    /*
    * cle : attribut représenant une clé de type C
    * valeur : attribut représenant une valeur de type V
    */
    private C cle;
    private V valeur;

    public Entree(C cle, V valeur) {
      this.cle = cle;
      this.valeur = valeur;
    }
    
    /*
    * @return retourne la donnée d'une entrée
    */
    public V getDonnee() {
      return this.valeur;
    }

    /*
    * @return retourne la clé d'une entrée
    */
    public C getCle() {
      return this.cle;
    }
  }

  /*
   * Liste chainée de type entrée qui elle même possède deux types générique
   */
  private ListeChainee<Entree<C, V>> list;

  public DictionnaireChaine() {
    this.list = new ListeChainee<Entree<C, V>>();
  }

  /**
   * Ajoute un couple <Clé, Valeur> au dictionnaire.
   * 
   * @param cle    clé du dictionnaire
   * @param valeur valeur correspondant à la clé également passé en paramètres
   */
  @Override
  public void inserer(C cle, V valeur) {
    for (int i = 0; i < this.list.taille(); i++) {
      if (this.list.element(i).cle.equals(cle)) {
        this.list.element(i).valeur = valeur;
      }
    }
    list.ajouter(new Entree<C, V>(cle, valeur));
  }

  /**
   * Indique s'il existe une clé f dans le dictionnaire
   * telle que f.equals(cle) est VRAI.
   * 
   * @param cle clé de la valeur rechercher
   * @return vrai si l'élément ayant la clé passée en paramètre existe dans la
   *         liste du dictionnaire
   */
  @Override
  public boolean contient(C cle) {
    for (int i = 0; i < this.list.taille(); i++) {
      if (this.list.element(i).cle.equals(cle)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Renvoie la valeur associée à la clé.
   * 
   * @param cle clé de la valeur rechercher
   * @return NULL si la clé n'existe pas, sinon retourne la valeur correspondant à
   *         la clé cle
   */
  @Override
  public V valeur(C cle) {
    for (int i = 0; i < this.list.taille(); i++) {
      if (this.list.element(i).cle.equals(cle)) {
        return this.list.element(i).valeur;
      }
    }
    return null;
  }
}