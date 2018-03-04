package com.example.pets.repository;

import com.example.pets.domain.Pet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PetRepository extends ReactiveMongoRepository<Pet, String> {

    @Tailable
    Flux<Pet> findWithTailableCursorBy();

    Mono<Pet> findPetById(String id);

}
