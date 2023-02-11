package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotePadView;

public class MyNotePadController implements ActionListener{

	MyNotePadView mynotepadview;
	
	public MyNotePadController(MyNotePadView mynotepadview) {
		this.mynotepadview = mynotepadview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		JFileChooser fc = new  JFileChooser();
		if(command.equals("Open")) {
				int returnVal = fc.showOpenDialog(mynotepadview);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					String fileName = file.getName();
					this.mynotepadview.model.setFileName(file.getAbsolutePath());
					this.mynotepadview.lblNewLabel.setText(this.mynotepadview.model.getFileName());
					if(fileName.endsWith(".txt")) {
						try {
							List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
							String result = "";
							for (String line : allText) {
								result+=line;
								result+="\n";
							}
							this.mynotepadview.model.setContent(result);
							this.mynotepadview.textArea.setText(this.mynotepadview.model.getContent());
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				} 
		}else if(command.equals("Save")){
			if(this.mynotepadview.model.getFileName().length()>0) {
				save(this.mynotepadview.model.getFileName());
			}else {
				int returnVal = fc.showSaveDialog(this.mynotepadview);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
				} 
			}
		}
	}
	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.mynotepadview.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
	}
			
	
}
