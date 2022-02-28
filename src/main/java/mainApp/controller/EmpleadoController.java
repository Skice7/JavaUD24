package mainApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Empleado;
import mainApp.service.EmpleadoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	//listar empleados
	@GetMapping("/Empleados")
	public List<Empleado> Empleados() {
		return empleadoServiceImpl.listarEmpleados();
	}

	// listar empleados por campo nombre
		@GetMapping("/Empleados/trabajo/{trabajo}")
    public List<Empleado> listarEmpleadosTrabajo(@PathVariable(name="trabajo") String trabajo) {
        return empleadoServiceImpl.listarEmpleadosTrabajo(trabajo);
    }
	
	@PostMapping("/Empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado Empleado) {

		return empleadoServiceImpl.guardarEmpleado(Empleado);
	}

	//listar por id
	@GetMapping("/Empleados/{id}")
	public Empleado EmpleadoXID(@PathVariable(name = "id") Long id) {

		Empleado Empleado_xid = new Empleado();

		Empleado_xid = empleadoServiceImpl.empleadoXID(id);

		System.out.println("Empleado XID: " + Empleado_xid);

		return Empleado_xid;
	}

	@PutMapping("/Empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado Empleado) {

		Empleado Empleado_seleccionado = new Empleado();
		Empleado Empleado_actualizado = new Empleado();

		Empleado_seleccionado = empleadoServiceImpl.empleadoXID(id);

		Empleado_seleccionado.setId(Empleado.getId());
		Empleado_seleccionado.setNombre(Empleado.getNombre());
		Empleado_seleccionado.setTrabajo(Empleado.getTrabajo());
		Empleado_seleccionado.setSalario(Empleado.getSalario());

		Empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(Empleado_seleccionado);

		System.out.println("El Empleado actualizado es: " + Empleado_actualizado);

		return Empleado_actualizado;
	}

	@DeleteMapping("/Empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}

}
