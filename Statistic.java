package statistic;

public class Statistic {

    public static void main(String[] args) {
        float y[] = new float[50];
        StatCalculation stat1 = new StatCalculation();
        stat1.inputData();
        y = stat1.sortData();
        stat1.showdata();
        /*
        System.out.println("Original value: ");
        for(int i=0;i<stat1.num;i++)
            System.out.print(stat1.x[i]+"  ");
        */
        System.out.println("\nSorting value: ");
        for(int i=0;i<stat1.num;i++)
            System.out.print("  "+y[i]);
        System.out.println("\nAverage is "+stat1.aveage());
        System.out.println("Median is "+stat1.median());
        stat1.showdata();
    }
    
}