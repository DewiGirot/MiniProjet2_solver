package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {

  class Entree<C, V> {
    private C cle;
    private V valeur;

    public Entree(C cle, V valeur) {
      this.cle = cle;
      this.valeur = valeur;
    }

    public V getDonnee() {
      return this.valeur;
    }

    public C getCle() {
      return this.cle;
    }
  }

  private ListeChainee<Entree<C, V>> list;

  public DictionnaireChaine() {
    this.list = new ListeChainee<Entree<C, V>>();
  }

  /**
   * Ajoute un couple <Clé, Valeur> au dictionnaire.
   * 
   * @param cle
   * @param valeur
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
   * @param cle
   * @return
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
   * @param cle
   * @return NULL si la clé n'existe pas.
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