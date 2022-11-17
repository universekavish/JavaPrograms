// package basicPrograms;

// public class JavaEnumExample{
//     String Day = day;

//     public void EnumTest(Day day){
//         this.day = day;
//     }

//     public void tellTheTruth(){
//         switch(day){
//             case MONDAY:
//                 System.out.println("Mondays are bad!!");
//                 break;
//             case FRIDAY:
//                 System.out.println("Fridays are better!!");
//                 break;
//             case SATURDAY: case SUNDAY:
//                 System.our.prinln("Sleeping and Eating");
//                 break;
//             default:
//                 System.out.println("Surviving in weekdays....");
//                 break;
//         }
//     }

//     public void main(String[] args){
//         EnumTest firstDay = new EnumTest(day.MONDAY);
//         firstDay.tellTheTruth();
//         EnumTest thirdDay = new EnumTest(day.WEDNESDAY);
//         thirdDay.tellTheTruth();
//         EnumTest fifthDay = new EnumTest(day.FRIDAY);
//         fifthDay.tellTheTruth();
//         EnumTest sixthDay = new EnumTest(day.SATURDAY);
//         fifthDay.tellTheTruth();
//         EnumTest seventhDay = new EnumTest(day.SUNDAY);
//         seventhDay.tellTheTruth();
//     }
// }


public class EnumTest {
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}