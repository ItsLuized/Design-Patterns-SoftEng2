class PointCarte:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def move(self, dx, dy):
        self.x = dx
        self.y = dy

    def __str__(self):
        return f'({self.x},{self.y})'

    @property
    def x(self):
        return self.x

    @property
    def y(self):
        return self.y