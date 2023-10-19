package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
