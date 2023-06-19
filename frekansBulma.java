package Kodluyoruz;

public class frekansBulma {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,4,3,5,6,7,4,8,9,3,3,4,4,1};


        for(int j = 0 ; j < list.length ; j++){
            int count = 0;
            boolean isCount = false;

            for (int k = j-1 ; k >= 0 ; --k){
                if(list[k]==list[j]){
                    isCount = true;
                    break;
                }
            }

            if(!isCount){
                for(int i = 0 ; i < list.length ; i++){
                    if (list[j] == list[i]) count++;
                }
            }


            if(count >= 2)System.out.println("Liste Tekrar : "+list[j]+" :"+count);
        }


    }
}
