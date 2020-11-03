import java.util.ArrayList;

public class NoteStore {

	
	TextNote ref1 = new TextNote();
	TextAndImageNote ref2 = new TextAndImageNote();
	
	ArrayList<String> notesimgs = new ArrayList<String>();	
	ArrayList<String> notes = new ArrayList<String>();
	
	public void storeNote(String A) {
	notes.add(A);
	
	}
	
	public void storeNote(String A, String B) {
	notesimgs.add(A);
	notesimgs.add(B);
	
	}

	public ArrayList<String> getAllTextNotes() {
	
	return notes;
	
	}
	public ArrayList<String> getAllTextAndImageNotes() {
	
	return notesimgs;
	}
}
