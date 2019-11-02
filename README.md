# Exam

1- Dada una tabla de personas con los siguientes campos:

Id (primary key)
Name
Last Name
parent_id (foreign key a sí misma)

Resolver con un query cómo mostrar todos los pares de Abuelo-Nieto que haya.

    select p.id, p2.parent_id from persona p 
    inner join persona p2 on p.parent_id = p2.id 
    where p2.parent_id IS NOT NULL

2- Una persona es considerada pelirroja si tiene el pelo rojo y todos sus ancestros también tienen el pelo rojo. Definir un método recursivo que reciba un id de persona y un array de personas (donde cada persona tiene id, color_pelo y padre_id) y devuelva un booleano indicando si la persona es o no es pelirroja.

Desarrollar el metodo en javascript (precargando un array de personas con datos de prueba), en una pagina html que tenga un input text donde se ingrese el id de la persona y un boton que, al ser clickeado, muestre un cartel que indique si la persona es o no es pelirroja.

[https://github.com/Ezefalcon/Exam/blob/master/src/index.html](https://github.com/Ezefalcon/Exam/blob/master/src/index.html)

3- Una empresa que se dedica a la venta de productos que ellos mismos fabrican tiene a todos sus vendedores y clientes distribuidos por el país. Actualmente esta empresa no posee ningún sistema de gestión de su información, con lo cual necesita en breve poder implementar un software que le permita, entre otras cosas:
A-Poder emitir sus facturas de venta y guardar registro de las mismas, pudiendo luego ver por cada factura todos los productos/cantidad/precio de lo que se vendió
B-Poder saber en todo momento el stock disponible de cada uno de sus productos
C-Poder saber para un mes en particular, en qué localidad se recaudó más dinero por ventas
D-Para un mes en particular, poder saber cuáles son los 3 vendedores cuyos equipos lograron emitir más facturas. (Los vendedores pueden ser simples vendedores, o a su vez también ser jefe de otros vendedores. Cada vendedor tiene como máximo un solo jefe)
E-Para una localidad y mes en particular, poder saber qué cliente compró la mayor cantidad de productos

Proponga un Diagrama de Entidad-Relación que soporte la persistencia de información que necesita la empresa
Desarrolle en Java los métodos necesarios (puede ser pseudocodigo) para los puntos C, D y E. Para el desarrollo asuma que por cada tabla del DER, hay una entidad Java correspondiente ya creada con las relaciones correspondientes según el DER que haya definido.

[https://i.gyazo.com/dea9b97b45e22976f0c79e2efa978602.png](https://i.gyazo.com/dea9b97b45e22976f0c79e2efa978602.png)

4- A) Modelar una mascota virtual, tipo Tamagotchi, incluyendo los mensajes correspondientes a las acciones de comer y jugar, y la pregunta acerca de si puede jugar o no.
También hay que poder conocer el nivel de contenta de una mascota, que es un número entero mayor o igual que 0, donde a mayor nivel, más contenta está la mascota.
Una mascota puede estar aburrida, hambrienta o contenta; y su comportamiento depende de en qué estado esté. Veamos:
Cuando una mascota come, pasa lo siguiente:
	Si está hambrienta, se pone contenta.
	Si está contenta, su nivel se incrementa en una unidad.
	Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
	Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.
Cuando una mascota juega, pasa lo siguiente:
	Si está contenta, su nivel se incrementa en dos unidades.
	Si está aburrida, se pone contenta.
	No produce ningún efecto jugar con la mascota si esta hambrienta.
	Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.

NO SE PUEDE CONSULTAR DE NINGUNA MANERA EL ESTADO ACTUAL DE LA MASCOTA. Esto quiere decir que está prohibido hacer comparaciones del tipo estado = ‘contento’ o cualquiera similar utilizando mensajes especiales.

Lo que solicita es el diagrama de clases (aproximado. No tiene que ser el diagrama UML exacto, sino algo representativo) y la implementación (código/pseudocódigo) de los métodos que considere principales

B) Indique en palabras los pasos necesarios para incorporar un nuevo estado “Triste” en la mascota, de manera que quede listo para funcionar.

5- Dado un proyecto ya existente en un repositorio de Git, indique los comandos necesarios para descargarlo localmente, crear una rama propia, subir nuevos cambios y agegarlos a la rama principal.


    - git pull origin master
    - git checkout -b nombreDeBranch o git branch nombreDeBranch y despues checkout
    - git add nombreDeArchivo o git add . para añadir todos
    - git commit -m "Mensaje del commit"
    - git push origin nombreDeBranch
    Desde ahi generalmente se hace un Pull Request apuntando a la rama master para poder
    ser mergeado
    Sino se puede mergear desde el local
    - git checkout master
    - git merge nombreDeBranch 
    - git push origin master