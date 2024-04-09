package dev.ciroo.mcg

import dev.ciroo.mcg.configuration.ConfigurationProvider
import dev.ciroo.mcg.game.GameManager
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler


class MCG : JavaPlugin() {


    companion object{
        val mm = MiniMessage.miniMessage()

        fun get(){
            getPlugin(MCG::class.java)
        }
    }

    lateinit var configurationProvider: ConfigurationProvider
    lateinit var commandHandler: BukkitCommandHandler
    lateinit var gameManager: GameManager

    override fun onEnable() {
        this.logger.info("Plugin activated!")


        // Configuration
        configurationProvider = ConfigurationProvider(this)


        gameManager = GameManager()

        // Commands
        commandHandler = BukkitCommandHandler.create(this)
    }
}