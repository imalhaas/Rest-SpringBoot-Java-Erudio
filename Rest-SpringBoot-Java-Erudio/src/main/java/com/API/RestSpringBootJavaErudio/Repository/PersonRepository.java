package com.API.RestSpringBootJavaErudio.Repository;

import com.API.RestSpringBootJavaErudio.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
