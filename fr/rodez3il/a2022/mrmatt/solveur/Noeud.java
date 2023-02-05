package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeChainee;
import fr.rodez3il.a2022.mrmatt.solveur.structures.DictionnaireChaine;
import fr.rodez3il.a2022.mrmatt.sources.*;

public class Noeud {

  private DictionnaireChaine<Integer, String> configuration;
  private Niveau etatNiveau;
  private int[] fils;
  private ListeChainee<String> commandes;

  public Noeud(Niveau etatNiveau) {
    this.etatNiveau = etatNiveau;
    this.fils = new int[4];
    this.configuration = new DictionnaireChaine<>();
  }

  public void visiter() {
    // getter
  }

  public void calculerFils() {
    // ToDo
  }

  @Override
  public boolean equals(Object o) {
    return this.etatNiveau.equals(o);
  }

  @Override
  public int hashCode() {
    return this.configuration.hashCode()
        * this.etatNiveau.hashCode()
        * this.fils.hashCode()
        * this.commandes.hashCode();
  }

}
