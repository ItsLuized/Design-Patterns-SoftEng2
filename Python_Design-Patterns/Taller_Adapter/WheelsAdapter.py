from Taller_Adapter.MedioTransporte import MedioTransporte
from Taller_Adapter.Wheels import Wheels


class WheelsAdapter(MedioTransporte):

    def __init__(self):
        super().__init__()
        self._wheels = Wheels()

    @property
    def costo(self):
        return self._wheels.precio

    @costo.setter
    def costo(self, costo):
        self._wheels.precio = costo

    @property
    def horario(self):
        return self._wheels.hora

    @horario.setter
    def horario(self, horario):
        self._wheels.hora = horario
