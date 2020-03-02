from Bus import *
from Tren import *
from WheelsAdapter import *

transporte = Bus()
costo = input('¿Cual es el costo del Bus?  ')
horario = input('¿Cual es el horario del Bus?  ')
transporte.setCosto(costo)
transporte.setHorario(horario)
print("BUS:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))

transporte = Tren()
costo = input('¿Cual es el costo del Tren?  ')
horario = input('¿Cual es el horario del Tren?  ')
transporte.setCosto(costo)
transporte.setHorario(horario)
print("TREN:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))

transporte = WheelsAdapter()
costo = input('¿Cual es el costo del Wheels?  ')
horario = input('¿Cual es el horario del Wheels?  ')
transporte.setCosto(costo)
transporte.setHorario(horario)
print("WHEELS:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))