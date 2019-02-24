import java.util.Random;

public class Item {
		private String name;
		private int hpamount;
		public Item()
		{
			name="Potion";
			hpamount = 30;
		}
		public String getname(){
			return name;
		}
		public int gethpamount(){
			return hpamount;
		}
}