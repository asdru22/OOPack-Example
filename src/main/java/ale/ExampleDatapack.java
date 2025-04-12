package ale;

import oopack.Namespace;
import oopack.datapack.Datapack;

public class ExampleDatapack extends Datapack {
    public ExampleDatapack(Namespace ns) {
        super(ns);
        this.setPackMCMeta(Global.MCMETA);
    }
}
