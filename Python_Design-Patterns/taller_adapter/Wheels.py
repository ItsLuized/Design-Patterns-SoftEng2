class Wheels:

    def __init__(self):
        print("Creando Wheels")
        self.__precio = 0
        self.__hora = ''

    @property
    def precio(self):
        return self.__precio

    @precio.setter
    def precio(self, precio):
        __precio = precio

    @property
    def hora(self):
        return self.__hora

    @hora.setter
    def hora(self, hora):
        __hora = hora
