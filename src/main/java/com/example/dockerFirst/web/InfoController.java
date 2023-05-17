package com.example.dockerFirst.web;

import com.example.dockerFirst.repository.InfoRepository;
import com.example.dockerFirst.repository.entity.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class InfoController {

    private final InfoRepository infoRepository;

    @PostMapping("/create/{info}")
    public ResponseEntity addInfo(@RequestBody Info info) {
        try {
            infoRepository.save(info);
        } catch (Exception e) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Info : " + info.toString() + "added successful");
    }

    @GetMapping("/info")
    public ResponseEntity getAllInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(infoRepository.findAll());
    }
}
