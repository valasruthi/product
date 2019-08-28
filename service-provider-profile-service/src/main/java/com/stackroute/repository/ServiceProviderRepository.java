package com.stackroute.repository;

import com.stackroute.domain.ServiceProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceProviderRepository extends MongoRepository<ServiceProvider,Integer> {

}
