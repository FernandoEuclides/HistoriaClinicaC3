package co.edu.unab_g47_2.webapp.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab_g47_2.webapp.models.PacienteModel;

@Repository
public interface PacienteRepository extends CrudRepository<PacienteModel, Long> {
    public abstract ArrayList<PacienteModel> findByPrioridad(Integer prioridad);

}
