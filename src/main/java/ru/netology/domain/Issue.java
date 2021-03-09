package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue {
    private int id;
    private String name;
    private boolean isOpen;
    private Author author;
    private String date;
    private String updateDate;
    private Set<Label> label;
    private Set<Author> assignee;
    private Set<Tag> tag;
    private int comments;
}