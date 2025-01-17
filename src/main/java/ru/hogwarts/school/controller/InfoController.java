package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("/port")
public class InfoController {

    private final FacultyService facultyService;

    public InfoController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping
    public String getServerPort() {
        return serverPort;
    }

    @GetMapping("/sum")
    public int getSum() {
        return facultyService.getSum();
    }
}