from dipendente import Dipendente

class Trainer(Dipendente):
    def __init__(self, codice, nome, costoOrario,oreWeek, specialita):
        super().__init__(codice, nome, costoOrario)
        self.oreWeek = oreWeek
        self.specialita = specialita

    def __str__(self):
        return super().__str__() + "\t Trainer \t" + str(self.oreWeek) + "\t "+  self.specialita + \
                                    " \t - \t-\t-\t" +\
                                    str(self.getCosto())  