package com.nitesh.jobseeker.web;

import com.nitesh.jobseeker.model.Post;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobPostController {

    @Autowired
    private com.nitesh.jobseeker.repositiory.Post post;

    //Swagger
    @ApiIgnore
    @RequestMapping("/")
    public void redirectSwagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(value = "/allPosts")
    public List<Post> getPosts(HttpServletResponse response){
        return post.findAll();
    }

    @PostMapping
    public Post addPost(@RequestBody Post newPost){
        return post.save(newPost);
    }
}
