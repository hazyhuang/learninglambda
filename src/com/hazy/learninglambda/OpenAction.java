package com.hazy.learninglambda;

public class OpenAction implements Action{

	private final Editor editor;
	
	public OpenAction(Editor editor) {
		this.editor=editor;
	}
	
	public void perform() {
		editor.open();
	}
}
