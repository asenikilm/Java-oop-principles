package encapsulation;

//������������

public class Oven {
	
/*  � ��������� ����� t �������	����������� ������� 
    private, �� ������, �� ����� ���� �������� �����
    �������� ���� �����, � ����� ���� ���������. �� �� 
    ������ ���������� ����������� ���� ������ ����������
    ������� MAX_T � MIN_T, ���� ������ ����������� 
    ����� ����� ����� setTemperature(), � ����� 
    ���������� ��������.
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