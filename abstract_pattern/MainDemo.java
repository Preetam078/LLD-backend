package abstract_pattern;

import abstract_pattern.app.Application;
import abstract_pattern.factories.GUIFactory;
import abstract_pattern.factories.MacOSFactory;
import abstract_pattern.factories.WindowOSFactory;

public class MainDemo {
    private static Application applicationConfigure() {
        Application app;
        GUIFactory factory;
        
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowOSFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = applicationConfigure();
        app.paint();
    }
}
