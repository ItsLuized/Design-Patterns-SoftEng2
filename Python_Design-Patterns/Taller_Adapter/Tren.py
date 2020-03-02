from MedioTransporte import *

class Tren(MedioTransporte):

    __costo = 0
    __horario = ''

    def __init__(self):
        print("Creando Tren")

    def getCosto(self):
        return __costo 
    
    def setCosto(self, costo):
        __costo = costo

    def getHorario(self):
        return __horario

    def setHorario(self, horario):
        __horario = horario