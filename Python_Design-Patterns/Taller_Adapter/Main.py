from Taller_Adapter.Bus import *
from Taller_Adapter.Tren import *
from Taller_Adapter.WheelsAdapter import *

transporte = Bus()
costo = input('¿Cual es el costo del Bus?  ')
horario = input('¿Cual es el horario del Bus?  ')
transporte.costo = costo
transporte.horario = horario
print("\n\nBUS:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))

transporte = Tren()
costo = input('¿Cual es el costo del Tren?  ')
horario = input('¿Cual es el horario del Tren?  ')
transporte.costo = costo
transporte.horario = horario
print("\n\nTREN:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))

transporte = WheelsAdapter()
costo = input('¿Cual es el costo del Wheels?  ')
horario = input('¿Cual es el horario del Wheels?  ')
transporte.costo = costo
transporte.horario = horario
print("\n\nWHEELS:\nHorario: {} \nCosto: {}\n\n".format(horario, costo))
