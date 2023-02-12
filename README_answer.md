# Réponses aux questions


### Question 1: Quel est le type du tableau à utiliser ?
Réponse : On utilisera un tableau de type T (le type générique)

## 
### Question 2: Selon vous, quelles sont les différences majeures entre ListeTableau et ListeChainee ?
Réponse : Les différences majeunes viennent premierement des types que l'on utilise, dans listeTableau on utilise directement le type générique alors que dans listeChainee on utilise une classe en interne qui elle même exploite le type générique.
Deuxiemement, lorsqu'on supprime un élément de listeTableau, celui-ci est détruit et le tableau décalle les index des éléments suivant pour reformater le tableau. Contrairement à ce système, listeChainee utilise un système qui relie chaque élément du tableau au suivant, de ce fait lorsqu'un élément est détruit, l'élément précédant celui-ci doit être modifié pour être relié à l'élément suivant celui détruit.

## 
### Question 3: Dans votre code, le type statique de vos références de liste et dictionnaires est-il celui de vos implémentations concrètes ? Pourquoi ?
Réponse : 