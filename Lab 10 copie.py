class Voiture:
    def __init__(self, marque="Ford", couleur="rouge"):
        self.marque=marque
        self.couleur=couleur
        self.pilote="personne"
        self.vitesse=0

    def choix_conducteur(self, pilote):
        self.pilote=pilote

    def accelerer(self, taux, duree):
        if self.pilote == "personne":
            print("Cette voiture n'a pas de conducteur !")
        else:
            self.vitesse= taux * duree
         
    def affiche_tout(self):
        return print(  self.marque, self.couleur, self.pilote ,str(self.vitesse))
    
    def __repr__(self) -> str:
        return str(self.marque + self.couleur + "de" + self.pilote + "roule à" + self.vitesse + "m/s")
    
    def __eq__(self, autre) -> bool:
        return self.marque == autre.marque and self.couleur == autre.couleur 
        

print("\n###Exercice 1###")
a1 = Voiture('jeep', 'blanche')
a2 = Voiture(couleur = 'verte')
a3 = Voiture()
a1.choix_conducteur('paul')
a2.choix_conducteur('pierre')
a2.accelerer(1.8, 12)
a3.accelerer(1.9, 11)
a2.affiche_tout()
a3.affiche_tout()
a1.affiche_tout()


