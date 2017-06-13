package com.turnon.core.couchbaserepo;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.turnon.core.model.UserProfile;


public interface UserRepository extends CouchbaseRepository<UserProfile, Long> {

	@Query
	List<UserProfile> findByName(String name);
}

