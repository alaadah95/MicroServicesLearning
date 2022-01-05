package com.example.intellisc.limitsservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Environment config;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsConfigs(@AuthenticationPrincipal Jwt jwt) {
		System.out.println(jwt.getClaims().get("name"));
		return new LimitConfiguration(config.getProperty("limit-service.maximum"),
				config.getProperty("limit-service.minimum"));
	}

	@GetMapping("/intellisc")
	public String intellisc() {

		return "Hello";
	}

	@GetMapping("/albums")
	public List<AlbumRest> albums() {
		List<AlbumRest> result = new ArrayList<>();
		

		for (int i = 0; i < 10; i++) {
			AlbumRest albums = new AlbumRest();
			albums.setAlbumDescription(i + "");
			albums.setAlbumId(i + "");
			albums.setAlbumTitle(i + "");
			albums.setAlbumUrl(i + "");
			albums.setUserId(i + "");
			albums.setPort(config.getProperty("local.server.port"));
			result.add(albums);
		}
		return result;
	}
}
