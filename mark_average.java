public class mark_average {

        public static void main(String[] args){
            System.out.println("a program to calculate marks average");

            int[] marks = {70,80,65,90,85};

                int sum = 0;

                for (int i = 0;i < marks.length; i++){

                    sum = sum + marks[i];

                }
                double average = sum/marks.length;
                System.out.println("Average is:"+average);

                

        }


}