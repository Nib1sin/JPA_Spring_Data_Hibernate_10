package com.nibi.springdata.associations.onetoone.repos;

import org.springframework.data.repository.CrudRepository;

import com.nibi.springdata.associations.onetoone.entities.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

}
