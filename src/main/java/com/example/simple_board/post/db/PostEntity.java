package com.example.simple_board.post.db;

import com.example.simple_board.reply.db.ReplyEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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

	@Transient
	private List<ReplyEntity> replyList = List.of();
}
