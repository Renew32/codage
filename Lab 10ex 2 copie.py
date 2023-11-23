class CompteBancaire:
    def __init__(self, nom="Dupont", solde=1000):
        self.nom=nom
        self.solde=solde
    
    def depot(self, somme):
        self.solde = self.solde+somme

    def retrait(self,somme):
        self.solde -= somme

    def affiche(self):
        return print( "le solde de", self.nom, "est de", self.solde, "DOLLARS")
    
    def __eq__(self, autre: object) -> bool:
        return self.solde == autre.solde and self.nom == autre.nom
    
    def __repr__(self) -> str:
        return print(self.nom, self.solde)

print("\n ###exercice2###")
compte1 = CompteBancaire('Duchmol', 800)
compte1.depot(350)
compte1.retrait(200)
compte1.affiche()
compte2 = CompteBancaire()
compte2.depot(25)
compte2.affiche()


class CompteEpargne(CompteBancaire):
    def __init__(self, nom, solde, taux_dinteret=0.3, ):
        CompteBancaire.__init__(self, nom, solde)
        self.taux_dinteret=taux_dinteret
    
    def changeTaux(self,valeur):
        self.taux_dinteret = valeur

    def capitalisation(self,nombreMois):
        print(f"Capitalisation sur {nombreMois} mois au taux mensuel de {self.taux_dinteret}")
        for i in range(nombreMois):
            self.solde = self.solde*((1+self.taux_dinteret/100))

print("\n ###part 2###")
c1 = CompteEpargne('paul', 600)
c1.depot(350)
c1.retrait(200)
c1.affiche()
c1.capitalisation(12)
c1.affiche()
c1.changeTaux(0.5)
c1.capitalisation(12)
c1.affiche()
