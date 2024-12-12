package com.example.simple_board.post.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "post")
public class PostEntity {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	private Long boardId;
	private String userName;
	private String password;
	private String email;
	private String status;
	private String title;

	@Column(columnDefinition = "TEXT")
	private String content;
	private LocalDateTime postedAt;
}
