class bSort<T extends Comparable<T>>{
    int i=0;
    int j=0;
    void sort(T[] data){
        for(i=0;i<data.length;i++){
            for(j=i+1;j<data.length;j++){
            if(data[i].compareTo(data[j])>0){
            T temp=data[i];
            data[i]=data[j];
            data[j]=temp;
            }
            }
        }
        for(i=0;i<data.length;i++){
        System.out.println(data[i]);
        }
        System.err.println();
    }
}
public class BubbleSort_usingGenerics{
    public static void main(String[] args) {

        bSort<String> obj1=new bSort<String>();
        String[] arr1={"a","b","c","gfdgd","f"};
        obj1.sort(arr1);
    
        bSort<Integer> obj2=new bSort<Integer>();
        Integer[] arr2={5,4,3,2,1};
        obj2.sort(arr2);

        bSort<Double> obj3=new bSort<Double>();
        Double[] arr3={5.6,5.3,3.8,2.3,1.1};
        obj3.sort(arr3);
    }
}

