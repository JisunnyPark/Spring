package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {

	private String title;
	
	// 이거 적용하면 샘플 컨트롤러에 InitBinder 필요 없음 --> 이게 더 간편한듯
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dueDate;
}
