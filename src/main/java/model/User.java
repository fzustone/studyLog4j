package model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author chenly
 * @create 2020-02-21 22:45
 */
@Data
public class User {
	private String name;

	private LocalDateTime birthDay;

	public User(String name, LocalDateTime birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}
}
