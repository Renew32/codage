import random
def grande_fonction():
    a,b=demandeVal()
    generate_random_number(a,b)
    recommencer(a,b)

def generate_random_number(a,b):
        print("\n")
        if a>b:
            m=random.randint(a,b)
        elif b>a:
            m=random.randint(a,b)
        else:
            m=a
        result=print(f"Le nombre aleatoire trouve est {m}")
        return result



def recommencer(a,b):
    while True:
        print("\n")
        rep1=input("voulez-vous recommencer?")
        print("\n")
        rep1=rep1.upper()
        if rep1=="OUI" or rep1=="YES":
            rep2=input("avec les meme valeur ?")
            rep2 = rep2.upper()
            if rep2=="OUI" or rep2=="YES":
                generate_random_number(a,b)
            else :
                a,b=demandeVal()
                generate_random_number(a,b)
        else:
            print("D'accord bonne journée")
            break

def demandeVal():
    while True:
        try:
            a=int(input("\nQuelle est la borne a gauche de l'intervalle\n"))
            b=int(input("\nQuelle est la borne a droit de l'intervalle\n"))
            return a,b
        except ValueError:
            print("Entrez uniquement des valeurs entière")
    

grande_fonction()

