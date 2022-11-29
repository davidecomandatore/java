from supermercato import Supermercato

class Iper(Supermercato):
    def __init__(self, codice, indirizzo, superficie, addetti, nome) -> None:
        super().__init__(codice, indirizzo, superficie, addetti)
        self.nome = nome


    def __str__(self):
        return str(self.codice) +"\t Iper \t" +super().__str__() + "\t - \t - \t" +\
            str(self.superficie)+"\t"+str(self.addetti)+"\t"+ self.nome    