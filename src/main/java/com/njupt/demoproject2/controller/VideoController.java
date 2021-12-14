package com.njupt.demoproject2.controller;

import com.njupt.demoproject2.domian.Video;
import com.njupt.demoproject2.service.VideoService;
import com.njupt.demoproject2.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频控制器
 */
//@Controller

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @RequestMapping("list")
    public Object list(){
        List<Video> list=videoService.listVideo();
        return JsonData.buildSucess(list);
    }
    @PostMapping("save_video_chapter")
    public JsonData saveVideo(@RequestBody Video video){
        System.out.println(video);
        return JsonData.buildSucess("");
    }
}
