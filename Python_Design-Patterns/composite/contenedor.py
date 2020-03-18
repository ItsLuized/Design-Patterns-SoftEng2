from composite.componente import Componente


class Contenedor(Componente):

    def __init__(self, nombre):
        self._nombre = nombre
        self._contenedor = []

    def pintar(self, color):
        for Componente in self._contenedor:
            Componente.pintar(color)
        print(f'Se pinto a {self.nombre} de color {color}')

    @property
    def contenedor(self):
        return self._contenedor

    @contenedor.setter
    def contenedor(self, contenedor):
        self.contenedor = contenedor

    def add(self, Componente):
        self._contenedor.append(Componente)

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
