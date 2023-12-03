package tn.esprit.se.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entity.Bloc;
import tn.esprit.se.springproject.entity.Foyer;
import tn.esprit.se.springproject.repository.BlocRepository;
import tn.esprit.se.springproject.repository.FoyerRepository;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
        Foyer Foyerr = foyerRepository.save(foyer);
        Set<Bloc> blocs = Foyerr.getBlocs();
        if (blocs != null && !blocs.isEmpty()) {
            for (Bloc bloc : blocs) {
                bloc.setFoyer(Foyerr);
                blocRepository.save(bloc);
            }
        }
        return Foyerr;


    }
}
