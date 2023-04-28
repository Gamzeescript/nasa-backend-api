package com.ampersand.apinasa.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ampersand.apinasa.beans.RegistroNasa;

@Repository
public interface RegistroNasaRep extends JpaRepository<RegistroNasa, Long>{

}
