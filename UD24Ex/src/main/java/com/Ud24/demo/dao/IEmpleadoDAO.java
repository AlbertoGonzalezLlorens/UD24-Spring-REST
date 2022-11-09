package com.Ud24.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Ud24.demo.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByNombre(String nombre);
	
}

