<?php

    include "class.php";

    $team = new Team();
    $team->setTeam_Name("Lakers");
    $team->setCountry("Amerika");
    $team->setYear("1998");
    $team->setTotal_Player(4);
    $team->setPlayer(0, "LeBron James");
    $team->setPlayer(1, "Anthony Davis");
    $team->setPlayer(2, "Russel Westbrook");
    $team->setPlayer(3, "THT");
    

    echo "=============="."<br/>";
    echo "Nama Tim: ".$team->getTeam_Name()."<br/>";
    echo "Asal Negara tim: ".$team->getCountry()."<br/>";
    echo "Tahun dibentuknya tim: ".$team->getYear()."<br/>";
    echo "Jumlah pemain tim: ".$team->getTotal_Player()."<br/>";
    echo "Nama-nama pemain: "."<br/>";
    for($i = 0; $i<$team->getTotal_Player(); $i++)
    {
        echo ($i+1).". ".$team->getPlayer($i)."<br/>";
    }

?>