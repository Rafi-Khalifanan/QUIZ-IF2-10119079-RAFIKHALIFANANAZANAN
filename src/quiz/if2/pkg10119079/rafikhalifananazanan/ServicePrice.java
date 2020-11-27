package quiz.if2.pkg10119079.rafikhalifananazanan;
import java.util.Scanner;
        
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class ServicePrice implements ServiceItem {
    private float PriceService, discount;
    
    public float getPriceService(){
        return PriceService;
    }
    
    public void setPriceService(float PriceService){
        this.PriceService=PriceService;
    }
    
    @Override
    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }
    
    @Override
    public float getPrice(int serviceItem){
        
    }
}
