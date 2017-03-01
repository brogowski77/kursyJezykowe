package pl.brogowski77.primefaces.views;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class FileDownloadView {

	private StreamedContent fileGb;
	private StreamedContent fileDe;
	private StreamedContent fileJp;
	private StreamedContent fileSp;
	private StreamedContent fileNo;

	public FileDownloadView() {
		InputStream stream = FacesContext.getCurrentInstance().getExternalContext()
				.getResourceAsStream("/resources/download/gb.jpg");
		InputStream stream2 = FacesContext.getCurrentInstance().getExternalContext()
				.getResourceAsStream("/resources/download/de.jpg");
		InputStream stream3 = FacesContext.getCurrentInstance().getExternalContext()
				.getResourceAsStream("/resources/download/jp.jpg");
		InputStream stream4 = FacesContext.getCurrentInstance().getExternalContext()
				.getResourceAsStream("/resources/download/sp.jpg");
		InputStream stream5 = FacesContext.getCurrentInstance().getExternalContext()
				.getResourceAsStream("/resources/download/no.jpg");
		fileGb = new DefaultStreamedContent(stream, "image/jpg", "kurs angielskiego.jpg");
		fileDe = new DefaultStreamedContent(stream2, "image/jpg", "kurs niemieckiego.jpg");
		fileJp = new DefaultStreamedContent(stream3, "image/jpg", "kurs japonskiego.jpg");
		fileSp = new DefaultStreamedContent(stream4, "image/jpg", "kurs hiszpanskiego.jpg");
		fileNo = new DefaultStreamedContent(stream5, "image/jpg", "kurs norweskiego.jpg");
	}

	public StreamedContent getFileGb() {
		return fileGb;
	}
	
	public StreamedContent getFileDe() {
		return fileDe;
	}

	public StreamedContent getFileJp() {
		return fileJp;
	}

	public StreamedContent getFileSp() {
		return fileSp;
	}

	public StreamedContent getFileNo() {
		return fileNo;
	}
}
