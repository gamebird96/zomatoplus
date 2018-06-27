package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.*;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
