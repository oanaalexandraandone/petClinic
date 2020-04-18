package com.example.demo.services.map;

import com.example.demo.model.Visit;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.example.demo.services.VisitService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractServiceMap<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
