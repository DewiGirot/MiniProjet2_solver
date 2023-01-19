package fr.rodez3il.a2022.mrmatt.solveur.structures;
import java.util.Arrays;

public class ListeTableau<T> implements Liste<T> {

  private ArrayList<T> tab;
  private int size = 0;

  public ListeTableau(int size) throws Exception {
    if(size < 0){
      throw new Exception('Vous ne pouvez pas indiquer une taille inférieure à 0');
    }
    if(size == null)(
      size = 0;
    )
    this.tab = new ArrayList<T>()[size];
    this.size = size;
  }

  public void ajouter(T element) throws Exception {
    if(this.tab.size == this.size) {
      throw new Exception('Taille du tableau maximal atteint');
    }
    this.tab.add(element);
  }

  public boolean estVide(){
    return this.tab.size == 0 ? true : false;
  }

  public int taille(){
    return this.size;
  }

  public T enlever(int i){
    T tmp = this.tab[i];
    this.tab.remove(i);
    return tmp:
  }

  public T element(int i){
    return this.tab[i];
  }

  public boolean contient(T e){
    return this.tab.contains(e);
  }
}