package com.github.workTimeMangementGithub.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CardService implements ICardService {

	String apiBaseUrl = "https://api.github.com";
	
}
