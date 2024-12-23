#include<iostream>
using namespace std;
void SelectionSort(int arr[],int n)
{
 for(int i=0;i<n-1;i++)
 {
    int min=i;
    for(int j=i+1;j<n;j++) 
    {
        if(arr[j]<arr[min])
        {
            min=j;
        }
    }
    int t=arr[i];
    arr[i]=arr[min];
    arr[min]=t;
 }
 cout<<"Sorted Array Using Selection Sort:\n";
 for(int i=0;i<n;i++)
 {
    cout<<arr[i]<<endl;
 }
}
int main()
{
    int n;
    cout<<"Enter the Size of Array:";
    cin>>n;
    cout<<"Enter "<<n<<" Elements:\n";
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cout<<"a["<<i<<"]:";
        cin>>arr[i];
    }
    SelectionSort(arr,n);
    return 0;
}