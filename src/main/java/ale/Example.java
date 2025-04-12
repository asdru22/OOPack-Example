package ale;

import oopack.Project;

public class Example extends Project {
    public Example() {
        super("example", "latest",
                "C:\\Users\\Ale\\AppData\\Roaming\\.minecraft", "OOPack test world");

        this.setDatapack(new ExampleDatapack());
    }
}
