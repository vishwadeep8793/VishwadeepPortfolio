package com.vishwadeep.portfolio.vishwadeepPortfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwadeep.portfolio.vishwadeepPortfolio.Entity.Friends;

@Repository
public interface FriendRepository extends JpaRepository<Friends, Integer>{

}
