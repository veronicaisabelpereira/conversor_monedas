# Conversor de Monedas

## Descripción

Esta es una aplicación de consola en Java que permite convertir diferentes monedas utilizando la API de ExchangeRate. El programa ofrece una interfaz sencilla para que el usuario elija entre varias conversiones de divisas y calcula el monto convertido en tiempo real.

## Características

- Conversión entre diferentes monedas:
    - Dólar a Peso Argentino
    - Peso Argentino a Dólar
    - Real Brasileño a Dólar
    - Dólar a Real Brasileño
    - Dólar a Peso Colombiano
    - Peso Colombiano a Dólar
- Uso de la API de ExchangeRate para obtener tasas de cambio actualizadas.
- Interfaz de consola interactiva que permite al usuario seleccionar opciones.

## Tecnologías Usadas

- Java 17
- HTTP Client para solicitudes web
- Gson para el procesamiento de JSON

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/conversor_monedas.git
## Instrucciones para Ejecutar el Proyecto

1. Navega al directorio del proyecto:

   ```bash
   cd conversor_monedas
   Asegúrate de tener Java 17 instalado en tu máquina.

2. Compila y ejecuta el programa:

   ```bash
   javac Main.java CurrencyConverter.java ExchangeRateResponse.java
   java Main.

## Uso

- Al ejecutar el programa, se mostrará un menú con las opciones de conversión.
- Elige una opción ingresando el número correspondiente.
- Ingresa el monto que deseas convertir.
- El programa mostrará el resultado de la conversión.
- Puedes seguir convirtiendo o salir seleccionando la opción correspondiente.
