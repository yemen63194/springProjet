package tn.esprit.se.springproject.service;

import tn.esprit.se.springproject.entity.Bloc;
import tn.esprit.se.springproject.repository.BlocRepository;

import java.util.List;

public class BlocService implements IBlocService{
    BlocRepository blocRepository;
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
}
