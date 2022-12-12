package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.ArenaBuilder;
import com.aor.hero.model.game.elements.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArenaBuilder extends ArenaBuilder {
    private final Random rng;

    private final int width;
    private final int height;
    private final int numberOfMonsters;

    public RandomArenaBuilder(int width, int height, int numberOfMonsters) {
        this.rng = new Random();

        this.width = width;
        this.height = height;
        this.numberOfMonsters = numberOfMonsters;
    }

    @Override
    protected int getWidth() {
        return width;
    }

    @Override
    protected int getHeight() {
        return height;
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            walls.add(new Wall(x, 0));
            walls.add(new Wall(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            walls.add(new Wall(0, y));
            walls.add(new Wall(width - 1, y));
        }

        return walls;
    }

    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();

        while (monsters.size() < numberOfMonsters)
            monsters.add(new Monster(rng.nextInt(width - 2) + 1, rng.nextInt(height - 2) + 1));

        return monsters;
    }

    @Override
    protected Pacman createPacman() {
        return new Pacman(width / 2, height / 2);
    }

    @Override
    protected List<Coin> createCoins() {
        List<Coin> coins = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            coins.add(new Coin(x, 0));
            coins.add(new Coin(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            coins.add(new Coin(0, y));
            coins.add(new Coin(width - 1, y));
        }

        return coins;
    }
    @Override
    protected List<SupCoin> createSupCoins() {
        List<SupCoin> supercoins = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            supercoins.add(new SupCoin(x, 0));
            supercoins.add(new SupCoin(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            supercoins.add(new SupCoin(0, y));
            supercoins.add(new SupCoin(width - 1, y));
        }

        return supercoins;
    }
    protected List<Gate> createGates() {
        List<Gate> gates = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            gates.add(new Gate(x, 0));
            gates.add(new Gate(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            gates.add(new Gate(0, y));
            gates.add(new Gate(width - 1, y));
        }

        return gates;
    }
}