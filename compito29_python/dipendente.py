class Dipendente:
        def __init__(self, codice, nome, costoOrario):
            self.codice = codice
            self.nome = nome
            self.costoOrario = costoOrario
            self.servizi = []
       
        def getCosto(self):
            return self.costoOrario

        def addServizio(self,servizio):
            self.servizi.append(servizio)

        def __str__(self):
            return str(self.nome) + "/n" + str(self.codice)


   