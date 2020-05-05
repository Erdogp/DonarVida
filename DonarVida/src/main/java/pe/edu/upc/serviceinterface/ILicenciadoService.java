package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Licenciado_Laboratorio;

public interface ILicenciadoService {
	public void insert(Licenciado_Laboratorio licenciado);

	public List<Licenciado_Laboratorio> list();

	public void delete(int CLicLab);

	public List<Licenciado_Laboratorio> finByNameInfectiousAgent(Licenciado_Laboratorio ia);

}
