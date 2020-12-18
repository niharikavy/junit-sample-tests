package com.nv.actions;

public class ForestCreator {
    public int plantTrees(int numberOfTrees) {
        int plantedTrees = 0;
        for (int i = 0; i < numberOfTrees; i++) {
            System.out.println("Planting tree " + i);
            plantedTrees++;
        }
        return plantedTrees;
    }

    public void plantSpecificTree(String nameOfTree) {
        System.out.println("Planting " + nameOfTree);
    }

    public void waterThePlants() {
        System.out.println("Watering the plants ");
    }

    public void removeWeeds() {
        System.out.println("Removing the weeds ");
    }

    public void makeItRain() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public int getHealthyTreeCount() {
        return 10;
    }
}

