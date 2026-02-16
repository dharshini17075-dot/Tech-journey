class contigous{
    public static void main(String[]args){
    int[]a={1,4,3,2,5,1,1,3};
    int k=5;
    int sum=0,l=0,len=0;
    for(int i=0;i<a.length;i++)
    {
        sum=0;
        for(int j=i;j<a.length;j++)
        {
            sum+=a[j];
            if(sum>=k)
            {
                if(sum==k)
                l=j-i+1;
            
            break;
            }
        
        if(l>len)
        len=l;
        }
        
    }
        System.out.println("largest"+len);
    }
}
            
        
    
    