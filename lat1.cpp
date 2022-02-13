#include <iostream>
#include <string>

using namespace std;

class Team
{
    private:
        string nama_tim;
        string negara;
        int tahun;
        string pemain[100];
        int jumlah_pemain;

    public:
        Team(string x, string y, int z, int total, string names[])
        {   
            setTeam_Name(x);
            setCountry(y);
            setYear(z);
            setPlayers(total);
            setPlayer_Name(names);
        }

        void setTeam_Name(string z)
        {
            nama_tim = z;
        }

        void setCountry(string z)
        {
            negara = z;
        }

        void setYear(int z)
        {
            tahun = z;
        }

        void setPlayers(int z)
        {
            jumlah_pemain = z;
        }

        void setPlayer_Name(string x[100])
        {
            for(int i=0; i<getPlayers(); i++)
            {
                pemain[i] = x[i];
            }
        }

        string getTeam_Name()
        {
            return nama_tim;
        }

        string getCountry()
        {
            return negara;
        }

        int getYear()
        {
            return tahun;
        }

        int getPlayers()
        {
            return jumlah_pemain;
        }

        string getPLayers_name(int i)
        {
            return pemain[i];
        }
};