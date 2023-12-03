package tn.esprit.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Bloc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.se.springproject.entity.Chambre;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc (String nomBloc);

    @Query("select COUNT (ch) FROM Bloc b JOIN b.chambres ch WHERE b.idBloc=:idBloc AND ch.typeC=:type")
    long countChmbresByTypeAndBlocId(@Param("type") Chambre.TypeChambre type , @Param("idBloc") long idBloc);
}
