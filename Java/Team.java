public class Team{

    private String name;
    private String country;
    private int year;
    private String player[];
    private int total_players;

    public Team(String name, String country, int year, String player[], int total_players)
    {
        SetName(name);
        setCountry(country);
        setYear(year);
        setTotal_Player(total_players);
        setPlayer(player);
    } 

    public void SetName(String name)
    {
        this.name = name;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setPlayer(String player[])
    {
        this.player = new String[getTotal_Player()];

        for(int i=0; i<getTotal_Player(); i++)
        {
            this.player[i] = player[i];
        }
    }

    public void setTotal_Player(int total_players)
    {
        this.total_players = total_players;
    }

    String getName()
    {
        return this.name;
    }

    String getCountry()
    {
        return this.country;
    }

    int getYear()
    {
        return this.year;
    }

    String getPlayer(int i)
    {
        return this.player[i];
    }

    int getTotal_Player()
    {
        return this.total_players;
    }

}