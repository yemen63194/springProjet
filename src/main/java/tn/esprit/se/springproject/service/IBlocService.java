package tn.esprit.se.springproject.service;

import tn.esprit.se.springproject.entity.Bloc;


import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}
