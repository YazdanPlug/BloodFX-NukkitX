package ir.yzplug.FB;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.level.particle.*;
import cn.nukkit.entity.Entity;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;

public class Blood extends PluginBase implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        Entity p = e.getEntity();
            p.getLevel().addParticle(new RedstoneParticle(p));
        }
}
