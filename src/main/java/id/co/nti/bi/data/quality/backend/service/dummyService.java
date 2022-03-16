package id.co.nti.bi.data.quality.backend.service;

import id.co.nti.bi.data.quality.backend.entity.dummy;
import id.co.nti.bi.data.quality.backend.repository.dummyRepo;
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
