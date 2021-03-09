package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.List;


public class IssuesRepository {
    private List<Issue> items = new ArrayList<>();

    public boolean add(Issue item) {
        return items.add(item);
    }

    public List<Issue> getAll() {
        return items;
    }

    public List<Issue> findOpen(List<Issue> items) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.isOpen() == true) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Issue> findClosed(List<Issue> items) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.isOpen() == false) {
                result.add(item);
            }
        }
        return result;
    }

    public void openById (List<Issue> items, int id) {
        for (Issue item : items) {
            if (item.getId() == id) {
                item.setOpen(true);
            }
        }
    }

    public void closeById (List<Issue> items, int id) {
        for (Issue item : items) {
            if (item.getId() == id) {
                item.setOpen(false);
            }
        }
    }
}
