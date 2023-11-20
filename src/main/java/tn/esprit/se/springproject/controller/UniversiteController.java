package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entity.Universite;
import tn.esprit.se.springproject.service.IUniversiteService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/universit")
public class UniversiteController {
    IUniversiteService iUniverstService;

    @GetMapping("/allUniversit")
    public List<Universite> getUniversite() {
        List<Universite> listUniversit = iUniverstService.retrieveAllUniversites();
        return listUniversit;
    }
    @GetMapping("/Universit/{id}")
    public Universite retrieveUniversite(@PathVariable ("id") Long id) {
        return iUniverstService.retrieveUniversite(id);
    }

    @PostMapping("/addUniversit")
    public Universite addUniversit(@RequestBody Universite u) {
        Universite universit = iUniverstService.addUniversite(u);
        return universit;
    }

    @DeleteMapping("/RemoveUniversit/{id}")
    public void removeUniversite(@PathVariable("id") Long id) {
        iUniverstService.removeUniversite(id);
    }

    @PutMapping("/UpdateUniversit")
    public Universite updateUniversit(@RequestBody Universite f) {
        Universite universit= iUniverstService.updateUniversite(f);
        return universit;
    }
    @PutMapping("/affecter/{nomUniversite}/{idFoyer}")
    @ResponseBody
    public Universite affecterFoyerAUniversite(@PathVariable("nomUniversite") String nomUniversite,@PathVariable("idFoyer") Long idFoyer){
        Universite universite= iUniverstService.affecterFoyerAUniversite(idFoyer,nomUniversite);
        return universite;
    }
    @PutMapping("/desaffecter/{idUniversite}")
    @ResponseBody
    public Universite desaffecterFoyerAUniversite(@PathVariable("idUniversite") Long idUniversite){
        Universite universite= iUniverstService.desaffecterFoyerAUniversite(idUniversite);
        return universite;
    }
}
