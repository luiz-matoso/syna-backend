package com.syna.url_shortner.controller;

import com.syna.url_shortner.dtos.UrlMappingDTO;
import com.syna.url_shortner.models.User;
import com.syna.url_shortner.service.UrlMappingService;
import com.syna.url_shortner.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/urls")
@AllArgsConstructor
public class UrlMappingController {

    private UrlMappingService urlMappingService;
    private UserService userService;

    @PostMapping("/shorten")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<UrlMappingDTO> createShortUrl(@RequestBody Map<String, String> request,
                                                        Principal principal){
        String originalUrl = request.get("originalUrl");
        User user = userService.findByUsername(principal.getName());

        UrlMappingDTO urlMappingDTO = urlMappingService.createShortUrl(originalUrl, user);

        return ResponseEntity.ok(urlMappingDTO);
    }

}
