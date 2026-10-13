// Aisha Kabir
// ITDEV-110

package gradeaverage;

// package kabir_midterm;

public class Average {
    private int sum=0;
    private int counter=0;
    private int nextNum=0;
    private int average=0;

    public void setSum(int s){
        sum=s;
    }

    public int getSum(){
        return(sum);
    }

    public void setCounter(int c){
        counter = c;
    }

    public int getCounter(){
        return(counter);
    }

    public void setNextNum(int n){
        nextNum = n;
    }
    public int getNextNum(){
        return(nextNum);
    }

    public void setAverage(int a){
        average = a;
    }
    public int getAverage(){
        return(average);
    }

    public void calc(){
           sum=sum+nextNum;
           counter++;
           average=sum/counter;
    }
}
