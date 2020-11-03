
public class Launcher {

	public static void main(String[] args) {

		NoteStore ref5 = new NoteStore();
		TextNote ref2 = new TextNote();
		TextAndImageNote ref3 = new TextAndImageNote();
		
		String newnote1 = "hello this is note1";
		String newnote2 = "hello this is note2";
		String newnote3 = "hello this is note2";
		String newnote4 = "hello this is note2";
		String url3 = "www.etc.com";
		String url4 = "www.etc.com";
		
		
		ref5.storeNote(newnote1);
		ref5.storeNote(newnote2);
		ref5.storeNote(newnote3, url3);
		ref5.storeNote(newnote4, url4);
		
	
		
	//public static void displayTextNotes() {

			NoteStore ref1 = new NoteStore();		
		System.out.println(ref1.getAllTextNotes());
		
	//}
	
	//public void displayTextAndimageNotes() {
	//	NoteStore ref1 = new NoteStore();
		System.out.println(ref1.getAllTextAndImageNotes());
	//}
		
		

}}
