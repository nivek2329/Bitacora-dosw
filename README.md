# DOSW_PATRONES — Ejercicios de Patrones Combinados

10 ejercicios, cada uno combina exactamente 2 patrones de diseño con código
funcional y ejecutable (clase `Main` por ejercicio).

## Cómo ejecutar un ejercicio

```bash
javac -d bin $(find src -name "*.java")
java -cp bin ejercicio01.Main
java -cp bin ejercicio05.Main
```
(cambia `ejercicio01` por el número del ejercicio que quieras correr, del 01 al 10)

## Mapa de ejercicios y patrones

| # | Caso | Patrones combinados |
|---|---|---|
| 01 | Plataforma de Pagos Inteligentes | Strategy + Factory Method |
| 02 | Sistema de Notificaciones Multicanal | Observer + Factory Method |
| 03 | Sistema de Reportes Empresariales | Template Method + Factory Method |
| 04 | Plataforma de Videojuegos — Personajes | Builder + Decorator |
| 05 | Integración con Sistema Bancario Antiguo | Adapter + Facade |
| 06 | Motor de Recomendaciones | Strategy + Observer |
| 07 | Flujo de Aprobación de Documentos | Chain of Responsibility + State |
| 08 | Sistema de Pedidos en Restaurante | Builder + Observer |
| 09 | Sistema de Autenticación Empresarial | Strategy + Chain of Responsibility |
| 10 | Aplicación de Edición de Imágenes | Decorator + Command |

Ver `EXPLICACIONES.md` para el detalle de cada ejercicio (rol de cada patrón,
cómo interactúan, y justificación de por qué la combinación es superior a
una solución sin patrones), listo para copiar al informe de entrega.
