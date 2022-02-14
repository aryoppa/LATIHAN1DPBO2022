
from Team import Team

tim = Team()

team_name = str(input("Masukkan nama tim: "))
tim.setTeam_Name(team_name)
country = str(input("Masukkan asal negara: "))
tim.setCountry(country)
year = int(input("Tahun dibentuknya tim: "))
tim.setYear(year)
total_player = int(input("Jumlah pemain dalam tim: "))
tim.setTotal_Players(total_player)
player = [Team() for i in range(total_player)]

i = 0

for i in range(total_player):
    print(i+1,". ", end="")
    player = str(input())
    tim.setPlayer(i, player)

i=0

print("===============")
print("Nama Tim:", str(tim.getTeam_Name()))
print("Asal Negara:", str(tim.getCountry()))
print("Tahun dibentuknya Tim:", int(tim.getYear()))
print("Jumlah pemain dalam tim:", int(tim.getTotal_Players()))
print("Nama-nama pemain:")
for i in range(total_player):
    print(i+1,". ", end="")
    print(str(tim.getPlayer(i)))
    