from MedioTransporte import *
from Wheels import *

class WheelsAdapter(MedioTransporte):

    def __init__(self):
        self.Wheels = Wheels()

    def getCosto(self):
        return Wheels.getPrecio()
    
    def setCosto(self, costo):
        Wheels.setPrecio(self, costo)

    def getHorario(self):
        return Wheels.getHora()

    def setHorario(self, horario):
        Wheels.setHora(self, horario)