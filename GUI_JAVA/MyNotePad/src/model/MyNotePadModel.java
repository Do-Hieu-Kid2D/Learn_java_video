package model;

import view.MyNotePadView;

public class MyNotePadModel {
	MyNotePadView view;
	private String fileName;
	private String content;
	
	public MyNotePadModel(MyNotePadView view) {
		this.view = view;
		this.fileName ="";
		this.content ="";
	}
	public MyNotePadView getView() {
		return view;
	}
	public void setView(MyNotePadView view) {
		this.view = view;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

	
}	
