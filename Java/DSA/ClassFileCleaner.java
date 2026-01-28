import java.io.File;

public class ClassFileCleaner {

    public static void main(String[] args) {
        // Replace this with the path to your parent folder
        String parentPath = "D:\\DSA Java";
        File parentDir = new File(parentPath);

        if (parentDir.exists() && parentDir.isDirectory()) {
            deleteClassFiles(parentDir);
            System.out.println("Cleanup complete!");
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void deleteClassFiles(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                // Recurse into subdirectory
                deleteClassFiles(file);
            } else if (file.isFile() && file.getName().endsWith(".class")) {
                boolean deleted = file.delete();
                if (deleted) {
                    System.out.println("Deleted: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to delete: " + file.getAbsolutePath());
                }
            }
        }
    }
}