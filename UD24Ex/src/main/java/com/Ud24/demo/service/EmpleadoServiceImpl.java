package com.Ud24.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Ud24.demo.dao.IEmpleadoDAO;
import com.Ud24.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleado() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarCliente(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}


	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}

}
