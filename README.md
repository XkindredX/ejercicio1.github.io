# Ejercicio venta de video juegos
### En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un vendedor de video juegos, que desea calcular el promedio de video juegos vendidos por precio de 3 juegos. Este negocio evalúa la venta video juegos de forma permanente y calcula el promedio general de las ventas.
Aclaraciones:
* Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo especifico.
* Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
* No se realiza validación, ni se verifica calidad en los datos ingresados.
## historia de caso
![image](https://github.com/XkindredX/ejercicio1.github.io/assets/132966410/02a1f25c-a48a-447f-a2f8-2b2567aff0f9)
## aproximacion a caso de uso
![image](https://github.com/XkindredX/ejercicio1.github.io/assets/132966410/1aa2b75f-dbfe-4974-b04a-f7e77833d9e5)
## diagrama de flujo de datos
![image](https://github.com/XkindredX/ejercicio1.github.io/assets/132966410/5f55b664-80ca-4c11-9af4-c240e281d8b2)
## pseudocodigo
  ### Definir j1 Como Caracter
  ### Definir j2 Como Caracter
	Definir j3 Como Caracter
	Definir j4 Como Caracter
	Definir v1 Como Caracter
	Definir v2 Como Caracter
	Definir v3 Como Caracter
	Definir v4 Como Caracter
	Escribir 'Digite el nombre de los 4 video juegos'
	Leer j1
	Leer j2
	Leer j3
	Leer j4
	Escribir 'Digite el numero de ejemplares vendidos de '+j1
	Leer v1
	Escribir 'Digite los ejemplares vendidos del juego '+j2
	Leer v2
	Escribir 'Digite los ejemplares vendidos del juego '+j3
	Leer v3
	Escribir 'Digite los ejemplares vendidos del juego '+j4
	Leer v4
	Si v1>v2 Y v1>v3 Y v1>v4 Entonces
		Escribir 'el juego mas vendido es '+j1
	SiNo
		Si v2>v1 Y v2>v3 Y v2>v4 Entonces
			Escribir 'el juego mas vendido es '+j2
		SiNo
			Si v3>v1 Y v3>v2 Y v3>v4 Entonces
				Escribir 'el juego mas vendido es '+j3
			SiNo
				Si v4>v1 Y v4>v2 Y v4>v3 Entonces
					Escribir 'el juego mas vendido es '+j4
				FinSi
			FinSi
		FinSi
	FinSi
	Si v1<v2 Y v1<v3 Y v1<v4 Entonces
		Escribir 'el juego menos vendido es '+j1
	SiNo
		Si v2<v1 Y v2<v3 Y v2<v4 Entonces
			Escribir 'el juego menos vendido es '+j2
		SiNo
			Si v3<v1 Y v3<v2 Y v3<v4 Entonces
				Escribir 'el juego menos vendido es '+j3
			SiNo
				Si v4<v1 Y v4<v2 Y v4<v3 Entonces
					Escribir 'el juego menos vendido es '+j4
				FinSi
			FinSi
		FinSi
	FinSi
