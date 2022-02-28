package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import mainApp.dto.Empleado;
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	
	public List<Empleado> findByTrabajo(String trabajo);

}
