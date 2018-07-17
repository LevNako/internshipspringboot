package ua.com.lev_neko.internshipspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.lev_neko.internshipspringboot.models.Internship;
@Repository
public interface InternshipDAO extends JpaRepository<Internship,Integer> {
}
