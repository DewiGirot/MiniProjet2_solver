package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeTableau<E> implements Liste<E> {

  public void ajouter(T element);

  public boolean estVide();

  public int taille();

  public T enlever(int i);

  public T element(int i);

  public boolean contient(T e);
}