package com.example.demo.services.map;

import com.example.demo.model.Speciality;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.example.demo.services.SpecialtyService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractServiceMap<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
