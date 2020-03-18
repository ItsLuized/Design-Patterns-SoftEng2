class PointPolar:

    def __init__(self, r, a):
        self.radius = r
        self.angle = a

    def rotate(self, angle):
        self.angle += angle % 360

    def __str__(self):
        return f'[{self.radius}@{self.angle}]'

    @property
    def angle(self):
        return self.angle

    @property
    def radius(self):
        return self.radius
