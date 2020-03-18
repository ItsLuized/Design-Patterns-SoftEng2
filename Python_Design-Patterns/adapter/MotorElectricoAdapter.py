from MotorElectrico import *
from Motor import *

class MotorElectricoAdapter(Motor):

    def __init__(self):
        self.motorElectrico = MotorElectrico()

    def encender(self):
        self.motorElectrico.conectar()
        self.motorElectrico.activar()

    def acelerar(self):
        self.motorElectrico.moverMasRapido()

    def apagar(self):
        self.motorElectrico.detener()
        self.motorElectrico.desconectar()