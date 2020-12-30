package com.wf.training.bootapprestfulcrud.exception;

public class AlreadyFinalizedException extends RuntimeException{

	public AlreadyFinalizedException(String message) {
		super(message);
	}
}
