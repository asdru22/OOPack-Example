package ale;

import oopack.Namespace;
import oopack.datapack.Data;
import oopack.datapack.DataEntries;

public class ExampleNamespace extends Namespace {
    public ExampleNamespace() {
        super(Global.NAMESPACE);
        Data mainData = this.getData();
        mainData.add(DataEntries.FUNCTION, "test", "say hi");
    }
}
