﻿## project-l10gr01

Este jogo é uma implementação em java, usando o terminal lanterna, do clássico Packman, com o objetivo de percorrer um labirinto e comer todas as pastilhas do caminho, sem nunca ser atingido por um fantasma.
Um jogador aumenta a sua pontuação, em 50 pontos, ao comer as pastilhas, em 100 pontos ao comer uma super pastilha e perde 200 pontos sempre que atingido por um fantasma. A cada tentativa , o jogador possui 3 vidas e cada colisão com um fantasma diminui em 1 unidade o número de vidas. O jogador ganha se conseguir comer todas as pastilhas existentes no mapa enquanto o seu número de vidas é maior ou igual a 1. Se o número de vidas diminuir até 0, o jogador perde e pode voltar a repetir o nível, podendo só avançar de nivel quando concluir com sucesso o atual.

Projeto desenvolvido por *Bernardo Pinto* (up20210842), *Eduardo Oliveira* (up202108690) e *João Oliveira* (up202108737).


### Funcionalidades planeadas:

- **Menu principal:** Quando se inicia o jogo aparece o menu principal, onde é possível selecionar a letra "S" para iniciar o jogo e a letra "I" para ver as instruções do jogo.

-  **Menu das Instruções:** Menu onde são disponibilizadas todas as regras e informações necessárias para jogar o jogo.

- **Menu Game Over:** Se o jogador for atingido 3 vezes por um fantasma, perde e o jogo termina. No terminal aparece a sua pontução e o nível em que ficou.

- **Após perder nível:** Se o jogador perder o nível tem a possibilidade de o repetir ou sair do jogo.

- **Sair do jogo:** A qualquer momento do programa, será possível sair do jogo carregando na letra "q".

- **Controlo do jogador:** O jogador deve usar o teclado para jogar e os inputs do teclado são recebidos e interpretados.

- **Colisões** As colisões entre os diferentes constituintes são analisadas (Ex : o jogador e os fantasmas a colidir com uma parede não a podem atravessar; o jogador a colidir com um fantasma levará a uma redução do número de vidas;)

- **Pontuações:** Valores Base: 1 pastilha = 50 pontos, 1 mega-pastilha = 100 pontos e ser atingido por 1 fantasma = -200 pontos.

- **Fantasmas:** O movimento de cada fantasma é influênciado pelo movimento do pacman. Todos os fantasmas têm movimentos diferentes.

- **Níveis:** Quando um jogador come todas as pastilhas sem perder o jogo, tem a possibilidade de avançar para o próximo nível, que apresenta mais fantasmas e um novo mapa.


