from datetime import datetime, timedelta
def heure():
    try :
        print("Repondez par OUI ou NON")
        x=str(input("venez vous d'arriver?",))
        temps=datetime.now()
        
        if x=="OUI":
            try :
                print("Tu t'es enregistré à:", temps.strftime('%H:%M:%S'))
            except ValueError:
                print("Veuillez saisir OUI ou NON pour cette question")

        elif x=="NON":
            try:
                v=float(input("vous etes arriver il y a combien de minutes"))
                temps=temps-timedelta(minutes=v)
                print("Tu t'es enregistré:",temps.strftime('%H:%M:%S'))
            except ValueError:
                print("Entrez des nombres")

    except ValueError:
        print('Il y a eu une erreur')
    return temps

heure()


