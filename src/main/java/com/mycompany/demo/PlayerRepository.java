package com.mycompany.demo;

interface PlayerRepository {

    PlayerProtos.Player findById(int id);

    PlayerProtos.PlayerList findAll();
}
