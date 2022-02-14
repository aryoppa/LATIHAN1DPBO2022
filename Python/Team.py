class Team:
    team_name = ""
    country = ""
    year = ""
    player = []
    total_player = ""

    def __init__(self):
        self.team_name = ""
        self.country = ""
        self.year = ""
        self.player = []
        self.total_player = ""

    def setTeam_Name(self, team_name):
        self.team_name = team_name

    def getTeam_Name(self):
        return self.team_name

    def setCountry(self, country):
        self.country = country

    def getCountry(self):
        return self.country

    def setYear(self, year):
        self.year = year

    def getYear(self):
        return self.year

    def setPlayer(self, index, player):
        self.player.insert(index, player)

    def getPlayer(self, index):
        return self.player[index]

    def setTotal_Players(self, total_player):
        self.total_player = total_player

    def getTotal_Players(self):
        return self.total_player