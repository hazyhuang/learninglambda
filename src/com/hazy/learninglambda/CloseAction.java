package com.hazy.learninglambda;

public class CloseAction implements Action{

	private final Editor editor;
	
	public CloseAction(Editor editor) {
		this.editor=editor;
	}
	
	public void perform() {
		editor.close();
	}
}
