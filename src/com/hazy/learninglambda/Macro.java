package com.hazy.learninglambda;

import java.util.ArrayList;
import java.util.List;

public class Macro {
	private final List<Action> actions;

	public Macro() {
		actions = new ArrayList<>();
	}

	public void record(Action action) {
		actions.add(action);
	}

	public void run() {
		actions.forEach(Action::perform);
	}
	
	public static void main(String[] args) {
		Editor editor=new EditorImp();
	/*	Macro macro = new Macro();
		macro.record(new OpenAction(editor));
		macro.record(new SaveAction(editor));
		macro.record(new CloseAction(editor));
		macro.run();*/
	/*	Macro macro = new Macro();
		macro.record(() -> editor.open());
		macro.record(() -> editor.save());
		macro.record(() -> editor.close());
		macro.run();*/
		
		Macro macro = new Macro();
		macro.record(editor::open);
		macro.record(editor::save);
		macro.record(editor::close);
		macro.run();
	}
}