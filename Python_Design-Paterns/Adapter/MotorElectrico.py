class MotorElectrico():

    conectado = False

    def __init__(self):
        print("Creando motor electrico")
        global conectado
        conectado = False

    def conectar(self):
        print("Conectando motor electrico")
        global conectado
        conectado = True

    def activar(self):
        if not conectado:
            print("No se puede activar porque no esta conectado el motor electrico")
        else:
            print("Esta conectado, activando motor electrico...")

    def moverMasRapido(self):
        if not conectado:
            print("No se puede mover más rapido porque no esta conectado el motor electrico")
        else:
            print("Moviendo más rapido... aumentando voltaje")

    def detener(self):
        if not conectado:
            print("No se puede detener porque no esta conectado el motor electrico")
        else:
            print("Deteniendo el motor electrico")

    def desconectar(self):
        print("Desconectando motor electrico")
        global conectado
        conectado = False