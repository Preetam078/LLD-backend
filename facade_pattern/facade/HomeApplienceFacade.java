package facade_pattern.facade;

import facade_pattern.home_applience.AC;
import facade_pattern.home_applience.Light;
import facade_pattern.home_applience.Music_System;

public class HomeApplienceFacade {
    private Light light;
    private AC ac;
    private Music_System music_System;

    public HomeApplienceFacade(Light light, AC ac, Music_System music_System) {
        this.light = light;
        this.ac = ac;
        this.music_System = music_System;

    }

    public void turnOnAll() {
        this.light.turnOn();
        ac.turnOn();
        music_System.playMusic();
    }

    public void turnOffAll() {
        this.light.turnOff();
        ac.turnOff();
        music_System.stopMusic();
    }

    public void playMusic() {
        music_System.playMusic();
    }
    public void stopMusic() {
        music_System.stopMusic();
    }

    public void turnOnLight() {
        this.light.turnOn();
    }
    public void turnOffLight() {
        this.light.turnOff();
    }

    public void turnOnAC() {
        ac.turnOn();
    }
    public void turnOffAC() {
        ac.turnOff();
    }
}
