import java.util.Random;

public class Hareket {
	public static int GalibiyetSayisi(Kisi kisi1,Kisi kisi2) {
		
		System.out.println("1-Ta�\n"
		                  +"2-Ka��t\n"
		                  +"3-Makas\n");
		
        System.out.print("*********************************\n");
        
		int[] dizi;
		dizi = new int[] {1,2,3};
		
		Random rastgele =new Random();
		
		int i=0;
		
		
		while(i<100) {
			
			kisi1.setTasKagitMakasSecim(rastgele.nextInt(dizi.length));
			kisi2.setTasKagitMakasSecim(rastgele.nextInt(dizi.length));
			
			
			if(kisi1.getTasKagitMakasSecim()==kisi2.getTasKagitMakasSecim())
			{
				System.out.println("berabere");
				kisi1.setSkor(kisi1.getSkor() + 1);
				kisi2.setSkor(kisi2.getSkor() + 1);
			}
			if(kisi1.getTasKagitMakasSecim()==1 &&kisi2.getTasKagitMakasSecim()==2)
			{
				System.out.println("ki�i2 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 0);
				kisi2.setSkor(kisi2.getSkor() + 1);
				
			}
			if(kisi1.getTasKagitMakasSecim()==1 && kisi2.getTasKagitMakasSecim()==3)
			{
				System.out.println("ki�i1 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 1);
				kisi2.setSkor(kisi2.getSkor() + 0);
			}
			if(kisi1.getTasKagitMakasSecim()==2 && kisi2.getTasKagitMakasSecim()==1)
			{
				System.out.println("ki�i1 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 1);
				kisi2.setSkor(kisi2.getSkor() + 0);
			}			
			if(kisi1.getTasKagitMakasSecim()==2 && kisi2.getTasKagitMakasSecim()==3)
			{
				System.out.println("ki�i2 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 0);
				kisi2.setSkor(kisi2.getSkor() + 1);
			}
			if(kisi1.getTasKagitMakasSecim()==3 && kisi2.getTasKagitMakasSecim()==1)
			{
				System.out.println("ki�i2 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 0);
				kisi2.setSkor(kisi2.getSkor() + 1);
			}
			if(kisi1.getTasKagitMakasSecim()==3 && kisi2.getTasKagitMakasSecim()==2)
			{
				System.out.println("ki�i1 kazand�");
				kisi1.setSkor(kisi1.getSkor() + 1);
				kisi2.setSkor(kisi2.getSkor() + 0);
			}
			
			
			
			
			
			
			
			i++;
			
		}
		
		
		
		if(kisi1.getSkor()>kisi2.getSkor()) {
			System.out.println("Ki�i1 oyunu kazand�..."+kisi1.getSkor() +"/"+kisi2.getSkor());
		}
		else {
			System.out.println("Ki�i2 oyunu kazand�..."+kisi1.getSkor() +"/"+kisi2.getSkor());
		}
		return i;
		
		
		
		
		
		
	}
	
	
	
}
