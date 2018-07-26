package pl.akademiakodu.miniBlog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Post {

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Tag> tags = new HashSet<>();

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @Transient
    private String tagList;

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
