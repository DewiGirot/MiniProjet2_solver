package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.LinkedList;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {

  private LinkedList<C,V> list = new LinkedList<C,V>();
  
	/**
	 * Ajoute un couple <Clé, Valeur> au dictionnaire.
	 * @param cle
	 * @param valeur
	 */
  @Override
	public void inserer(C cle, V valeur){
    
  }

	/**
	 * Indique s'il existe une clé f dans le dictionnaire
	 * telle que f.equals(cle) est VRAI.
	 * @param cle
	 * @return
	 */
  @Override
	public boolean contient(C cle){
    
  }

	/**
	 * Renvoie la valeur associée à la clé.
	 * @param cle
	 * @return NULL si la clé n'existe pas.
	 */
  @Override
	public V valeur(C cle){
    
  }
	
}