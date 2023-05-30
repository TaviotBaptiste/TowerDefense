package com.github.taviotbaptiste;

import org.bukkit.Material;

public enum Flower {
    WITHER_ROSE, //Wither rose (Black)
    ALLIUM, //Allium (Purple)
    POPPY, //Poppy (Red)
    AZURE_BLUET, //Azure Bluet (White)
    LILY_OF_THE_VALLEY, //Lili of the valley (White prettie)
    OXEYE_DAISY, //Oxeye Daysi (White prettier)
    BLUE_ORCHID,//Blue orchidée (Cyan)
    CORNFLOWER, //Cornflower (Blue)
    DANDELION, //dandelion (Yellow)
    PINK_TULIP, //Tulip pink,red,white,orange
    RED_TULIP,
    ORANGE_TULIP,
    WHITE_TULIP,
    GRASS; //Grass (Grass)


    public Material getFlower() {
        Material result;
        switch (this) {
            case WITHER_ROSE:
                result = Material.WITHER_ROSE;
                break;
            case ALLIUM:
                result = Material.ALLIUM;
                break;
            case POPPY:
                result = Material.POPPY;
                break;
            case AZURE_BLUET:
                result = Material.AZURE_BLUET;
                break;
            case LILY_OF_THE_VALLEY:
                result = Material.LILY_OF_THE_VALLEY;
                break;
            case OXEYE_DAISY:
                result = Material.OXEYE_DAISY;
                break;
            case BLUE_ORCHID:
                result = Material.BLUE_ORCHID;
                break;
            case CORNFLOWER:
                result = Material.CORNFLOWER;
                break;
            case DANDELION:
                result = Material.DANDELION;
                break;
            case PINK_TULIP:
                result = Material.PINK_TULIP;
                break;
            case RED_TULIP:
                result = Material.RED_TULIP;
                break;
            case ORANGE_TULIP:
                result = Material.ORANGE_TULIP;
                break;
            case WHITE_TULIP:
                result = Material.WHITE_TULIP;
                break;
            case GRASS:
                result = Material.GRASS;
                break;

            default:
                result = Material.DEAD_BUSH;
                break;
        }
        return result;
    }
}