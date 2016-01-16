import java.util.ArrayList;

public class ListaProionton {
	
	//Συλλογή με Προϊόντα
	private ArrayList<Proion> proionta;
	
	//Κατασκευαστής
	public ListaProionton()
	{
		proionta=new ArrayList<Proion>();
	}
	
	// Προσθέτει ένα προϊόν στη ΛίσταΠροϊόντων
	public void prosthikiProiontos(Proion proion)
	{
		proionta.add(proion);
	}
	
	//Αναζητά στη ΛίσταΠροϊόντων το Προϊόν με τον αντίστοιχο κωδικόΠροϊόντος
	//Επιστρέφει το Προϊόν ή NULL αν δε βρεθεί
	public Proion anazitisiProiontos(String kodikosProiontos)
	{
		//
	}
	
	//Ενημερώνει τη ΛίσταΠροϊόντων με μια άλλη ΛίσταΠροϊόντων
	//Χρησιμοποιείται κατά την ενημέρωση από τον Προμηθευτή
	//Όσα προϊόντα έχουν νέο κωδικό προστίθενται στην Λίστα
	//Σε όσα υπάρχουν ήδη, ενημερώνεται η ποσότητα στον 
	//Προμηθευτή και η τιμή αγοράς
	public void enimerosiApoLista(ListaProionton listaProionton)
	{
		//
	}
	
	//Επιστρέφει το πλήθος των Προϊόντων της Λίστας
	public int ferePlithosProionton()
	{
		return proionta.size();
	}
	
	//Επιστρέφει το Προϊόν που βρίσκεται στη συγκεκριμένη θέη της Λίστας
	public Proion fereProion(int thesi)
	{
		return proionta.get(thesi);
	}
	
	/*Σε μια πραγματική υλοποίηση θα υπήρχαν μέθοδοι για αφαίρεση Προϊόντων,
	 *και επίσης οι void μέθοδοι θα επέστρεφαν κάποιον άλλο τύπο για επαλήθευση
	 *της σωστής ολοκλήρωσης της ενέργειας
	 */
}
