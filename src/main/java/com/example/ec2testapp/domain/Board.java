package com.example.ec2testapp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // 게시글 고유 식별자

    @Column(nullable = false)       // NOT NULL 제약조건 적용
    private String title;

    @Column(columnDefinition = "TEXT")  // TEXT 타입으로 지정 (큰 용량의 텍스트 저장 가능)
    private String content;

    private String author;

    public Board() {
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
