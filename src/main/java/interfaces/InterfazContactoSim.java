package interfaces;

import java.util.List;

 
public interface InterfazContactoSim {
	public int solicitarSimulation(DatosSolicitud sol);
	public DatosSimulation descargarDatos(int ticket);
	public List<Entidad> getEntities();
	public boolean isValidEntityId();
}
