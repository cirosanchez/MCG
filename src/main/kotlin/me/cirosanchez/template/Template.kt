package me.cirosanchez.template

import me.cirosanchez.blaze.configuration.ConfigurationProvider
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler


// TODO: rename class and parent package.
class Template : JavaPlugin() {


    companion object{
        val mm = MiniMessage.miniMessage()
    }

    lateinit var configurationProvider: ConfigurationProvider
    lateinit var commandHandler: BukkitCommandHandler

    override fun onEnable() {
        this.logger.info("Plugin activated!")


        // Configuration
        configurationProvider = ConfigurationProvider(this)



        // Commands
        commandHandler = BukkitCommandHandler.create(this)
    }
}