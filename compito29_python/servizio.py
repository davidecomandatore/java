from dipendente import Dipendente

class Servizio:
    def __init__(self, dipendente, oreServizio):
        self.dipendente = dipendente
        self.oreServizio = oreServizio

    def getImporto(self):
        totale = self.dipendente.getCosto() * self.oreServizio
        return totale

        