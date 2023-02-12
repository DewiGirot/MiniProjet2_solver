package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeChainee;
import fr.rodez3il.a2022.mrmatt.solveur.structures.DictionnaireChaine;
import fr.rodez3il.a2022.mrmatt.sources.*;

public class Noeud {

  private DictionnaireChaine<Integer, String> configuration;
  private Niveau etatNiveau;
  private String[] fils;
  private ListeChainee<String> commandes;

  public Noeud(DictionnaireChaine<Integer, String> configuration, Niveau etatNiveau, ListeChainee<String> commandes) {
    this.configuration = configuration;
    this.etatNiveau = etatNiveau;
    this.fils = new String[4];
    this.commandes = commandes;
  }

  public String[] getFils() {
    return this.fils;
  }

  // To check
  public Boolean visiter() {
    return this.commandes.estVide();
  }

  // ToDo
  public void calculerFils() {
    if (visiter() != null) {
      configuration.inserer(this.fils.length, etatNiveau.toString());
      for (int i = 0; i < 4; i++) {
        // ToDo
      }
    }
  }

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

  @Override
  public int hashCode() {
    return this.configuration.hashCode()
        * this.etatNiveau.hashCode()
        * this.fils.hashCode()
        * this.commandes.hashCode();
  }

}
