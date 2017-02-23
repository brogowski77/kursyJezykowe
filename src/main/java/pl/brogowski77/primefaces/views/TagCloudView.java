package pl.brogowski77.primefaces.views;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudItem;
import org.primefaces.model.tagcloud.TagCloudModel;

@ManagedBean
public class TagCloudView {

	private TagCloudModel model;

	@PostConstruct
	public void init() {
		model = new DefaultTagCloudModel();
		model.addTag(new DefaultTagCloudItem("PERFECT", 5));
		model.addTag(new DefaultTagCloudItem("KURSY", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 2));
		model.addTag(new DefaultTagCloudItem("JĘZYKOWE", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 2));
		model.addTag(new DefaultTagCloudItem("ANGIELSKI", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 5));
		model.addTag(new DefaultTagCloudItem("NIEMIECKI", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 4));
		model.addTag(new DefaultTagCloudItem("HISZPAŃSKI", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 3));
		model.addTag(new DefaultTagCloudItem("JAPOŃSKI", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 5));
		model.addTag(new DefaultTagCloudItem("NORWESKI", "http://localhost:8080/primefaces/faces/offer.xhtml?i=1", 4));
		model.addTag(new DefaultTagCloudItem("3 i 6 MIESIĘCY", 4));
		model.addTag(new DefaultTagCloudItem("DLA POCZĄTKUJĄCYCH", 2));
		model.addTag(new DefaultTagCloudItem("I ZAAWANSOWANYCH", 2));
	}

	public TagCloudModel getModel() {
		return model;
	}

	public void onSelect(SelectEvent event) {
		TagCloudItem item = (TagCloudItem) event.getObject();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", item.getLabel());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
