package com.mylibrary.libraryapplication.repository.springdataJPA;

import com.mylibrary.libraryapplication.model.Owner;
import com.mylibrary.libraryapplication.repository.OwnerRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface SpringDataOwnerRepository extends OwnerRepository{

    @Override
    @Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.books WHERE owner.lastName LIKE :lastName%")
    Collection<Owner> findByLastName(@Param("lastName") String lastName);

    @Override
    @Query("SELECT owner FROM Owner owner left join fetch owner.books WHERE owner.id =:id")
    Owner findById(@Param("id") int id);
}
