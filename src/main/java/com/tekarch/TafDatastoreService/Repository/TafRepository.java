package com.tekarch.TafDatastoreService.Repository;


import com.tekarch.TafDatastoreService.models.Taf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TafRepository extends JpaRepository<Taf, Long> {

}
