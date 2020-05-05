package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Ficha;

public interface IFichaDao {
	public void insert(Ficha ficha);

	public List<Ficha> list();

	public void delete(int CFicha);

	public List<Ficha> finByNameInfectiousAgent(Ficha ia);

}
