class MedioTransporte():

    def __init__(self):
        self._horario = ''
        self._costo = 0

    @property
    def costo(self):
        return self._costo

    @costo.setter
    def costo(self, costo):
        _costo = costo

    @property
    def horario(self):
        return self._horario

    @horario.setter
    def horario(self, horario):
        _horario = horario
