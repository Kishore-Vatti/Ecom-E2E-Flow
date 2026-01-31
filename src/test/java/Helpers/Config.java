package Helpers;

import java.util.Set;

public class Config {
	// 🔹 Execute only ONE TD; keep null
    public static Integer selectedRowExecution = 1 ;   // ex: 4

    // 🔹 Execute TD range; keep null
    public static String startRowAndEndRow = null;       // ex: "12-15"

    // 🔹 Execute multiple specific TDs; keep null
    public static Set<String> selectedRows = Set.of("7","9","12");;    // ex: Set.of("7","9","12");

    // 🔹 Master switch; keep false
    public static boolean executeAll = false;
}
