package com.yydcyy.design.pattern.creational.simplefactory;

/**
 * Created by YYDCYY on 2019-08-14.
 */
public class Test {
    public static void main(String[] args) {
        // V 0.1
      /*  VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        if(video == null){
            return;
        }
        video.produce();

    }
}
