package ale;

public class Global {
    public static final String AUTHOR = "Asdru",
            NAMESPACE = "example",
            MCMETA = String.format("""
                    {
                        "pack": {
                            "pack_format":  52,
                            "description": "by %s"
                        }
                    }
                    """, AUTHOR);
}
