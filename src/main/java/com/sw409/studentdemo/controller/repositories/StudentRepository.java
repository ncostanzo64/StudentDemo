
package com.sw409.studentdemo.controller.repositories;

import org.springframework.data.repository.CrudRepository;
import com.sw409.studentdemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}