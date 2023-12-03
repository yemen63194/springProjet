package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entity.Etudiant;
import tn.esprit.se.springproject.service.IEtudiantService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    IEtudiantService etudiantService; // remplacer IEtudiantService par le nom de votre interface
    // http://localhost:8080/Etudiant/retrieve-all-etudiants
    @GetMapping( "/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8080/Etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    // http://localhost:8080/Etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8080/Etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    // http://localhost:8080/Etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }
    @PutMapping("/etudiant_reservation/{nomEt}/{prenomEt}/{idReservation}")
    @ResponseBody
    public Etudiant affecterEtudiantAReservation(@PathVariable String nomEt, @PathVariable("prenomEt") String prenomEt,@PathVariable("idReservation") String idReservation) {
        Etudiant etudiant=etudiantService.affecterEtudiantAReservation(nomEt,prenomEt,idReservation);
        return etudiant;

    }

}