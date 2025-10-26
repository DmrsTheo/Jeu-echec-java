# ♟️ Jeu d’échecs en Java

Un projet de simulation d’un jeu d’échecs en **Java**, développé dans une optique d’apprentissage de la **programmation orientée objet** et des **design patterns**.

---

## 🎯 Motivation du projet

Le jeu d’échecs est l’un de mes passe-temps favoris, et c’est avant tout cette passion qui m’a donné envie de développer ma propre version en Java.  
Ce projet est également devenu un excellent support d’apprentissage me permettant d’expérimenter différents **design patterns** vus en cours et de consolider mes connaissances en **programmation orientée objet**.  

À terme, j’aimerais y intégrer une **intelligence artificielle** basée sur l’algorithme **Minimax**, afin de mettre en pratique les notions étudiées au sein de mon cursus en informatique.

---

## ⚙️ Fonctionnalités actuelles

- Génération d’un **échiquier 8x8** avec les pièces disposées selon les règles officielles  
- Création automatique des **figurines** (pièces) à partir de leur **type** et **couleur** 
- Représentation textuelle complète de l’échiquier dans le terminal 
- Architecture orientée objet respectant la hiérarchie suivante :
  - `Piece` (classe abstraite)
  - `Pion`, `Tour`, `Cavalier`, `Fou`, `Roi`, `Dame`
  - `Figurine` : encapsule une pièce concrète
  - `Echiquier` : gère la grille et l’initialisation des pièces
  - `CreationPiece` : fabrique les instances selon le type (pattern **Factory**)

---

## 🧱 Structure du projet
```
src/
├── Main.java
├── Echiquier.java
├── Figurine.java
├── CreationPiece.java
├── TypePiece.java
├── pieces/
│ ├── Piece.java
│ ├── Pion.java
│ ├── Tour.java
│ ├── Cavalier.java
│ ├── Fou.java
│ ├── Dame.java
│ └── Roi.java
```
---

## 🚀 Installation et exécution

### Prérequis

Java 17 ou supérieur (JDK installé)

### Etapes

1. **Cloner le dépôt :**
    ```bash
    git clone https://github.com/<nom-utilisateur>/<nom-du-repository>.git
2. **Se rendre dans le projet**
    cd <nom-du-repository>
3. **Compiler les fichiers Java**
    javac src/*.java
4. **Exécuter le programme principal**
    java src/Main

---

## 🖥️ Affichage dans le terminal
```
t c f d r f c t
p p p p p p p p
. . . . . . . .
. . . . . . . .
. . . . . . . .
. . . . . . . .
P P P P P P P P
T C F D R F C T
```
---

## 💡 Améliorations futures

- [ ] Implémenter les déplacements de chaque pièce selon les règles des échecs  
- [ ] Gérer les conditions spéciales (échec, échec et mat, roque, promotion, prise en passant)  
- [ ] Ajouter une interface graphique avec JavaFX  
- [ ] Permettre la sauvegarde et le chargement des parties  
- [ ] Ajouter des tests unitaires pour valider la logique du jeu  
- [ ] Implémenter un mode joueur contre IA  

## 👤 Auteur

**Théo De Morais**    