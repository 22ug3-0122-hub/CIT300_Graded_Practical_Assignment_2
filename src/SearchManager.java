import java.util.Arrays;
public class SearchManager {
    public SearchResult linearSearch(int[] data,int target){long s=0,t=System.nanoTime();for(int i=0;i<data.length;i++){s++;if(data[i]==target)return new SearchResult(true,i,s,System.nanoTime()-t);}return new SearchResult(false,-1,s,System.nanoTime()-t);}
    public SearchResult binarySearch(int[] data,int target){int[] a=Arrays.copyOf(data,data.length);Arrays.sort(a);long s=0,t=System.nanoTime();int low=0,high=a.length-1;while(low<=high){s++;int m=low+(high-low)/2;if(a[m]==target)return new SearchResult(true,m,s,System.nanoTime()-t);if(a[m]<target)low=m+1;else high=m-1;}return new SearchResult(false,-1,s,System.nanoTime()-t);}
    public SearchComparison compareSearches(int[] data,int target){return new SearchComparison(linearSearch(data,target),binarySearch(data,target));}
}
