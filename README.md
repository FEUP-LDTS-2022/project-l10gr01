## project-l10gr01

Este jogo é uma implementação em java, usando o terminal lanterna, do clássico Packman, com o objetivo de percorrer um labirinto e comer todas as pastilhas do caminho, sem nunca ser atingido por um fantasma. Um jogador aumenta a sua pontuação, em 10 pontos, ao comer as pastilhas, em 50 pontos ao comer uma super pastilha e perde 100 pontos sempre que atingido por um fantasma. A cada tentativa, o jogador possui 3 vidas e cada colisão com um fantasma diminui em 1 unidade o número de vidas. O jogador ganha se conseguir comer todas as pastilhas existentes no mapa enquanto o seu número de vidas é maior ou igual a 1. Se o número de vidas diminuir até 0, o jogador perde e volta a repetir o nível, só podendo avançar quando concluir com sucesso o nível atual.

Projeto desenvolvido por *Bernardo Pinto* (up20210842), *Eduardo Oliveira* (up202108690) e *João Oliveira* (up202108737).


### Funcionalidades planeadas:

- **Menu principal:** Quando se inicia o jogo aparece o menu principal, onde é possível selecionar a letra "S" para iniciar o jogo e a letra "I" para ver as instruções do jogo.

- **Menu Instruções:** Menu onde são disponibilizadas todas as regras e informações necessárias para jogar o jogo.

- **Menu Game Over:** Se o jogador for atingido 3 vezes por um fantasma, perde e o jogo termina. No terminal aparece a sua pontução e o nível em que ficou.

- **Após perder nível:** Se o jogador perder o nível volta a repetir o nível, tendo a possibilidade de desistir.

- **Sair do jogo:** A qualquer momento do programa, será possível sair do jogo carregando na letra "q".

- **Controlo do Jogador:** O jogador deve usar o teclado para jogar e os inputs do teclado são recebidos e interpretados.

- **Teclas para Jogar:** O jogador deve utilizar as 4 setas do teclado(arrow "up" para deslocar o Packman para cima, arrow "down" para deslocar o Packman para baixo, arrow "left" para deslocar o Packman para a esquerda e arrow "right" para deslocar o Packman para a direita)

- **Colisões:** As colisões entre os diferentes constituintes são analisadas (Ex: o jogador e os fantasmas a coidir com uma parede não a podem atravessar; o jogador a colidir com um fantasma levará a uma redução do número de vidas)

- **Pontuações:** Valores Base: 1 pastilha = 10 pontos, 1 super pastilha = 50 pontos e ser atingido por 1 fantasma = -100 pontos.

- **Fantasmas:** O movimento de cada fantasma é influênciado pelo movimento do pacman. Todos os fantasmas têm movimentos diferentes.

- **Níveis:** Quando um jogador come todas as pastilhas sem perder o jogo, passa para um novo nível, que apresenta mais fantasmas e um novo mapa.

