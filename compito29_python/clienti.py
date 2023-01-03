from servizio import Servizio

class Cliente:

    def __init__(self, codice, nome):
        self.nome = nome
        self.codice = codice
        self.servizi = []

    def addServizio(self, serv):
        self.servizi.append(serv)

    def totSpesa(self):
        totale = 0
        for s in self.servizi:
            totale += s.getImporto()
        return totale

    def __str__(self) -> str:
        return str(self.codice) +"\t" + self.nome +"\t"+ str(self.totSpesa())
            


