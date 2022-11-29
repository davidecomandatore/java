from supermercato import Supermercato

class Cittadino(Supermercato):
    def __init__(self,  codice, indirizzo, superficie, addetti , orarioap, orarioch) -> None:
        super().__init__(codice, indirizzo, superficie, addetti)
        self.orarioap = orarioap
        self.orarioch = orarioch



    def __str__(self):
        return str(self.codice) +"\t Cittadino \t" +super().__str__() + "\t"+ \
            str(self.orarioap)+"\t"+str(self.orarioch)+"\t"+str(self.superficie)+"\t"+str(self.addetti)+"\t -"