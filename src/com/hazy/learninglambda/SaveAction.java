package com.hazy.learninglambda;

public class SaveAction implements Action{

	private final Editor editor;
	
	public SaveAction(Editor editor) {
		this.editor=editor;
	}
	
	public void perform() {
		editor.save();
	}
}
