package com.dorohovich.footballer.app;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FootballerRepository extends MongoRepository<Footballer, String> {

    List<Footballer> findFootballersByIdInOrderByPosition(List<String> idList);
}
