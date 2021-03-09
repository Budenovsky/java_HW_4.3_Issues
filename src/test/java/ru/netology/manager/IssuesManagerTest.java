package ru.netology.manager;

import ru.netology.domain.Author;
import ru.netology.domain.Issue;
import ru.netology.domain.Label;
import ru.netology.domain.Tag;
import ru.netology.repository.IssuesRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IssuesManagerTest {
    IssuesRepository repository = new IssuesRepository();
    IssuesManager manager = new IssuesManager(repository);

    private Author firstAuthor = new Author(123, "Grigorii");
    private Author secondAuthor = new Author(234, "Helena");
    private Author thirdAuthor = new Author(345, "Nastia");
    private Author foursAuthor = new Author(456, "Jule");
    private Set<Author> assignees = new HashSet<>();
    private Set<Tag> tags = new HashSet<>();

    private Label firstLabel = new Label(12, "status: triaged", "green");
    private Label secondLabel = new Label(23, "theme: ordering", "purple");
    private Label thirdLabel = new Label(34, "type: question", "pink");
    private Set<Label> labels = new HashSet<>();

    private Issue firstIssue = new Issue(111, "Helena", true, firstAuthor, "12.12.20", "24.01.21", labels, secondAuthor, tags,0);
    private Issue firstIssue = new Issue();
}
