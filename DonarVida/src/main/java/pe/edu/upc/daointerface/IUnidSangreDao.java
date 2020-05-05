package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.UnidadSangre;

public interface IUnidSangreDao {
	public void insert(UnidadSangre unidadSangre);

	public List<UnidadSangre> list();

	public void delete(int CUnidad);

	public List<UnidadSangre> finByNameInfectiousAgent(UnidadSangre ia);

	public void editar(UnidadSangre ia);
}
