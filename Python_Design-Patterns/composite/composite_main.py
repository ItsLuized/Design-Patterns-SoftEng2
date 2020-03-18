from composite.etiqueta import Etiqueta
from composite.contenedor import Contenedor

c1 = Etiqueta("et 1")
c2 = Etiqueta("et 2")
c3 = Etiqueta("et 3")
c4 = Etiqueta("et 4")
c5 = Etiqueta("et 5")
c6 = Etiqueta("et 6")

a = Contenedor("Panel 1")
b = Contenedor("Panel 2")
c = Contenedor("Panel 3")

a.add(c1)
a.add(c2)
a.add(c3)

b.add(a)
b.pintar("Anaranjado")

c.add(c4)
c.add(c5)
c.add(c6)
c.pintar("Verde")
