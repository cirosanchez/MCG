package dev.ciroo.mcg.player

import dev.ciroo.mcg.piece.Piece
import org.bukkit.entity.Player

class MCGPlayer(val name: String, val isAi: Boolean, val pieces: MutableList<Piece>, val playerObject: Player?) {

    fun turn() {
        if (this.isAi){

        }
    }
}