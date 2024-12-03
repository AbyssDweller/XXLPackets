package tfar.xlpackets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class XLPackets {
    public static final String MOD_ID = "xlpackets";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
}