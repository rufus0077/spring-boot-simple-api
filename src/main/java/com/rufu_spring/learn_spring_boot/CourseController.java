package com.rufu_spring.learn_spring_boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"learnSpringBoot","RufuSpring"),
                new Course(2,"learnDevOps","RufuSpringBoot"),
                new Course(2,"learnAzure","RufuSpringBoot")


        );
    }
}
