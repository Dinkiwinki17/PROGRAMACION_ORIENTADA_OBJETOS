### UML EN "PlantUML"

@startuml
class Vehiculo{
-String marca
-double velocidad

+Vehiculo(String marca, double velocidad)
+desplazar(): String
+getMarca(): String
+getVelocidad(): double
+setVelocidad(double velocidad): void
}

class Moto{
-String matricula
-String nombreTitular
-int anioFabricacion

+Moto(String marca, double velocidad, String matricula, String nombreTitular, int anioFabricacion)
+getAnioFabricacion(): int
+setAnioFabricacion(int anioFabricacion): void
+getMatricula():String
+setMatricula(String):void
+getNombreTitular():String
+setNombreTitular(String):void
}

class Coche{
-String matricula
-String nombreTitular
-int anioFabricacion
-boolean modoAutomatico

+Coche(String marca, double velocidad, String matricula, String nombreTitular, int anioFabricacion)
+desplazar(boolean modoAutomatico): String
+cambiarModoDesplazamiento(): void
+getAnioFabricacion(): int
+getMatricula(): String
+setMatricula(String matricula): void
+getNombreTitular():String
+setNombreTitular(String nombreTitular): void
}

class Bicicleta{
-String tipo
-String tipoDesplazamiento

+Bicicleta(String marca, double velocidad, String tipo, String tipoDesplazamiento)
+desplazar():String
+getTipo():String
+setTipo(String tipo):void
+getTipoDesplazamiento():String
+setTipoDesplazamiento(String tipoDesplazamiento):void
}


Vehiculo <|-- Moto
Vehiculo <|-- Coche
Vehiculo <|-- Bicicleta
@enduml
