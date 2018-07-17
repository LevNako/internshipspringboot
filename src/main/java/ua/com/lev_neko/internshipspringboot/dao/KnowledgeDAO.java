package ua.com.lev_neko.internshipspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.lev_neko.internshipspringboot.models.Knowledge;
@Repository
public interface KnowledgeDAO extends JpaRepository<Knowledge,Integer> {
}
