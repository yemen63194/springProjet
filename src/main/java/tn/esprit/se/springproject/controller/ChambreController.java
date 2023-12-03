package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entity.Chambre;
import tn.esprit.se.springproject.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService iChambreService;

    @GetMapping("/allChambre")
    public List<Chambre> getChambre() {
        List<Chambre> listChambres = iChambreService.retrieveAllEtudiants();
        return listChambres;
    }

    @GetMapping("/Chambre/{id}")
    public Chambre retrieveChambre(@PathVariable("id") Long id) {
        return iChambreService.retrieveChambre(id);
    }

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = iChambreService.addchambre(c);
        return chambre;
    }

    @DeleteMapping("/RemoveChambre/{id}")
    public void removeChambre(@PathVariable("id") Long id) {
        iChambreService.removechambre(id);
    }

    @PutMapping("/UpdateChambre")
    public Chambre updateBloc(@RequestBody Chambre c) {
        Chambre chambre= iChambreService.updateChambre(c);
        return chambre;
    }
    @GetMapping("/chambres/{nomBloc}")
    public List<Chambre> getChambresParNomBloc( @PathVariable String nomBloc ){
        return iChambreService.getChambresParNomBloc(nomBloc);
    }

    @GetMapping("/bloc/{idBloc}/chambres/count")
    public long countChmbresByTypeAndBloc(
            @PathVariable long idBloc,
            @RequestParam("type") Chambre.TypeChambre type
    ){
        return iChambreService.nbChambreParTypeEtBloc(type,idBloc);
    }
}
