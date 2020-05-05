package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Licenciado_Laboratorio;

public interface ILicenciadoDao {
	public void insert(Licenciado_Laboratorio licenciado);

	public List<Licenciado_Laboratorio> list();

	public void delete(int CLicLab);

	public List<Licenciado_Laboratorio> finByNameInfectiousAgent(Licenciado_Laboratorio ia);

}
