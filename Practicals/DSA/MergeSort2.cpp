#include<iostream>
using namespace std;
void merge(int arr[],int low,int mid,int high)
{
    int i,j,k,temp[20];
    i=low;
    j=mid+1;
    k=low;
    while(i<=mid && j<=high)
    {
        if(arr[i]<arr[j])
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        else
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
    }
    while(i<=mid)
    {
        temp[k]=arr[i];
        i++;
        k++;
    }
    while(j<=high)
    {
        temp[j]=arr[j];
        j++;
        k++;
    }
    for(int i=low;i<=high;i++)
    {
        arr[i]=temp[i];
    }
}
void mergeSort(int arr[],int low,int high)
{
    if(low<high)
    {
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
int main()
{
    int arr[]={89,75,63,42,64,65,18};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"Array before Sorting::\n";
    for(int i=0;i<n;i++)
    {
        cout<<"arr["<<i<<"]="<<arr[i]<<endl;
    }
    mergeSort(arr,0,n-1);
    cout<<"Array after Sorting::\n";
    for(int i=0;i<n;i++)
    {
        cout<<"arr["<<i<<"]="<<arr[i]<<endl;
    }
    return 0;
}