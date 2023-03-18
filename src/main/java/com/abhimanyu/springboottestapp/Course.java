package com.abhimanyu.springboottestapp;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Course {
    private String name;
    private String author;
    private String id;
}
