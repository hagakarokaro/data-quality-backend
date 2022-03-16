package id.co.nti.bi.neuralbidataquality.service;

import id.co.nti.bi.neuralbidataquality.entity.DataIntegrity;
import id.co.nti.bi.neuralbidataquality.entity.dummy;
import id.co.nti.bi.neuralbidataquality.repository.dummyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dummyService {

    @Autowired
    private dummyRepo repo;

    public List<dummy> findAll(){
        return repo.findAll();
    }
}
