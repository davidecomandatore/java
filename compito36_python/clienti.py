class Cliente:
    def __init__(self,cognome,nome):
        self.cognome = cognome
        self.nome = nome
        self.visite = []

    def addVisita(self,cod,importo):
        v = Visita(cod,importo)
        self.visite.append(v)
    
    def spesaTotale(self):
        totale = 0 
        for v in self.visite:
            totale += v.getImporto()
        return totale

    def __str__(self):
        return self.cognome + "\t" + self.nome +"\t" + str(self.spesaTotale())


class Visita:
    def __init__(self,codice, importo):
        self.codice = codice
        self.importo = importo

    def getImporto(self):
        return self.importo

    

