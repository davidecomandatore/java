from dipendente import Dipendente


class Nutrizionista(Dipendente):

    def __init__(self, codice, nome, costoOrario, telefono, medico, appuntamenti):
        super().__init__(codice, nome, costoOrario)
        self.telefono = telefono
        self.medico = medico
        self.apputamenti = appuntamenti


    def __str__(self):
        return super().__str__() + "\t Nutrizionista \t - \t -\t "+ \
                                    str(self.telefono) + "\t "+ str(self.medico) +  "\t"+ str(self.apputamenti) +"\t" +\
                                    str(self.getCosto())  