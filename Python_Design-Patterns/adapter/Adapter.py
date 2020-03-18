from MotorEconomico import *
from MotorElectricoAdapter import *
from MotorGastalon import *

class Adapter():

    def main(): 

        motor = MotorGastalon()
        motor.encender()
        motor.acelerar()
        motor.apagar()

        motor = MotorEconomico()
        motor.encender()
        motor.acelerar()
        motor.apagar()

        motor = MotorElectricoAdapter()
        motor.encender()
        motor.acelerar()
        motor.apagar()

    if __name__== "__main__":
        main()