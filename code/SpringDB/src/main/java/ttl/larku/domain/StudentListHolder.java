/*
Copyright 2019-2022 Anil Pal
All rights reserved by The Third Lane, LLC.
*/

package ttl.larku.domain;

import java.util.List;

public class StudentListHolder {

    private List<Student> students;

    public StudentListHolder() {
    }

    public StudentListHolder(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
