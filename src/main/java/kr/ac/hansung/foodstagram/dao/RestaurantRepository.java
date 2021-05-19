package kr.ac.hansung.foodstagram.dao;

import kr.ac.hansung.foodstagram.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findByNameContaining(String keyword);



}
