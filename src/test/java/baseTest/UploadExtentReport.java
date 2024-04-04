package baseTest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadExtentReport {
    
	
	public static void UploadReport() {
        // Path to the Extent report file
        String reportFilePath =  System.getProperty("user.dir")+"\\ExtentReport\\SparkReport 02-Apr-2024 19-17-39\\Report\\Spark.html";

        // Path to the destination folder in the shared drive
        String destinationFolderPath = "C:\\Users\\Admin\\Desktop\\SeleniumReport";

        try {
            // Create Path objects for the report file and the destination folder
            Path reportPath = Paths.get(reportFilePath);
            Path destinationFolder = Paths.get(destinationFolderPath);

            // Copy the report file to the destination folder
            Files.copy(reportPath, destinationFolder.resolve(reportPath.getFileName()));

            System.out.println("Extent report uploaded successfully.");
        } catch (IOException e) {
            System.out.println("Error uploading Extent report: " + e.getMessage());
        }
    }
}
