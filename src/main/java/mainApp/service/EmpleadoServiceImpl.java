package mainApp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IEmpleadoDAO;
import mainApp.dto.Empleado;
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	public List<Empleado> listarEmpleados(){
		return iEmpleadoDAO.findAll();
	}; //listar todos los empleados
	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}
	
	@Override
	public Empleado empleadoXID(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadosTrabajo(String nombre) {
		return iEmpleadoDAO.findByTrabajo(nombre);
	}
	
	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}


}
