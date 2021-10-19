package com.example.SpringSecurity.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class Task {
    private long id;
    private String title;
    private String status;
    private String description;
}
