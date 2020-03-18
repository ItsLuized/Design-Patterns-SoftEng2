from composite.componente import Componente


class Etiqueta(Componente):
    _nombre = ""

    def __init__(self, nombre):
        self._nombre = nombre

    """Implementamos el método pintar de la interface Componente.
     El método nos indica simplemente que este componente se pinto con el
     color que se nos indicó.
     El mensaje es para asegurar esta acción.
     """

    def pintar(self, color):
        print(f'Se pinto a {self.nombre} de color {color}')

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre
