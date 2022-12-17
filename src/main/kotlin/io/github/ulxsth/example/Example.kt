package io.github.ulxsth.example

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener

class Example : JavaPlugin(), Listener {
    override fun onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this)
    }
}