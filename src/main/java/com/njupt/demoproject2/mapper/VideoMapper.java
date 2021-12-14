package com.njupt.demoproject2.mapper;

import com.njupt.demoproject2.domian.User;
import com.njupt.demoproject2.domian.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap=new HashMap<>();
    static {
        videoMap.put(1,new Video(1,"java基础"));
        videoMap.put(2,new Video(2,"javaWeb"));
        videoMap.put(3,new Video(3,"java实战"));
        videoMap.put(4,new Video(4,"spring基础"));
        videoMap.put(5,new Video(5,"spring实战"));
    }
    public List<Video> listVideo(){
        List<Video> videoLisl = new ArrayList<>();
        videoLisl.addAll(videoMap.values());
        return videoLisl;
    }
}
