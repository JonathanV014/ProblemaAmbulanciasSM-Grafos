### Proyecto de ambulancias en Santa Marta - Grafos
###### Este proyecto, desarrollado en Java  aprovecha la potencia de los grafos para ofrecer una respuesta rápida y eficiente ante emergencias en la ciudad de Santa Marta, Colombia.
<p align="center">
  <img src="https://raw.githubusercontent.com/JonathanV014/ProblemaAmbulanciasSM-Grafos/main/ex.png" width="200" alt="Imagen"><img src="https://1000marcas.net/wp-content/uploads/2020/11/Java-logo.png" width="200" alt="Logo de Java">
</p>
###### Este programa organiza estratégicamente las ambulancias para atender incidentes. Desde accidentes de tránsito hasta caídas y desmayos, el sistema garantiza una distribución equitativa de las ambulancias en diferentes barrios de Santa Marta. Cuando ocurre un incidente, el sistema envía la ambulancia más cercana(km).

###### En el sistema he integrado datos reales para crear un entorno de prueba significativo. Santa Marta, está dividida en 9 comunas, pero, concentra la mayoría de sus barrios en las comunas 1 a 8. Fue de estas ocho comunas de donde elegí 4 barrios diferentes en cada una, totalizando así 32 barrios.

### Caracteristicas importantes del programa

- #### Respuesta inmediata a Incidentes:
###### En caso de un accidente, la ambulancia más cercana es despachada al instante, esto se logra gracias al algoritmo de Floyd-Warshall el cual calcula la ruta minima de todas las ambulancias en la ciudad hasta el punto del accidente, para luego elegir la ruta más corta de una sola ambulancia hasta el accidente.

- ####Visualización de Rutas:
###### El programa permite visualizar todas las conexiones que hay entre todos los vertices (barrios) y el valor (en Km) de las aristas(distancia).También, al momento de reportar un accidente el programa pinta las rutas y barrios por los que pasó. 

- ####Aislamiento de Barrios para Pruebas: 
###### El programa permite aislar vertices, osea, eliminar todas las conexiones de salidas y entradas de un barrio indicado, esto con el fin de simular diferentes situaciones y ver como se comportarian las ambulancias al momento de reportar un accidente. 
