package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeChainee<T> implements Liste<T> {

  class Maillon {
    private T donnee;
    private Maillon suivant;

    public Maillon(T donnee) {
      this.donnee = donnee;
      this.suivant = null;
    }

    public T getDonnee() {
      return this.donnee;
    }

    public void setSuivant(Maillon suivant) {
      this.suivant = suivant;
    }
  }

  private Maillon[] tableau;

  public ListeChainee() {
    this.tableau = (Maillon[]) new Object[0];
  }

  /**
   * Ajoute un élément à la liste.
   * 
   * @param element l'élément à ajouter
   */
  @Override
  public void ajouter(T element) {
    this.tableau = Arrays.copyOf(this.tableau, this.tableau.length + 1);
    int size = this.tableau.length;
    
    this.tableau[size] = new Maillon(element);
    this.tableau[size - 1].setSuivant(this.tableau[size]);
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
    Maillon temp = this.tableau[i];
    for(int y=i; y<this.tableau.length-1; y++){
      this.tableau[y] = this.tableau[y+1];
    }
    this.tableau[i-1].setSuivant(this.tableau[i]);
    this.tableau = Arrays.copyOf(this.tableau, this.tableau.length - 1);
    return temp;
  }

  /**
   * Renvoie l'élément à la position i.
   * 
   * @param i
   * @return
   */
  @Override
  public T element(int i) {
    if (i < 0 || i >= this.size) {
      throw new IndexOutOfBoundsException();
    }
    return tableau[i];
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
    for (int i = 0; i < this.size; i++) {
      if (tableau[i].equals(e)) {
        return true;
      }
    }
    return false;
  }
}
