package frb.astrostar.server;

import frb.astrostar.server.util.Logger;

public abstract class ConfigPackageEntry {

    protected static final Logger LOGGER = new Logger("ConfigPackageEntry");

    public ConfigPackageEntry() {
    }

    public abstract boolean isAllowed();

    public abstract boolean isDenied();
}
