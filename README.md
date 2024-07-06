# Desafio: Último Dígito Fatorial

## Descrição

O objetivo deste exercício é calcular o último dígito de um número fatorial.

O fatorial de um número \( N \), cuja expressão é \( N! \), define-se como o produto de todos os números de \( N \) até 1, com \( N \) incluso. Por exemplo, \( 3! = 3 \times 2 \times 1 = 6 \).

A partir de certos valores, o resultado pode ser muito grande. Por esse motivo, em vez de mostrar todo o resultado, mostra-se apenas o último dígito de \( N! \). Assuma que \( N \) está na base 10.

## Entrada

- A primeira entrada de dados contém um número positivo \( T \) (1 < T < 10), que representa o número de casos de prova.
- Cada uma das seguintes \( T \) linhas contém um inteiro positivo \( N \).

## Saída

- Para cada valor de \( N \), mostre o último dígito de \( N! \).

## Exemplo

### Entrada
```
3
1
2
3
```

### Saída
```
1
2
6
```

### Entrada
```
2
5
2
```

### Saída
```
0
2
```

## Como Executar

1. Copie o código acima para um arquivo chamado `Main.java`.
2. Compile o arquivo usando o comando:
    ```
    javac Main.java
    ```
3. Execute o programa com o comando:
    ```
    java Main
    ```
4. Insira o número de casos de teste e os valores de \( N \) quando solicitado para ver o último dígito do fatorial de cada \( N \).