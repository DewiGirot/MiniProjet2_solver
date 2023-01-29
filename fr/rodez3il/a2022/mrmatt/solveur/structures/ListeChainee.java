package fr.rodez3il.a2022.mrmatt.solveur.structures;


import java.util.Arrays;

public class ListeChainee<T> implements Liste<T> {

  private T[] tableau;

  public ListeChainee(int size) throws Exception {
    this.tableau = (T[]) new Object[];
    // this.tab = new T[size];
  }

  /**
   * Ajoute un élément à la liste.
   * 
   * @param element l'élément à ajouter
   */

  public void ajouter(T element) {
    /**
     * Si on a atteint la taille maximale,
     * refaire un tableau en doublant la taille initale
     */
    if (this.tableau.length == this.size) {
      tableau = Arrays.copyOf(tableau, tableau.length * 2);
    }
    this.tableau[size++] = element;
  }

  /**
   * Indique si la liste est vide.
   * 
   * @return true ssi la liste est vide.
   */
  @Override
  public boolean estVide() {
    return this.tableau.length == 0;
  }

  /**
   * Indique la taille de la liste.
   * 
   * @return La taille de la liste.
   */
  @Override
  public int taille() {
    return this.tableau.length;
  }

  /**
   * Enlève (et retourne) l'élément à la position i.
   * 
   * @param i la position de l'élément
   * @return L'élément qui a été supprimé
   */
  @Override
  public T enlever(int i) {
    //ToDo
  }

  /**
   * Renvoie l'élément à la position i.
   * 
   * @param i
   * @return
   */
  @Override
  public T element(int i) {
    //ToDo
  }

  /**
   * Indique s'il existe un élément f dans la liste
   * tel que f.equals(e) est VRAI.
   * 
   * @param e L'élément à comparer.
   * @return
   */
  @Override
  public boolean contient(T e) {
    //ToDo
  }
}
