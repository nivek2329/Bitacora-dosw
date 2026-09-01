# DOSW_BITACORA

Bitácora de ejercicios de Streams, Lambdas y Programación Funcional en Java — Curso DOSW.

## Estructura

```
DOSW_BITACORA/
├── README.md
└── src/
    └── main/
        └── dosw/
            ├── semana_1/
            │   └── streams/     -> Ejercicio01..05 + clases de apoyo (User, Transaction)
            └── semana_2/
                └── pokemon/     -> Ejercicio01..20 + clases Pokemon, Entrenador, PokemonBasico
```

## Cómo ejecutar un ejercicio

Desde la raíz del proyecto:

```bash
javac -d bin $(find src -name "*.java")
java -cp bin dosw.semana_1.streams.Ejercicio01
java -cp bin dosw.semana_2.pokemon.Ejercicio15
```

## Regla de oro del taller

Ningún ejercicio usa `for`, `while`, `do-while` ni recorridos imperativos.
Todo se resuelve con **Streams** y **Lambdas / Method References**.

## Ejercicios que usan Method References (Reto Legendario)

- Ejercicio03, Ejercicio04 (Semana 1) — `String::toUpperCase`, `User::getName`
- Ejercicio01, Ejercicio02, Ejercicio08, Ejercicio09, Ejercicio10, Ejercicio12, Ejercicio13, Ejercicio14, Ejercicio20 (Semana 2) — `PokemonBasico::getNombre`, `Pokemon::getNombre`, `Pokemon::getTipo`, `Pokemon::isLegendario`, etc.

## Semana No 1 — DOSW Manejo de Streams

## Datos personales:
- Nombre y Apellido: Kevin
- Código de Estudiante:
- Curso: DOSW

### Ejercicio 01 — Números pares mayores a diez
Dada una lista de enteros, obtener solo los pares mayores a 10.
**Código implementado:** ver `src/main/dosw/semana_1/streams/Ejercicio01.java`
**Captura de ejecución:** (pega aquí tu captura de consola)
**Explicación:** Se usa `filter()` con la condición compuesta `n > 10 && n % 2 == 0` para quedarnos solo con los números que cumplen ambas condiciones.

### Ejercicio 02 — Palabras con más de 4 caracteres
**Código implementado:** ver `Ejercicio02.java`
**Captura de ejecución:** (pega aquí tu captura)
**Explicación:** `filter()` descarta las palabras cortas, `map()` las pasa a mayúsculas, `sorted()` las ordena alfabéticamente y `size()` da la cantidad final.

### Ejercicio 03 — Nombres de usuarios activos
**Código implementado:** ver `Ejercicio03.java`
**Captura de ejecución:** (pega aquí tu captura)
**Explicación:** Se filtra por `isActive()`, se extrae el nombre con `map(User::getName)`, se pasa a mayúsculas y se ordena.

### Ejercicio 04 — Personas mayores de edad
**Código implementado:** ver `Ejercicio04.java`
**Captura de ejecución:** (pega aquí tu captura)
**Explicación:** `filter(u -> u.getAge() >= 18)` seguido de `map(User::getName)`.

### Ejercicio 05 — Transacciones bancarias
**Código implementado:** ver `Ejercicio05.java`
**Captura de ejecución:** (pega aquí tu captura)
**Explicación:** `peek()` imprime cada transacción mientras el stream la procesa; `anyMatch()` verifica si existe al menos una no aprobada. El lote es válido solo si no hay ninguna sin aprobar.

---

## Semana No 2 — Bitácora Pokémon

## Datos de Entrenador:
- Nombre y Apellido: Kevin
- Código de Estudiante:
- Curso: DOSW

> Para cada uno de los 20 ejercicios (ver `src/main/dosw/semana_2/pokemon/`), sigue esta estructura al documentar en tu entrega final:
>
> ### Ejercicio NN — Nombre del ejercicio
> Enunciado del ejercicio (copiado del taller)
> **Código implementado:** (pega el código de `EjercicioNN.java`)
> **Captura de ejecución:** (imagen de la consola)
> **Explicación:** (2-3 líneas explicando qué operaciones de Stream usaste y por qué)

| # | Nombre | Operación clave |
|---|---|---|
| 01 | Pokémon tipo Fuego | `filter()` |
| 02 | Pokédex Gritona | `map()` |
| 03 | Poder Total del Equipo | `reduce()` |
| 04 | Pokémon Alfa | `max(Comparator)` |
| 05 | Pokémon Legendarios | `filter()` + `count()` |
| 06 | Pokédex Sin Duplicados | `distinct()` |
| 07 | Orden del Profesor Oak | `sorted()` |
| 08 | Evoluciones Preparadas | `filter()` |
| 09 | Equipo Élite | `filter()` + `sorted()` |
| 10 | Pokédex Compacta | `map()` + `collect()` |
| 11 | Poder Promedio | `mapToDouble()` + `average()` |
| 12 | Campeón Regional | `max(Comparator)` |
| 13 | Organizar por Tipo | `groupingBy()` |
| 14 | Organizar por Región | `groupingBy()` |
| 15 | Maestro de Gimnasios | `max(Comparator)` |
| 16 | Entrenadores Experimentados | `filter()` |
| 17 | Equipo Más Poderoso | `mapToDouble()` + `sum()` + `max()` |
| 18 | Top 5 Pokémon Más Fuertes | `sorted()` + `limit(5)` |
| 19 | Top 3 Entrenadores | `sorted()` + `limit(3)` |
| 20 | Pokédex Analítica | `groupingBy()` + `counting()` |

## Retos Especiales (si aplica)
- [x] Reto Legendario — Method References (ver lista arriba)
- [ ] Reto Shiny — Buenas prácticas de commits
- [ ] Reto Mewtwo — Ejercicio propuesto

## Estrategia de ramas (Git Flow)

- `main` y `develop` son las ramas principales.
- Por cada semana: `feature/semana-n-dosw`.
- Por cada ejercicio: `feature/semana-n-dosw-ejercicio-n`, que se fusiona hacia la rama de la semana y se elimina tras el merge.
- Al completar todos los ejercicios de la semana, `feature/semana-n-dosw` se fusiona con `develop` vía Pull Request (esta rama semanal NO se elimina, sirve de evidencia).
- Al final del ciclo, `develop` se sincroniza hacia `main`.
