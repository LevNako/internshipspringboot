package ua.com.lev_neko.internshipspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.lev_neko.internshipspringboot.models.Student;
@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
}
