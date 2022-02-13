#include "lat1.cpp"

int main()
{
    cout << "Masukkan nama tim: ";
    string Team_name;
    cin >> Team_name;

    cout << "Masukkan asal negara tim: ";
    string Country;
    cin >> Country;

    cout << "Masukkan tahun dibentuknya tim: ";
    int Year;
    cin >> Year;

    cout << "Masukkan jumlah pemain: ";
    int players;
    cin >> players;

    string player_names[players];

    cout << "Masukkan nama-nama pemain :" << endl;

    for(int i=0; i<players; i++)
    {
        cout << i+1 << ". ";
        cin >> player_names[i];
    }

    Team tim(Team_name, Country, Year, players, player_names);

    cout << endl;
    cout << "Nama Tim :";
    cout << tim.getTeam_Name() << endl;

    cout << "Asal Negara Tim: ";
    cout << tim.getCountry() << endl;

    cout << "Tahun dibentuknya tim: ";
    cout << tim.getYear() << endl;

    cout << "Jumlah pemain: ";
    cout << tim.getPlayers() << endl;

    cout << "Nama-nama Pemain: " << endl;
    for(int i=0; i<players; i++)
    {
        cout << i+1 << ". ";
        cout << tim.getPLayers_name(i) << endl;
    }
    return 0;
}