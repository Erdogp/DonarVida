package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.UnidadSangre;

public interface IUnidadService {
	public void insert(UnidadSangre unidadSangre);

	public List<UnidadSangre> list();

	public void delete(int CUnidad);

	public List<UnidadSangre> finByNameInfectiousAgent(UnidadSangre ia);

	public void editar(UnidadSangre ia);
}
