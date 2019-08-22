package GUI;
import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
* @Author Team F
* @Version 1.0
* @Date 30.06.2019
* Klasse macht das Eingabelimit für die Felder der Namen
*/
public class JTextFieldCharLimit extends PlainDocument {

	/* Deklaration der Variabel*/
	private int limit;
	
	/**
	 * Konstruktor
	 * @param limitation
	 */
	public JTextFieldCharLimit(int limitation) {
		
		this.limit = limitation;
	}
	
	/**
	 * Methode fügt den STring ein
	 */
	public void insertString(int offset, String str, javax.swing.text.AttributeSet set) throws BadLocationException {
		
		if (str == null) {
			return;
		}else if (getLength() + str.length() <= limit) {
			str.toUpperCase();
			super.insertString(offset, str, set);
		}
	}
}
