package bryanDev.util.config;

public class Configuration {

    public static int[] Color2(int[] Color1) {
        int[] Color2 = new int[3];
        int brillo = (int) (0.2126 * Color1[0] + 0.7152 * Color1[1] + 0.0722 * Color1[2]);
        int diferencia = 50;

        if (brillo > 128) {
            Color2[0] = Math.max(Color1[0] - diferencia, 0);
            Color2[1] = Math.max(Color1[1] - diferencia, 0);
            Color2[2] = Math.max(Color1[2] - diferencia, 0);
        } else {
            Color2[0] = Math.min(Color1[0] + diferencia, 255);
            Color2[1] = Math.min(Color1[1] + diferencia, 255);
            Color2[2] = Math.min(Color1[2] + diferencia, 255);
        }

        return Color2;
    }

    public static int[] Color3(int[] Color1) {
        int[] Color3 = new int[3];
        int brillo = (int) (0.2126 * Color1[0] + 0.7152 * Color1[1] + 0.0722 * Color1[2]);
        int diferencia = 10;

        if (brillo > 128) {
            Color3[0] = Math.max(Color1[0] - diferencia, 0);
            Color3[1] = Math.max(Color1[1] - diferencia, 0);
            Color3[2] = Math.max(Color1[2] - diferencia, 0);
        } else {
            Color3[0] = Math.min(Color1[0] + diferencia, 255);
            Color3[1] = Math.min(Color1[1] + diferencia, 255);
            Color3[2] = Math.min(Color1[2] + diferencia, 255);
        }

        return Color3;
    }

    public static int[] Color4(int[] Color1) {
        int[] Color4 = new int[3];
        int brillo = (int) (0.2126 * (255 - Color1[0]) + 0.7152 * (255 - Color1[1]) + 0.0722 * (255 - Color1[2]));
        int diferencia = 10;

        if (brillo > 128) {
            Color4[0] = Math.max((255 - Color1[0]) - diferencia, 0);
            Color4[1] = Math.max((255 - Color1[1]) - diferencia, 0);
            Color4[2] = Math.max((255 - Color1[2]) - diferencia, 0);
        } else {
            Color4[0] = Math.min((255 - Color1[0]) + diferencia, 255);
            Color4[1] = Math.min((255 - Color1[1]) + diferencia, 255);
            Color4[2] = Math.min((255 - Color1[2]) + diferencia, 255);
        }

        return Color4;
    }

    public static int[] Color5(int[] Color1) {
        int[] Color5 = new int[3];
        int brightness = (int) (0.2126 * Color1[0] + 0.7152 * Color1[1] + 0.0722 * Color1[2]);

        if (brightness > 75) {
            Color5[0] = 0;
            Color5[1] = 0;
            Color5[2] = 0;
        } else {
            Color5[0] = 255;
            Color5[1] = 255;
            Color5[2] = 255;
        }

        return Color5;
    }
}
