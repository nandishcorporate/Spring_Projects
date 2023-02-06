package com.cg.sms.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -567694469232019176L;
	
	private String errorMessage;	

}
