from cittadino import Cittadino
from iper import Iper
from clienti import Cliente
import sys

supermercati = [] #lista per lettura
clienti = []
cod_sup = {}

try:
    f = open("supermercati.txt", "r") #apertura del file

    #ciclo while sulle righe
    line = f.readline().strip() #elimina a capo finale 
    while line != "":
        tokens = line.split()
        cod = int(tokens[0]) 
        tipo = tokens[1]
        indirizzo = f.readline().strip()
        line = f.readline().strip()
        tokens = line.split()
        if tipo == "cittadino":
            apertura = int(tokens[0])
            chiusura = int(tokens[1])
            super = float (tokens[2])
            addetti = int (tokens[3])
            citt = Cittadino(cod,indirizzo,super,addetti,apertura,chiusura)
            supermercati.append(citt)
            cod_sup[cod] = citt
        else:
            superficie = float(tokens[0])
            addetti = int(tokens[1])
            nome = f.readline().strip()
            iper = Iper(cod,indirizzo,superficie,addetti,nome)
            supermercati.append(iper) 
            cod_sup[cod] = iper

        line = f.readline().strip()


except IOError as I:
    print(I)
except Exception as e:
    print(e)
print("Codice\tTIPO\tINDIRIZZO \t APERTURA \t CHIUSURA \t SUPERFICE \t ADDETTI \t CENTRO COMMERCIALE ")
for super in supermercati:
    
    print(super)
f.close

try:
    f1 = open("clienti.txt", "r")
    line = f1.readline().strip()
   
    while line != "": 
        cognome = line
        nome = f1.readline().strip()
        c = Cliente(cognome,nome)
        clienti.append(c)
        
        line = f1.readline().strip()

        while line != "":
            tokens = line.split()
            cod = int(tokens[0])
            importo = float(tokens[1])
            c.addVisita(cod,importo)
            cod_sup.get(cod).addSpesa(importo)
            line = f1.readline().strip()

        line = f1.readline().strip()
    f1.close

except IOError as io:
    print(io)
except Exception as e:
    print(e)

print("COGNOME \t NOME \t SPESA TOTALE")

for c in clienti:
    print(c)

codice = int(sys.argv[1])
print(cod_sup.get(codice).calcMedia())
