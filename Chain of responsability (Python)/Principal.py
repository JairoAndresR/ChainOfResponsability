class Manejador():
    def __init__(self):
        self.sucessor = None

    def manejadorRequest(self, nombre):
        pass


class Manejador1_Cajeros(Manejador):
    def manejadorRequest(self, nombre):
        if (nombre == 1):
            print 'Generando el cheque para el cajero'
        else:
            self.sucessor.manejadorRequest(nombre)


class Manejador2_Asesores(Manejador):
    def manejadorRequest(self, nombre):
        if (nombre == 2):
            print 'Generando el cheque para el asesor'
        else:
            self.sucessor.manejadorRequest(nombre)


class Manejador3_Supervisores(Manejador):
    def manejadorRequest(self, nombre):
        if (nombre == 3):
            print 'Generando el cheque para el supervisor'
        else:
            self.sucessor.manejadorRequest(nombre)


class Manejador4_Gerentes(Manejador):
    def manejadorRequest(self, nombre):
        if (nombre == 4):
            print 'Generando el cheque para el gerente'
        else:
            self.sucessor.manejadorRequest(nombre)


class ManejadorDefault(Manejador):
    def manejadorRequest(self,nombre):
        print "No existe la opcion ", nombre


if __name__ == '__main__':
    manejadores = [Manejador1_Cajeros(), Manejador2_Asesores(), Manejador3_Supervisores(), Manejador4_Gerentes(),
                   ManejadorDefault()]
    for i in manejadores:
        aux = manejadores.index(i) + 1
        if (aux < manejadores.__len__()):
            i.sucessor = manejadores[aux]
    print 'Ingrese el numeral del cargo del empleado'
    print '1. cajero'
    print '2. asesor'
    print '3. supervisor'
    print '4. gerente'
    nombre = input()
    manejadores[0].manejadorRequest(nombre)
