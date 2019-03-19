import java.util.List;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.google.gson.annotations.SerializedName;

public class Registro {
	@SerializedName("Meta Data")
	private Metadata metadata;
	@JsonUnwrapped
	@SerializedName("Time Series (5min)")
	private Serie serie;

	public Registro(){}
	
	public Registro(Metadata metadata, Serie serie){
		this.metadata = metadata;
		this.serie = serie;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie){
		this.serie = serie;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
