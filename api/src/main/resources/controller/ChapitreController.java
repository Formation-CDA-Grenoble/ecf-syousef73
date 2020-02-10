
package com.example.api.controller;

import javax.validation.Valid;
import java.util.List;
import com.example.api.model.User;
import com.example.api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController

@RequestMapping("/api/chapitre")

@CrossOrigin
public class ChapireController {

    @Autowired 
    private ChapitreRepository chapitreRepository;
    
   
    @GetMapping("")
    public List<Chapitre> getAllChapitres() {
        return chapitreRepository.findAll();
    }

   
    @PostMapping("")
  
    @ResponseStatus(value = HttpStatus.CREATED)
    public Chapitre createChapitre(@Valid @RequestBody Chapitre chapitre) {
        
        return ChapitreRepository.save(user);
    }

   
    @PutMapping("/{id}")
    public Chapitre updateChapitre(@PathVariable(value = "id") Long chapitreId, @Valid @RequestBody User newUser) {
        
        Chapitre chapitre = this.fetchUser(chapitreId);
      
        chapitre.setEmail(newChapitre.gettitle());
        chapitre.setName(newChapitre.getpublisher());

        return chapitreRepository.save(chapitre);
    } 
    
    @GetMapping("/{id}")
    public Chapitre getChapitreById(@PathVariable(value = "id") Long chapitreId) {
        return this.fetchChapitre(chapitreId);
    } 
  
    @DeleteMapping("/{id}")
  
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteChapitre(@PathVariable(value = "id") Long ChapitreId) {
        Chapitre chapitre = this.fetchChapitre(chapitreId);
        chapitreRepository.delete(chapitre);
    }

    
    public Chapitre fetchChapitre(Long chapitreId) {
        Chapitre chapitre = ChapitreRepository.findById(userId).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "chapitre not found")
        );
        return chapitre;
    }
}
