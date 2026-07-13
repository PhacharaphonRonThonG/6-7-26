package statistic;
import java.util.Scanner;
public class StatCalculation {
    float x[] = new float[50];
    int num;
    void inputData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many do number of Array? : ");
        int number = input.nextInt();
        
        for(int i = 0; i < number; i++){
            System.out.println("Enter Value"+ (i + 1)+": ");
            x[i] = input.nextFloat();
        }
        num = number;
    }
     float[] sortData(){
        float clone[]=new float[50];
        clone = x.clone();
        float temp;
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(clone[i]>clone[j]){
                    temp = clone[i];
                clone[i] = clone[j];
                clone[j] = temp;
                }
            }
        }
        return clone;
    }
    float aveage(){
        float sum = 0;
        for (int i = 0;i < num; i++){
                sum = sum + x[i];
        }
        return sum / num;
    }
    void showdata(){
    System.out.println("Original Data");
    for (int i = 0;i < num;i++)
    System.out.println("  "+x[i]);
    }
    public float median(){
    float y[] = new float[50];
    float med;
    y=sortData();
    if (num % 2 == 1)
        med = y[num / 2];
    else
        med = (y[(num / 2)-1]+y[num / 2])/ 2.0f;
    return med;
    }
}