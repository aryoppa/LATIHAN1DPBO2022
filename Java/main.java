import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        System.out.print("Masukkan nama tim: ");
        
        name = scan.next();
        

        String country;
        System.out.print("Masukkan asal negara tim: ");
        country = scan.next();
        
        int year;
        System.out.print("Masukkan tahun dibentuknya tim: ");
        year = scan.nextInt();
    
        int total_players;
        System.out.print("Masukkan jumlah pemain: ");
        
        total_players = scan.nextInt();
        

        String player[] = new String[total_players];
        System.out.print("Masukkan nama-nama pemain: \n");

        for(int i=0; i<total_players; i++)
        {
            System.out.print((i+1) + ". ");
            try{
                player[i] = scan.next();
            }catch(Exception e){}
        }

        Team tim;
        tim = new Team(name, country, year, player, total_players); 

        System.out.println("");
        System.out.println("Nama tim: " + tim.getName());
        System.out.println("Asal Negara tim: " + tim.getCountry());
        System.out.println("Tahun dibentuknya tim: " + tim.getYear());
        System.out.println("Jumlah pemain: " + tim.getTotal_Player());
        System.out.println("Nama-nama Pemain: ");
        
        for(int i=0; i<total_players; i++)
        {
            System.out.println((i+1) + " " + tim.getPlayer(i));
        }
    }

}