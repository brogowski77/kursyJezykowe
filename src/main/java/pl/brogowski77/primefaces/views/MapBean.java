package pl.brogowski77.primefaces.views;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
@ManagedBean
public class MapBean {
	private MapModel model = new DefaultMapModel();

	public MapBean() {
		model.addOverlay(new Marker(new LatLng(41.381542, 2.122893), "Perfect"));
	}

	public MapModel getModel() {
		return this.model;
	}
}
