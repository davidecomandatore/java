class Supermercato:
    def __init__(self, codice, indirizzo, superficie, addetti ) -> None:
        self.codice = codice
        self.indirizzo = indirizzo
        self.superficie = superficie
        self.addetti = addetti
        self.spesatotale = 0
        self.numerospese = 0


    def __str__(self):
        return str(self.indirizzo) 


    def addSpesa(self,spesa):
        self.spesatotale += spesa
        self.numerospese += 1
    
    def calcMedia(self):
        media = self.spesatotale/self.numerospese
        return str(self.codice) + "\t" + str(media)