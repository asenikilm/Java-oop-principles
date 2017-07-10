package encapsulation;

//Інкапсуляція

public class Oven {
	
/*  В оголошенні змінної t вказано	модифікатор доступу 
    private, це означає, що змінна буде доступна тільки
    всередині того класу, в якому вона оголошена. Ми не 
    можемо встановити температуру поза межами допустимих
    значень MAX_T і MIN_T, тому змінити температуру 
    можна через метод setTemperature(), в якому 
    відбувається перевірка.
*/
	
		   private int t = 0; // temperature
		   
		   private static final int MAX_T = 380;
		   private static final int MIN_T = 0;

		   
		   public void setTemperature(int t) {
		       if (t >= MAX_T || t <= MIN_T) return;
		       this.t = t;
		   }

		  
		   public int getTemperature() {
		       return t;
		   }

		}