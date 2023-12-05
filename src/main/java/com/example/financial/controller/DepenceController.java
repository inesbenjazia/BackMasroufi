package com.example.financial.controller;

import com.example.financial.Model.Depence;
import com.example.financial.ServiceImp.DepenceServImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDepence")
@CrossOrigin(origins = "*")
public class DepenceController {
    @Autowired
    private DepenceServImp serv ;

    @PostMapping("/add")
    public ResponseEntity<Depence> addDepence(@RequestBody Depence Depence)
    {
        serv.addDepence(Depence);
        return new ResponseEntity<>(Depence, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Depence>> getAllDepence(){
        List<Depence> Depences = serv.listAllDepence();
        return new ResponseEntity<>(Depences, HttpStatus.OK);
    }


    @GetMapping("/find{id}")
    public ResponseEntity<Depence> getDepenceById(@PathVariable("id") Long id){
        Depence Depence = serv.getDepenceById(id);
        return new ResponseEntity<>(Depence, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepence(@PathVariable("id") Long id) {
        serv.deleteDepence(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



    @GetMapping("/totalExpenses/{categoryId}")
    public ResponseEntity<Double> getTotalExpensesByCategoryId(@PathVariable("categoryId") Long categoryId) {
        double totalExpenses = serv.calculateTotalExpensesByCategoryId(categoryId);
        return new ResponseEntity<>(totalExpenses, HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Double> getOverallTotalExpenses() {
        double overallTotalExpenses = serv.calculateOverallTotalExpenses();
        return new ResponseEntity<>(overallTotalExpenses, HttpStatus.OK);
    }
    @GetMapping("/pourcentage/{categoryId}")
    public ResponseEntity<Double> getPercentageOfTotalExpensesByCategory(@PathVariable("categoryId") Long categoryId) {
        double percentage = serv.calculatePercentageOfTotalExpensesByCategory(categoryId);
        return new ResponseEntity<>(percentage, HttpStatus.OK);
    }

}
