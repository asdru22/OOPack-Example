package ale;

import oopack.Project;

public class Example extends Project {
    public Example() {
        super("example", "latest",
                "C:\\Users\\Ale\\AppData\\Roaming\\.minecraft", "OOPack test world");

        this.addPath("C:\\Users\\Ale\\Documents\\java projects\\oopack example\\out");
        ExampleNamespace ns = new ExampleNamespace();
        this.setDatapack(new ExampleDatapack(ns));
        this.setResourcepack(new ExampleResourcepack(ns));

    }
}
