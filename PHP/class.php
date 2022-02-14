<?php

    class Team
    {
        private $team_name;
        private $country;
        private $year;
        private $player = array();
        private $total_player;

        public function __construct()
        {
            
        }

        public function setTeam_Name($team_name)
        {
            $this->team_name = $team_name;
        }
        public function getTeam_Name()
        {
            return $this->team_name;
        }

        public function setCountry($country)
        {
            $this->country = $country;
        }
        public function getCountry()
        {
            return $this->country;
        }

        public function setYear($year)
        {
            $this->year = $year;
        }
        public function getYear()
        {
            return $this->year;
        }

        
        public function setTotal_Player($total_player)
        {
            $this->total_player = $total_player;
        }
        
        public function getTotal_Player()
        {
            return $this->total_player;
        }

        public function setPlayer($index, $player)
        {
            $this->player[$index] = $player;
        }
        public function getPlayer($index)
        {
            return $this->player[$index];
        }
        
        public function __destruct()
        {
            
        }
    }



?>