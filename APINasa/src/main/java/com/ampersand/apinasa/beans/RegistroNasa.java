package com.ampersand.apinasa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="registro_nasa")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class RegistroNasa {
	
	private Long idNasa;
	private String href;
	private String center;
	private String text;
	private LocalDateTime historial;
	
	
	public RegistroNasa() {
		super();
	}


	public RegistroNasa(Long idNasa, String href, String center, String text, LocalDateTime historial) {
		super();
		this.idNasa = idNasa;
		this.href = href;
		this.center = center;
		this.text = text;
		this.historial = historial;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_nasa")
	public Long getIdNasa() {
		return idNasa;
	}


	public void setIdNasa(Long idNasa) {
		this.idNasa = idNasa;
	}


	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public String getCenter() {
		return center;
	}


	public void setCenter(String center) {
		this.center = center;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public LocalDateTime getHistorial() {
		return historial;
	}


	public void setHistorial(LocalDateTime historial) {
		this.historial = historial;
	}
	
	
	
	

}