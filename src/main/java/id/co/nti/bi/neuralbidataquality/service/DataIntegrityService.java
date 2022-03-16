package id.co.nti.bi.neuralbidataquality.service;

import id.co.nti.bi.neuralbidataquality.entity.DataIntegrity;
import id.co.nti.bi.neuralbidataquality.exception.ResourceNotFoundException;
import id.co.nti.bi.neuralbidataquality.repository.DataIntegrityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DataIntegrityService {

    @Autowired
    private DataIntegrityRepository repository;

    public List<DataIntegrity> findAll(){
        return repository.findAll();
    }

    public DataIntegrity findById(UUID id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Feature not found!"));
    }

    public DataIntegrity insert(DataIntegrity feature){
        return repository.save(feature);
    }

    public DataIntegrity update(UUID id, DataIntegrity feature) {
        DataIntegrity featureData = findById(id);
        feature.setId(featureData.getId());
        return repository.save(feature);
    }

    public DataIntegrity delete(UUID id){
        DataIntegrity feature = findById(id);
        repository.deleteById(feature.getId());
        return feature;
    }
}
