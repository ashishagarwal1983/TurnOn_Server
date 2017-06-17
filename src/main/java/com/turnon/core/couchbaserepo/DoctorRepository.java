package com.turnon.core.couchbaserepo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.turnon.core.model.DoctorProfile;

public interface DoctorRepository extends CouchbaseRepository<DoctorProfile, Long> {

}
