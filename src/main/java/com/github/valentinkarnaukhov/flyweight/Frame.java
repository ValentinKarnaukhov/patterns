package com.github.valentinkarnaukhov.flyweight;

import java.util.*;

/**
 * @author Valentin Karnaukhov
 */
public class Frame {

    private Color color;
    private Size size;
    private long number;

    public Frame() {
    }

    public Frame(String colorMode, int height, int width, float r, float g, float b, float alpha, long number) {
        this.color = new Color(colorMode, r, g, b, alpha);
        this.size = new Size(height, width);
        this.number = number;
    }

    public static Frame getFlyFrame(String colorMode, int height, int width, float r, float g, float b, float alpha, long number) {
        Frame frame = new Frame();
        frame.color = ColorFactory.getColor(colorMode, r, g, b, alpha);
        frame.size = SizeFactory.getSize(height, width);
        frame.number = number;
        return frame;
    }

    static class Color {
        private String colorMode;
        private float R;
        private float G;
        private float B;
        private float Alpha;

        public Color(String colorMode, float r, float g, float b, float alpha) {
            this.colorMode = colorMode;
            R = r;
            G = g;
            B = b;
            Alpha = alpha;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Color color = (Color) o;
            return Float.compare(color.R, R) == 0 &&
                    Float.compare(color.G, G) == 0 &&
                    Float.compare(color.B, B) == 0 &&
                    Float.compare(color.Alpha, Alpha) == 0 &&
                    colorMode.equals(color.colorMode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colorMode, R, G, B, Alpha);
        }
    }

    static class Size {
        private int height;
        private int width;

        public Size(int height, int width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Size size = (Size) o;
            return height == size.height &&
                    width == size.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(height, width);
        }
    }

    private static class ColorFactory {
        private static final Map<Color, Color> colors = new HashMap<>();

        public static Color getColor(String colorMode, float r, float g, float b, float alpha) {
            Color color = new Color(colorMode, r, g, b, alpha);
            if (colors.containsKey(color)) {
                return colors.get(color);
            } else {
                return colors.put(color, color);
            }
        }
    }

    private static class SizeFactory {
        private static final Map<Size, Size> sizes = new HashMap<>();

        public static Size getSize(int height, int width) {
            Size size = new Size(height, width);
            if (sizes.containsKey(size)) {
                return sizes.get(size);
            } else {
                return sizes.put(size, size);
            }
        }
    }
}
