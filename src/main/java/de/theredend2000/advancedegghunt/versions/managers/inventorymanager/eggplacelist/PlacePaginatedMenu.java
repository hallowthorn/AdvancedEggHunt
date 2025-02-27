package de.theredend2000.advancedegghunt.versions.managers.inventorymanager.eggplacelist;

import de.theredend2000.advancedegghunt.Main;
import de.theredend2000.advancedegghunt.util.ItemBuilder;
import de.theredend2000.advancedegghunt.versions.managers.inventorymanager.eggfoundrewardmenu.RewardMenu;
import de.theredend2000.advancedegghunt.versions.managers.inventorymanager.paginatedMenu.PlayerMenuUtility;
import org.bukkit.Material;

public abstract class PlacePaginatedMenu extends PlaceMenu {

    protected int page = 0;
    protected int maxItemsPerPage = 28;
    protected int index = 0;

    public PlacePaginatedMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }
    public void addMenuBorder(){
        inventory.setItem(48, new ItemBuilder(Material.PLAYER_HEAD).setSkullOwner(Main.getTexture("ZDU5YmUxNTU3MjAxYzdmZjFhMGIzNjk2ZDE5ZWFiNDEwNDg4MGQ2YTljZGI0ZDVmYTIxYjZkYWE5ZGIyZDEifX19")).setDisplayname("§2Left").build());

        inventory.setItem(50, new ItemBuilder(Material.PLAYER_HEAD).setSkullOwner(Main.getTexture("NDJiMGMwN2ZhMGU4OTIzN2Q2NzllMTMxMTZiNWFhNzVhZWJiMzRlOWM5NjhjNmJhZGIyNTFlMTI3YmRkNWIxIn19fQ==")).setDisplayname("§2Right").build());

        inventory.setItem(49, makeItem(Material.BARRIER, "§4Close"));
        inventory.setItem(53, makeItem(Material.EMERALD_BLOCK, "§aRefresh"));
        inventory.setItem(45, new ItemBuilder(Material.PLAYER_HEAD).setSkullOwner(Main.getTexture("MTY0MzlkMmUzMDZiMjI1NTE2YWE5YTZkMDA3YTdlNzVlZGQyZDUwMTVkMTEzYjQyZjQ0YmU2MmE1MTdlNTc0ZiJ9fX0=")).setDisplayname("§9Information").setLore("§7If you do not know how you can add your","§7own egg textures. Click here","§7to get to the discord channel","§7where you can see how it will work.","","§aYou can find the post under:","§a§lfaq -> How to add Custom egg textures in the AdvancedEggHunt plugin§a","","§9Click any block in your inventory","§9to add it into the list.","","§eClick to get the discord link.").build());

        for (int i = 0; i < 10; i++) {
            if (inventory.getItem(i) == null) {
                inventory.setItem(i, super.FILLER_GLASS);
            }
        }

        inventory.setItem(17, super.FILLER_GLASS);
        inventory.setItem(18, super.FILLER_GLASS);
        inventory.setItem(26, super.FILLER_GLASS);
        inventory.setItem(27, super.FILLER_GLASS);
        inventory.setItem(35, super.FILLER_GLASS);
        inventory.setItem(36, super.FILLER_GLASS);

        for (int i = 44; i < 53; i++) {
            if (inventory.getItem(i) == null) {
                inventory.setItem(i, super.FILLER_GLASS);
            }
        }
    }

    public int getMaxItemsPerPage() {
        return maxItemsPerPage;
    }
}

