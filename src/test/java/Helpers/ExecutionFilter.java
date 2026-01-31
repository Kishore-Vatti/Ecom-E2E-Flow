package Helpers;

import java.util.Set;

public class ExecutionFilter {

    public static boolean shouldExecute(String td) {

        // 🔹 Guard 1: TD must be valid
        if (td == null || td.trim().isEmpty() || td.equals("-")) {
            return false; // skip invalid rows safely
        }

        // 🔹 Execute ALL
        if (Helpers.Config.executeAll) {
            return true;
        }

        // 🔹 Single TD (highest priority)
        if (Helpers.Config.selectedRowExecution != null) {
            return td.equals(
                    String.valueOf(Helpers.Config.selectedRowExecution));
        }

        // 🔹 Multiple TDs
        Set<String> selected = Helpers.Config.selectedRows;
        if (selected != null && !selected.isEmpty()) {
            return selected.contains(td);
        }

        // 🔹 Range TDs (e.g. 1-3)
        String range = Helpers.Config.startRowAndEndRow;
        if (range != null && range.contains("-")) {

            String[] parts = range.split("-");
            int start = Integer.parseInt(parts[0].trim());
            int end = Integer.parseInt(parts[1].trim());

            int current = Integer.parseInt(td.trim());
            return current >= start && current <= end;
        }

        return false;
    }
}
