package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CourseRepository {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        Course javaOne = Course.builder()
                .className("Java I")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();

        courses.add(javaOne);
    }


    public List<Course> findAllClasses(){
        //链接数据库
        //返回数据库的信息
        return  courses;
    }

    public List<Course> findAllCourse(String searchByCourseName){

        return new ArrayList<Course>();
    }

    public List<Course> findCourseByName(String courseName) {
        if(courseName.equals("Java_I")) {
            return courses;
        }

        return new ArrayList<Course>();
    }

    public List<List<Integer>> twoSum(String input) {
        int target = Integer.parseInt(input);
        List<List<Integer>> res = new ArrayList<>();

        int l = 0, r = arr.length - 1;

        while (l < r) {
            if (arr[l] + arr[r] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[l]);
                list.add(arr[r]);
                res.add(list);
                l++;
            } else if (arr[l] + arr[r] < target) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
