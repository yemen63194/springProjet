package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Bloc;
import tn.esprit.se.springproject.entity.Chambre;
import tn.esprit.se.springproject.repository.BlocRepository;
import tn.esprit.se.springproject.repository.ChambreRepository;
import tn.esprit.se.springproject.entity.Chambre.TypeChambre;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAllEtudiants() { return chambreRepository.findAll(); }

    @Override
    public Chambre addchambre(Chambre c) {
      return  chambreRepository.save(c) ;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return  chambreRepository.save(c) ;
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null) ;
    }

    @Override
    public void removechambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getChambresParNomBloc( String nomBloc ){
        Bloc bloc =blocRepository.findByNomBloc(nomBloc);
        return new ArrayList<>(bloc.getChambres());




    }
    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc ){

        return blocRepository.countChmbresByTypeAndBlocId(type,idBloc);
    }

    @Scheduled(cron = "0 */5 * * * *")  // Run every 5 minutes
    public void pourcentageChambreParTypeChambre() {
        log.info("Calculating the percentage of rooms by room type...");

        List<Chambre> chambres = chambreRepository.findAll();
        int nbTotalChambres = chambres.size();

        log.info("- tn.esprit.foyer.services.ChambreServiceImpl - nbTotalsChambres : {}", nbTotalChambres);

        for (TypeChambre typeChambre : TypeChambre.values()) {
            long countByType = chambres.stream()
                    .filter(chambre -> chambre.getTypeC() == typeChambre)
                    .count();

            double percentage = (countByType * 100.0) / nbTotalChambres;

            log.info("- tn.esprit.foyer.services.ChambreServiceImpl - Le pourcentage des chambres pour Le type {} est égal à {}", typeChambre, percentage );
        };

        log.info("End calculating the percentage of rooms by room type.");
    }
}
