class Wheels():

    __precio = 0
    __hora = ''

    def __init__(self):
        print("Creando Wheels")

    def getPrecio(self):
        return __precio 
    
    def setPrecio(self,precio):
        __precio = precio

    def getHora(self):
        return __hora

    def setHora(self, hora):
        __hora = hora