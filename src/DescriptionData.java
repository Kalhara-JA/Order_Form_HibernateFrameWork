import javax.persistence.Embeddable;

@Embeddable
public class DescriptionData {
    private String partOne;
    private String partTwo;

     public DescriptionData() {
     }

     public DescriptionData(String partOne, String partTwo) {
         this.partOne = partOne;
         this.partTwo = partTwo;
     }

     public String getPartOne() {
         return partOne;
     }

     public void setPartOne(String partOne) {
         this.partOne = partOne;
     }

     public String getPartTwo() {
         return partTwo;
     }

     public void setPartTwo(String partTwo) {
         this.partTwo = partTwo;
     }
 }
