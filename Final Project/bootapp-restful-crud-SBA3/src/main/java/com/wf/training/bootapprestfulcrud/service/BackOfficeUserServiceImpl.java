package com.wf.training.bootapprestfulcrud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.training.bootapprestfulcrud.dto.BackOfficeLoginDto;
import com.wf.training.bootapprestfulcrud.entity.BackOfficeUser;
import com.wf.training.bootapprestfulcrud.repository.BackOfficeUserRepository;

@Service
public class BackOfficeUserServiceImpl implements BackOfficeUserService {

	@Autowired
	private BackOfficeUserRepository backOfficeUserRepository;

	@Override
	public boolean validateUser(BackOfficeLoginDto user) {
		BackOfficeUser boUser = backOfficeUserRepository.findByuserName(user.getUserName());
				
		if (boUser == null) {
			return false;
		} else {
			if (boUser.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

}
