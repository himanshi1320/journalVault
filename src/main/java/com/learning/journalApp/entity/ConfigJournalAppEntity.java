package com.learning.journalApp.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Document(collection="config_journal_app")
@Getter
@Setter
@NoArgsConstructor
//@Data
public class ConfigJournalAppEntity {

	
	private String key;
	
	private String value;

}
