package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeTableau<T> implements Liste<T> {

  private ArrayList<T> tab;
  private int size = 0;

  public ListeTableau(int size) throws Exception {
    if (size < 0) {
      throw new Exception("Vous ne pouvez pas indiquer une taille inférieure à 0");
    }
    this.size = size;
    this.tab = new ArrayList<T>()[size];
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
    if (this.tab.size >= this.size) {
      ArrayList<T> tmp = this.tab;
      this.tab = new ListeTableau(tmp.size * 2);
      for (int i = 0; i < tmp.size(); i++) {
        this.tab[i] = tmp[i];
      }
      this.tab.add(element);
    } else {
      this.tab.add(element);
    }
  }

  /**
   * Indique si la liste est vide.
   * 
   * @return true ssi la liste est vide.
   */
  public boolean estVide() {
    return this.tab.size == 0 ? true : false;
  }

  /**
   * Indique la taille de la liste.
   * 
   * @return La taille de la liste.
   */
  public int taille() {
    return this.size;
  }

  /**
   * Enlève (et retourne) l'élément à la position i.
   * 
   * @param i la position de l'élément
   * @return L'élément qui a été supprimé
   */
  public T enlever(int i) {
    T tmp = this.tab[i];
    this.tab.remove(i);
    for (int y = 0; y < this.tab.size(); y++) {
      this.tab[y] = this.tab[y + 1];
    }
    return tmp;
  }

  /**
   * Renvoie l'élément à la position i.
   * 
   * @param i
   * @return
   */
  public T element(int i) {
    return this.tab[i];
  }

  /**
   * Indique s'il existe un élément f dans la liste
   * tel que f.equals(e) est VRAI.
   * 
   * @param e L'élément à comparer.
   * @return
   */
  public boolean contient(T e) {
    return this.tab.contains(e);
  }
}