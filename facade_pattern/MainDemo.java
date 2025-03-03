package facade_pattern;

import facade_pattern.facade.HomeApplienceFacade;
import facade_pattern.home_applience.AC;
import facade_pattern.home_applience.Light;
import facade_pattern.home_applience.Music_System;

public class MainDemo {
    public static void main(String[] args) {
        Light light = new Light();
        AC ac = new AC();
        Music_System music_System = new Music_System();
        HomeApplienceFacade facade = new HomeApplienceFacade(light, ac, music_System);
        facade.turnOnAll();
        facade.turnOffAll();
    }
}
