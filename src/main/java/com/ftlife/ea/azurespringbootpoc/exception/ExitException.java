package com.ftlife.ea.azurespringbootpoc.exception;

import org.springframework.boot.ExitCodeGenerator;

public class ExitException extends RuntimeException implements ExitCodeGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661947168713369274L;

	@Override
	public int getExitCode() {
		return 10;
	}

}
