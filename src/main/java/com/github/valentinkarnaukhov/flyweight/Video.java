package com.github.valentinkarnaukhov.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Valentin Karnaukhov
 */
public class Video {

    public static void main(String[] args) {
        List<Frame> frames = new ArrayList<>();
        for (int i = 0; i < 50_000_000; i++) {
            frames.add(new Frame("CMYK", 1000, 1000, 0.5f, 0.5f, 0.5f, 1f, i));
            System.out.println(i);
        }
        //OUT OF MEMORY FOR 50_000_000
        System.out.println(frames.size());
//
//        List<Frame> frames = new ArrayList<>();
//        for (int i = 0; i < 50_000_000; i++) {
//            frames.add(Frame.getFlyFrame("CMYK", 1000, 1000, 0.5f, 0.5f, 0.5f, 1f, i));
//        }
//        System.out.println(frames.size());
    }
}
