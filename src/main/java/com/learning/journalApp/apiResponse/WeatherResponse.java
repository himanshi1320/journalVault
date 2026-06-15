package com.learning.journalApp.apiResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {

	private Current current;

	@Getter
	@Setter
	public class Current {

		private int temperature;

		@JsonProperty("weather_descriptions")
		private ArrayList<String> weatherDescriptions;

		@JsonProperty("feelslike")
		private int feelsLike;

	}
}
