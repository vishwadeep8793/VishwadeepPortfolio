package com.vishwadeep.portfolio.vishwadeepPortfolio.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwadeep.portfolio.vishwadeepPortfolio.Entity.Friends;
import com.vishwadeep.portfolio.vishwadeepPortfolio.Repository.FriendRepository;
import com.vishwadeep.portfolio.vishwadeepPortfolio.Service.friendService;

@Service
public class friendImpl implements friendService {

	@Autowired
	FriendRepository friendRepo;
	
	@Override
	public Friends saveContact(Friends friend) {		
		
		return friendRepo.save(friend);
	}
}
