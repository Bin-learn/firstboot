package com.bin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by  bin
 * Time： 2017/11/22.
 */
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    public List<Teacher> findByName(String name);
}
