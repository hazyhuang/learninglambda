package com.hazy.learninglambda;

public class EditorImp implements Editor{

	@Override
	public void save() {
		System.out.println("Save!");
		
	}

	@Override
	public void open() {
		System.out.println("Open!");
		
	}

	@Override
	public void close() {
		System.out.println("Close!");
		
	}

}
