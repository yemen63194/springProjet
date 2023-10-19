package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
