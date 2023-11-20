package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Bloc;
import tn.esprit.se.springproject.entity.Chambre;
import tn.esprit.se.springproject.repository.BlocRepository;
import tn.esprit.se.springproject.repository.ChambreRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class BlocService implements IBlocService{
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {return blocRepository.save(b) ;
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambreABloc(List<Long> numeroChambre, String nomBloc) {
        Bloc bloc = blocRepository.findBynomBloc(nomBloc);
        for (Long numero : numeroChambre) {
            Chambre chambre = chambreRepository.findByNumeroChambre(numero);
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }

        return bloc;
    }

    @Override
    public Bloc desaffecterChambreDeBloc(List<Long> numeroChambre) {
        for (Long numero : numeroChambre) {
            Chambre chambre = chambreRepository.findByNumeroChambre(numero);
            if (chambre != null) {
                chambre.setBloc(null);
                chambreRepository.save(chambre);
            }
        }
        return null;
    }
}
