### Proyecto de ambulancias en Santa Marta - Grafos

Este proyecto, desarrollado en Java, aprovecha la potencia de los grafos para ofrecer una respuesta rápida y eficiente ante emergencias en la ciudad de Santa Marta, Colombia.

<p align="center">
  <img src="https://raw.githubusercontent.com/JonathanV014/ProblemaAmbulanciasSM-Grafos/main/ex.png" width="300" alt="Imagen">
  <img src="https://1000marcas.net/wp-content/uploads/2020/11/Java-logo.png" width="300" alt="Logo de Java">
</p>

Este programa organiza estratégicamente las ambulancias para atender incidentes, desde accidentes de tránsito hasta caídas y desmayos. El sistema garantiza una distribución equitativa de las ambulancias en diferentes barrios de Santa Marta. Cuando ocurre un incidente, el sistema envía la ambulancia más cercana (en km).

En el sistema, he integrado datos reales para crear un entorno de prueba significativo. Santa Marta está dividida en 9 comunas, pero concentra la mayoría de sus barrios en las comunas 1 a 8. Elegí 4 barrios diferentes en cada una, totalizando así 32 barrios.

### Características importantes del programa

- **Respuesta inmediata a Incidentes:**
  En caso de un accidente, la ambulancia más cercana es despachada al instante. Esto se logra gracias al algoritmo de Floyd-Warshall, que calcula la ruta mínima de todas las ambulancias en la ciudad hasta el punto del accidente. Luego, se elige la ruta más corta desde el barrio donde se encuentra la ambulancia hasta el barrio donde ocurre el accidente.

- **Visualización de Rutas:**
  El programa permite visualizar todas las conexiones entre todos los vértices (barrios) y el valor (en km) de las aristas (distancia). Además, al momento de reportar un accidente, el programa pinta el camino y barrios por los que pasó la ambulancia para llegar al lugar del accidente.

- **Aislamiento de Barrios para Pruebas:**
  El programa permite aislar vértices, es decir, eliminar todas las conexiones de salidas y entradas de un barrio indicado. Esto se hace con el fin de simular diferentes situaciones y ver cómo se comportarían las ambulancias al momento de reportar un accidente.

