package com.backend.springjwt.controllers;
import com.backend.springjwt.models.Depence;
import com.backend.springjwt.models.Revenu;
import com.backend.springjwt.services.RevenuServImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiRevenu")
@CrossOrigin(origins = "*")
public class RevenuController {
    @Autowired
    private RevenuServImp serv ;

    @PostMapping("/add")
    public ResponseEntity<Revenu> addRevenu(@RequestBody Revenu Revenu)
    {
        serv.addRevenu(Revenu);
        return new ResponseEntity<>(Revenu, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Revenu>> getAllRevenu(){
        List<Revenu> Revenues = serv.listAllRevenu();
        return new ResponseEntity<>(Revenues, HttpStatus.OK);
    }
    @GetMapping("/find{id}")
    public ResponseEntity<Revenu> getRevenuById(@PathVariable("id") Long id){
        Revenu Revenu = serv.getRevenuById(id);
        return new ResponseEntity<>(Revenu, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRevenu(@PathVariable("id") Long id) {
        serv.deleteRevenu(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/total")
    public ResponseEntity<Double> getOverallTotalExpenses() {
        double overallTotalExpenses = serv.calculateOverallTotalExpenses();
        return new ResponseEntity<>(overallTotalExpenses, HttpStatus.OK);
    }
}
