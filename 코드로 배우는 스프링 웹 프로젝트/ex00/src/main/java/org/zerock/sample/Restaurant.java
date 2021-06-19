package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data // getter, setter, toString 자동 생성 기능

public class Restaurant {

	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}

