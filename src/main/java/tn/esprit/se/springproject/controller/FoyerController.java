package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entity.Foyer;
import tn.esprit.se.springproject.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService iFoyerService;

    @GetMapping("/allFoyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = iFoyerService.retrieveAllFoyers();
        return listFoyer;
    }

    @GetMapping("/Foyer/{id}")
    public Foyer retrieveFoyer(@PathVariable("id") Long id) {
        return iFoyerService.retrieveFoyer(id);
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = iFoyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/RemoveFoyer/{id}")
    public void removeFoyer(@PathVariable("id") Long id) {
        iFoyerService.removeFoyer(id);
    }

    @PutMapping("/UpdateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer= iFoyerService.updateFoyer(f);
        return foyer;
    }
}