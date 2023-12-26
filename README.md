ULP  (uNIVERSIDAD DE LA PUNTA)                                                               ARGENTINA PROGRAMA4.0

INSTRUCTIVO: El proyecto será una aplicación en Java / MySQL. Se debe crear las tablas de la base de datos, y las correspondientes clases. Utilice una clase para la conexión y confeccione la interfaz gráfica (GUI). El grupo deberá presentar el proyecto en 3 etapas.
Armado de la base de datos completa, relaciones. Proyecto en NetBeans, clase de conexión, CiudadanoData y pruebas desde el main. 
Desarrollo de todas las clases principales del dominio (ABM), consultas SQL embebidas. Pruebas desde el main. 
Implementación de los todas vistas y métodos necesarios, listados, ABM de clases relacionadas y aplicación terminada. 
 
Se deben presentar las clases con atributos y métodos necesarios (abstracción). Setters y Getters (encapsulamiento). Constructor.
Se evaluará el aporte de todos los miembros al proyecto, en la construcción de las clases. Se subirán los commit al repositorio público (GitHub).
En la lucha contra la pandemia un programa de vacunación cuenta con personal del Ministerio de salud, encargado de comprar las dosis por miles o millones de dosis. Las envían a las provincias, para que las administren. 
Tenemos Laboratorios farmacológicos de los cuales se conoce: CUIT, nombre comercial, país de origen, y dirección fiscal. Ej.: Moderna, Pfizer, y AstraZeneca de USA(Oxford), Sinopharm de China, Sputnik V de Rusia, etc. El CUIT del laboratorio que produce dosis de vacunas, está compuesto por 2 dígitos que indican el tipo, 8 dígitos que son el número de documento de la persona jurídica responsable y un último número aleatorio. (Ej. CUIT: 30-70773370-1)
Las vacunas provienen de un laboratorio específico, el cual produce millones de ellas, y se cargan escaneando su nro. de serie.  Cada vacuna tiene varias dosis, algunas en frasquitos de 0.3, 0.5, o de 0.9 mL, la marca comercial, su antígeno (componentes derivados de la estructura de los virus o bacterias, que son reconocidos por el sistema inmune como extraños y desencadenan una respuesta inmune de protección), fecha de caducidad, y tienen un estado indica si ya fue aplicada o está disponible.
Cada ciudadano de la población se registra con sus datos personales (nombre completo, email, celular, patología base (si sufre alguna), y además para priorizar los turnos, el ámbito de trabajo (ejemplo salud, educación, comercio, etc.) 
Un representante del gobierno provincial se encarga de administrar las dosis, priorizando ámbitos de trabajo de salud y educación. En consecuencia, se programarán y otorgarán para un ciudadano varias citas de vacunación, hasta concretar 3 citas. Se da aviso a los mismos, sobre la cita consignada. En la cita tenemos DNI, la fecha y hora asignada, centro de vacunación, código de refuerzo (1°,2°, o 3° dosis), y una dosis tipo vacuna que se colocará, al principio vacía.
Una vez que la persona concurre, se concreta la vacunación, marcando la vacuna como ‘aplicada’, y completa la cita de vacunación con, fecha y hora de aplicación, y la dosis (de tipo vacuna) aplicada. 
Al terminar la aplicación, se genera para esa persona un turno entre las 4-8 semanas. Debe darse la segunda dosis lo más cerca posible del intervalo recomendado de 3 semanas o de 4 semanas. No obstante, puede aplicarse la segunda dosis hasta 6 semanas (42 días) después de haber recibido la primera dosis, si es necesario. No debe aplicarse la segunda dosis antes de tiempo. 
Si no llegan suficientes dosis, puede haber una funcionalidad que Postergue las citas por 2 semanas más.
Si el ciudadano Cancela la cita de vacunación, por algún motivo (defensas bajas o demás), no puede asistir.
Se lista mensualmente, todas las citas vencidas, cumplidas, o canceladas. 
Listar diariamente, todos los centros de vacunación, y la cantidad de dosis aplicadas en cada uno.
Para un centro específico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
Se debe permitir que una persona se inscriba al plan de vacunación para recibir una dosis. Y que luego cuando se registra la colocación de una dosis de vacuna, se muestre con un diálogo de JOptionPane. 
Se deben controlar si tiene la dosis previa, o si corresponde una segunda dosis, control de fechas, etc. 
Relaciones:
Un ciudadano asiste hasta dos citas de vacunación, donde recibe una dosis de una vacuna. Una vacuna sirve para un solo uso.
Cada dosis pertenece a un laboratorio, el cual produce millones de vacunas.
Cada cita de vacunación se efectúa en un centro o vacunatorio más cercano al domicilio del ciudadano. En estos centros (hospitales autorizados), se aplican a la población, muchas dosis cada día. 

Nota: diagrama ULM

