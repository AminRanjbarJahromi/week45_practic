package org.example.Data;

import org.example.IBaseRepository;
import org.example.Model.Teacher;

public interface ITeacherRepository extends IBaseRepository {
    int MAX_TEACHERS = 9;



    Teacher[] findAll();
}
