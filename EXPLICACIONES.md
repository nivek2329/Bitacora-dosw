# Explicaciones — Taller 4: Patrones de Diseño Combinados

Para cada ejercicio: rol de cada patrón, cómo interactúan, y por qué la combinación es superior a una solución sin patrones. Copia esta sección en tu informe de entrega (criterios 1 y 2, 10% del total).

---

## #01 — Plataforma de Pagos Inteligentes (Strategy + Factory Method)

**Rol de cada patrón**
- *Strategy* encapsula cada algoritmo de pago (Tarjeta, PSE, Nequi, PayPal) en una clase independiente que implementa `PaymentStrategy`. El `Checkout` trabaja solo con la interfaz, sin importar el medio concreto.
- *Factory Method* decide qué implementación construir según el país del usuario (`ColombiaPaymentFactory`, `UsaPaymentFactory`), sin que el cliente conozca la clase concreta.

**Cómo interactúan**
El `Checkout` le pide a la `PaymentFactory` que le construya la `PaymentStrategy` correcta; una vez la tiene, la ejecuta sin saber qué clase concreta recibió.

**Por qué es superior a no usar patrones**
Sin Factory, el `Checkout` tendría un `switch` gigante para decidir qué `Strategy` instanciar según el país, acoplándolo a todas las implementaciones. Sin Strategy, cada medio de pago sería un `if/else` dentro del propio `Checkout`, violando el principio abierto/cerrado cada vez que se agrega un medio nuevo.

---

## #02 — Sistema de Notificaciones Multicanal (Observer + Factory Method)

**Rol de cada patrón**
- *Observer* desacopla el `Pedido` (Subject) de los canales de notificación (`EmailNotifier`, `SmsNotifier`, `PushNotifier`).
- *Factory Method* construye el mensaje correcto para cada canal (HTML, texto plano, JSON) sin que el Observer conozca el formato.

**Cómo interactúan**
Cuando el `Pedido` cambia de estado, notifica a todos sus Observers; cada Observer usa su propia `MessageFactory` para construir el mensaje en el formato adecuado a su canal.

**Por qué es superior a no usar patrones**
Sin Observer, el `Pedido` tendría que conocer y llamar directamente a cada servicio de notificación, acoplándose a todos ellos. Sin Factory, cada Observer tendría lógica de formateo dispersa y duplicada.

---

## #03 — Sistema de Reportes Empresariales (Template Method + Factory Method)

**Rol de cada patrón**
- *Template Method* fija el orden de los pasos del algoritmo (`fetchData`, `processData`, `applyFormat`, `exportFile`) en `ReportGenerator`, dejando que las subclases solo varíen los pasos de formato y exportación.
- *Factory Method* crea la subclase correcta (`PdfReport`, `ExcelReport`, `CsvReport`) según el tipo solicitado.

**Cómo interactúan**
El cliente le pide a `ReportFactory` el tipo de reporte; el objeto recibido ya tiene el esqueleto fijo del algoritmo y solo ejecuta sus propios pasos variables al llamar a `generate()`.

**Por qué es superior a no usar patrones**
Sin Template Method, cada tipo de reporte reimplementaría los pasos fijos (fetch/process), duplicando código. Sin Factory Method, el cliente tendría que instanciar directamente `new PdfReport()`, `new CsvReport()`, etc., acoplándose a las clases concretas.

---

## #04 — Plataforma de Videojuegos — Personajes (Builder + Decorator)

**Rol de cada patrón**
- *Builder* construye el personaje paso a paso al inicio de la partida (`WarriorBuilder`), evitando constructores con muchos parámetros, y permite arquetipos predefinidos vía un Director.
- *Decorator* agrega poderes temporales en tiempo de ejecución (`ShieldDecorator`, `SpeedDecorator`, `InvisibilityDecorator`) sin modificar la clase base del personaje.

**Cómo interactúan**
El personaje se construye una vez con Builder; luego, durante la partida, se envuelve dinámicamente con Decorators que añaden comportamiento sin tocar la instancia original.

**Por qué es superior a no usar patrones**
Sin Decorator, cada combinación de poderes requeriría una subclase (2^5 = 32 subclases para 5 poderes combinables). Sin Builder, el constructor del personaje tendría muchos parámetros opcionales, propenso a errores de orden.

---

## #05 — Integración con Sistema Bancario Antiguo (Adapter + Facade)

**Rol de cada patrón**
- *Adapter* traduce la interfaz moderna `PaymentProcessor` a la interfaz incompatible del banco legado (`LegacyBankService`, que trabaja en centavos y con métodos distintos).
- *Facade* expone un único método simple (`procesarPago`) que orquesta internamente los pasos de inicialización y el uso del Adapter.

**Cómo interactúan**
La Facade usa el Adapter internamente: el desarrollador solo llama a `procesarPago(monto)` sin saber que, por debajo, se traduce la unidad y se invoca al servicio legado.

**Por qué es superior a no usar patrones**
Sin Adapter, el código moderno tendría que conocer y adaptarse manualmente a la interfaz legada en cada punto de uso. Sin Facade, cada desarrollador tendría que repetir los 8 pasos de inicialización del banco antiguo.

---

## #06 — Motor de Recomendaciones (Strategy + Observer)

**Rol de cada patrón**
- *Strategy* permite intercambiar el algoritmo de recomendación en tiempo de ejecución (género, historial, popularidad, similitud).
- *Observer* notifica automáticamente a los componentes de la UI (`HomePageComponent`, `NotificationService`, `SuggestedListComponent`) cuando cambia la preferencia del usuario.

**Cómo interactúan**
Al cambiar la `Strategy` activa, el motor dispara la notificación a todos los Observers registrados, que reaccionan re-renderizando su parte de la interfaz.

**Por qué es superior a no usar patrones**
Sin Strategy, cambiar de algoritmo implicaría un `switch` repetido en cada punto donde se generan recomendaciones. Sin Observer, el motor tendría que conocer y llamar directamente a cada componente de la UI, acoplándose a todos ellos.

---

## #07 — Flujo de Aprobación de Documentos (Chain of Responsibility + State)

**Rol de cada patrón**
- *Chain of Responsibility* encadena los validadores (`AutorHandler`, `LiderHandler`, `JuridicoHandler`); cada uno decide si procesa el documento y lo pasa al siguiente.
- *State* maneja las transiciones propias del documento (`DraftState`, `InReviewState`, `ApprovedState`, `RejectedState`), delegando el comportamiento según su estado actual.

**Cómo interactúan**
La cadena de validadores opera sobre el documento durante el proceso de revisión; en paralelo, el documento delega en su `DocumentState` actual qué transiciones son válidas (por ejemplo, no se puede aprobar un documento ya aprobado).

**Por qué es superior a no usar patrones**
Sin Chain of Responsibility, el proceso de aprobación tendría un bloque `if` gigante y rígido para decidir qué validaciones aplican a cada tipo de documento. Sin State, cada método del documento tendría un `switch(estado)` repetido, y agregar un estado nuevo obligaría a tocar todos esos switches.

---

## #08 — Sistema de Pedidos en Restaurante (Builder + Observer)

**Rol de cada patrón**
- *Builder* construye el pedido personalizado paso a paso (`OrderBuilder`), garantizando que el `Order` resultante sea completo y válido antes de existir (inmutable).
- *Observer* notifica a los subsistemas (`KitchenService`, `BillingService`, `DeliveryService`) cuando el pedido se confirma, sin que el pedido los conozca directamente.

**Cómo interactúan**
El pedido se construye con Builder; una vez confirmado (`order.confirm()`), notifica a todos sus Observers registrados, cada uno reaccionando según su responsabilidad.

**Por qué es superior a no usar patrones**
Sin Builder, el constructor de `Order` sería caótico con todos los ingredientes como parámetros. Sin Observer, `Order.confirm()` tendría que llamar directamente a cocina, facturación y domicilio, acoplándose a los tres subsistemas.

---

## #09 — Sistema de Autenticación Empresarial (Strategy + Chain of Responsibility)

**Rol de cada patrón**
- *Strategy* selecciona el mecanismo de autenticación (`PasswordStrategy`, `GoogleStrategy`, `BiometricStrategy`) según el tipo de usuario.
- *Chain of Responsibility* encadena las validaciones posteriores a la autenticación (credenciales, permisos, ubicación, horario laboral).

**Cómo interactúan**
Primero se autentica al usuario con la `AuthStrategy` correspondiente; si es exitosa, la solicitud pasa por la cadena de validadores antes de conceder el acceso final.

**Por qué es superior a no usar patrones**
Sin Strategy, el servicio de autenticación necesitaría un `if/else` por cada mecanismo soportado. Sin Chain of Responsibility, las 4 validaciones posteriores estarían anidadas en `if`s rígidos, dificultando reordenar o añadir una validación nueva.

---

## #10 — Aplicación de Edición de Imágenes (Decorator + Command)

**Rol de cada patrón**
- *Decorator* aplica filtros de forma acumulativa (`SepiaDecorator`, `BrightnessDecorator`, `GrayscaleDecorator`) envolviendo la imagen base en cualquier orden.
- *Command* encapsula cada operación del usuario como un objeto reversible (`ApplyFilterCommand`) con `execute()` y `undo()`, permitiendo deshacer cualquier paso individual del historial.

**Cómo interactúan**
Cada `ApplyFilterCommand` guarda la imagen anterior antes de aplicar su Decorator; el historial de comandos permite deshacer cualquier operación específica sin afectar las demás.

**Por qué es superior a no usar patrones**
Sin Decorator, cada combinación de filtros requeriría una clase distinta (explosión combinatoria). Sin Command, deshacer una operación específica del medio del historial sería imposible sin rehacer manualmente toda la secuencia — solo se podría deshacer la última acción global.
