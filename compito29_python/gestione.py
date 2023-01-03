from trainer import Trainer
from nutrizionista import Nutrizionista
from clienti import Cliente
from servizio import Servizio


dipendenti = []
clienti = []
map_dipendenti = {}

try:
    f = open("dipendenti.txt", "r") #apertura del file

    #ciclo while sulle righe
    line = f.readline().strip() #elimina a capo finale 
    while line != "":
        tokens = line.split()
        tipo = tokens[1]
        cod = int(tokens[0]) 
        nome = f.readline().strip()
    
        line = f.readline().strip()   
        tokens = line.split()
        if tipo == "trainer":
            #lettura tipo trainer
            oreweek = int(tokens[0])
            costoOrario = float(tokens[1])
            specialita = f.readline().strip()

            trainer = Trainer(cod,nome,costoOrario,oreweek,specialita)
            dipendenti.append(trainer)
            map_dipendenti[cod] = trainer

        else:
            #lettura tipo nutrizionista
            telefono = int(tokens[0])
            medico = bool(tokens[1])
            appuntamenti = int(tokens[2])
            costoOrario = float(tokens[3])

            nutri = Nutrizionista(cod,nome,costoOrario,telefono,medico,appuntamenti)
            dipendenti.append(nutri) 
            map_dipendenti[cod] = nutri

        line = f.readline().strip()


except IOError as I:
    print(I)
except Exception as e:
    print(e)
print("Codice\tTIPO\tNOME \t ORE SETTIMANALI \t SPECIALITA' \t TELEFONO \t MEDICO \t APPUNTAMENTI SETTIMANIALI \t COSTO ORARIO ")
for dip in dipendenti:
    
    print(dip)
f.close


# PUNTO 2: lettura file clienti.txt
try:
    file = open("clienti.txt", "r", encoding="utf-8")

    line = file.readline().strip()

    while line != "":
        codice = int(line)
        nome = file.readline().strip()

        cliente = Cliente(codice, nome)
        clienti.append(cliente)

        line = file.readline().strip()
        while line != "" and line != "\n":
            tokens = line.split()
            codice_dipendente = int(tokens[0])
            numero_ore = float(tokens[1])

            dipendente = map_dipendenti[codice_dipendente]

            servizio = Servizio(dipendente, numero_ore)
            cliente.addServizio(servizio)
            dipendente.addServizio(servizio)
            
            line = file.readline()
        
        line = file.readline().strip()
    file.close()
except IOError as io_exception:
    print(io_exception)
except Exception as e:
    print(e)


# PUNTO 4: stampa clienti
for cliente in clienti:
    print(cliente)



# PUNTO 5: dipendente con più servizi
max = 0
output = None
for dipendente in dipendenti:
    if len(dipendente.servizi) > max:
        max = len(dipendente.servizi)
        output = dipendente

if output is not None:
    print("\n\nDipendente che ha svolto il maggior numero di servizi: ", output.nome)
else:
    print("Error.")
