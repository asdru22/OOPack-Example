package ale;

import oopack.datapack.Datapack;

public class ExampleDatapack extends Datapack {
    public ExampleDatapack() {
        super(new ExampleNamespace());
        this.setPackMCMeta(String.format("""
                {
                    "pack": {
                        "pack_format":  52,
                        "description": "by %s"
                    }
                }
                """, Global.AUTHOR));

    }
}
