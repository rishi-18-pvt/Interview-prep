//https://www.hackerrank.com/challenges/counting-valleys/problem
public static int CountingValley(int steps, String path){
    int height = 0;
    int count = 0;
    for(int i =0;i<Steps;i++){
        if(Path.CharAt(i)==0){
            height++;
            if(height==0){
                count++;
            }
            else{
                height--;
            }
        }
        return count;
    }
}