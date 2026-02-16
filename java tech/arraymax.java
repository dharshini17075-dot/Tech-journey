class arraymax {
    
    public static void main(String args[]){
        int []a={10,3,4,5,-9,6};
        int max=a[0];
        for(int i=1;i<a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
            
        System.out.println("maximum value is: "+max);
            
        }
    }

        

    

