package com.Ud24.demo.service;

import java.util.List;
import com.Ud24.demo.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleado();
	public Empleado guardarCliente(Empleado empleado);
	public Empleado empleadoXID(Long id);
	public List<Empleado> listarEmpleadoNombre(String nombre);
	public Empleado actualizarEmpleado(Empleado empleado);
	public void eliminarEmpleado(Long id);
	
	
}