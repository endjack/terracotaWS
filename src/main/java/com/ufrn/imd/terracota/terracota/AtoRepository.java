package com.ufrn.imd.terracota.terracota;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtoRepository extends JpaRepository<Ato, Integer>{
	

}
