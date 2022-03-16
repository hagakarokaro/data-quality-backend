package id.co.nti.bi.neuralbidataquality.controller;

import id.co.nti.bi.neuralbidataquality.entity.DataIntegrity;
import id.co.nti.bi.neuralbidataquality.service.DataIntegrityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping ("/data-integrity")
public class DataIntegrityController {

    @Autowired
    private DataIntegrityService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody DataIntegrity data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(data));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody DataIntegrity data) {
        return ResponseEntity.ok(service.update(id, data));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
