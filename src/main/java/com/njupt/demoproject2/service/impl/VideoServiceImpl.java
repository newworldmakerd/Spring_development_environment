package com.njupt.demoproject2.service.impl;

import com.njupt.demoproject2.domian.Video;
import com.njupt.demoproject2.mapper.VideoMapper;
import com.njupt.demoproject2.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
