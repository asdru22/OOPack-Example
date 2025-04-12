package ale;

import oopack.Namespace;
import oopack.resourcepack.Resourcepack;

public class ExampleResourcepack extends Resourcepack {
    public ExampleResourcepack(Namespace ns) {
        super(ns);
        this.setPackMCMeta(Global.MCMETA);
    }
}
