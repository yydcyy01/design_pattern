package com.yydcyy.design.pattern.creational.factorymethod;

/**
 * Created by YYDCYY on 2019-08-14.
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
   /* public Video getVideo(Class c){
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }

    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type))
            return new JavaVideo();
        else if ("python".equalsIgnoreCase(type))
            return new PythonVideo();

        //其他情况, 无法生成, 返回null
        return null;
    }*/
}
