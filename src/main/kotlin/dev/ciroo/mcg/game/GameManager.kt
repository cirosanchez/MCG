package dev.ciroo.mcg.game

import dev.ciroo.mcg.MCG
import dev.ciroo.mcg.piece.Piece
import dev.ciroo.mcg.player.MCGPlayer

class GameManager {
    val players: MutableList<MCGPlayer> = mutableListOf()
    val availablePieces: MutableList<Piece> = mutableListOf()
    lateinit var next: MCGPlayer
}