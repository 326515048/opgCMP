package com.opg.jpademo.Person;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fan.shijun on 2017-12-04.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
