#include<iostream>
using namespace std;
int a[100];
int partition(int low ,int high)
{
    int pivot = a[low];
    int i = low;
    int j = high;
    while(i<=j)
    {
    while(a[i]<=pivot)
    {
        i++;
    }

    while(a[j] > pivot)
    {
        j--;
    }
    if(i<j)
    {
        // swap(ar,i,j);
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    }
    // swap(ar,low,j);
    int t = a[low];
    a[low] = a[j];
    a[j] = t;
    return j;
}
void QuickSort(int low, int high)
{
    int p;
    if(low < high)
    {
        p = partition(low,high);
        QuickSort(low,p-1);
        QuickSort(p+1,high); 
    }
}
int main()
{
    int i,j,k,n;
    cout<<"Enter the number of elemetns:";
    cin>>n;
    cout<<"Enter the elemets of array:";
    for( i=0;i< n; i++)
    {
        cin>>a[i];
    }
    cout<<"Before Sorting array is :";
    for(i=0; i<n;i++)
    {
        cout<<a[i]<<endl;
    }
    QuickSort(0,n-1);
    cout<<"Sorted array is:";
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}