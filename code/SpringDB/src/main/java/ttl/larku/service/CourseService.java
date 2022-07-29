/*
Copyright 2019-2022 Anil Pal
All rights reserved by The Third Lane, LLC.
*/

package ttl.larku.service;

import org.springframework.transaction.annotation.Transactional;
import ttl.larku.domain.Course;

import java.util.List;

@Transactional
public interface CourseService {
    Course createCourse(String code, String title);

    Course createCourse(Course course);

    boolean deleteCourse(int id);

    boolean updateCourse(Course course);

    Course findByCode(String code);

    Course getCourse(int id);

    List<Course> getAllCourses();

    void clear();
}
