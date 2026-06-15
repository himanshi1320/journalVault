package com.learning.journalApp.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.journalApp.entity.ConfigJournalAppEntity;
import com.learning.journalApp.repository.ConfigJournalAppRepository;

import jakarta.annotation.PostConstruct;

@Component
public class AppCache {
	
	@Autowired
	private ConfigJournalAppRepository configJournalAppRepository;
	
	public Map<String,String> APP_CACHE;
	

	@PostConstruct
	public void init() {
		APP_CACHE=new HashMap<>();
		List<ConfigJournalAppEntity> all=configJournalAppRepository.findAll();
		for(ConfigJournalAppEntity configJournalAppEntity: all) {
			APP_CACHE.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
			
		}
 	}
}
