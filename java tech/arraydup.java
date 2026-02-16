class arraydup{
    public static void main(String[]args){
        int []a={1,4,2,5,2,4,1};
        boolean[]v=new boolean[a.length];
        int count1=0;
        int count2=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(v[i]==true){
            continue;
        }
        
                        count1=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                
                {
                    
                    count1+=1;
                    v[j]=true;
                }
            }
        
            if(count1>=2)
                count1=1;
                count2=count1+count2;
        }
            System.out.println(count2);
        
            
}
}
