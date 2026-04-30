# Counting Chickens

Simple Java console project for basic arithmetic practice with egg collection and egg profit calculations.

## Overview

This project contains two small exercises:

1. `Chickens01` calculates the total number of eggs collected over three days while the number of chickens changes each day.
2. `Chickens02` calculates the average egg output and estimated monthly profit from a fixed set of daily totals.

`Main` runs both exercises in sequence.

## Files

- `src/Main.java`  
  Entry point that runs both chicken exercises.

- `src/Chickens01.java`  
  Contains `eggsCollection(int eggsPerChicken, int chickenCount, int totalEggs)`.

- `src/Chickens02.java`  
  Contains `eggProfits()` for average and profit calculations.

## Program Behavior

### `Chickens01`

For each scenario:

- Monday: total eggs = `eggsPerChicken * chickenCount`
- Tuesday: one chicken is added
- Wednesday: the chicken count is cut in half using integer division

Scenarios used:

- `eggsCollection(5, 3, 0)`
- `eggsCollection(4, 8, 0)`

Printed results:

- `45`
- `84`

### `Chickens02`

Uses these daily egg totals:

- Monday: `100`
- Tuesday: `121`
- Wednesday: `117`

Calculates:

- Daily average
- Monthly average using `30` days
- Monthly profit using `$0.18` per egg

Printed results:

- `Daily Average:   112.66666666666667`
- `Monthly Average: 3380.0`
- `Monthly Profit:  $608.4`

## Running the Project

Compile:

```bash
javac src/Main.java src/Chickens01.java src/Chickens02.java -d out
```

Run:

```bash
java -cp out Main
```

If you are using IntelliJ IDEA, you can also run `Main.java` directly.

## Sample Output

```text
45
84
Daily Average:   112.66666666666667
Monthly Average: 3380.0
Monthly Profit:  $608.4
```
