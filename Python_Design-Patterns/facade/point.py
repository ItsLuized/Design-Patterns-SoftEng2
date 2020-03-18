import math
from facade.point_carte import PointCarte
from facade.point_polar import PointPolar


class Point:

    def __init__(self, x, y):
        pc = PointCarte(x, y)

    def __str__(self):
        return self.pc.__str__()

    def rotate(self, angle, Point):
        x = self.pc.x() - Point.pc.x()
        y = self.pc.y() - Point.pc.y()

        pp = PointPolar(math.sqrt(math.pow(x, 2)) + math.pow(y, 2),
                        math.atan2(y, x) * 180 / math.pi)

        pp.rotate(angle)
        print(f'PointPolar is {pp}')
        my_string = pp.__str__()
        i = my_string.index('@')
        r = float(my_string.string[1:i])
        a = float(my_string.string[i + 1:my_string.__len__() - 1])

        pc = PointCarte(r * math.cos(a * math.pi / 180) + Point.pc.x(),
                        r * math.sin(a * math.pi / 180) + Point.pc.y())
