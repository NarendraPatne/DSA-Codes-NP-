#include<iostream>
using namespace std;
void InsertionSort(int array[],int n)
{
    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = key;
    }
    cout<<"Sorted Array Using Insertion Sort:\n";
 for(int i=0;i<n;i++)
 {
    cout<<array[i]<<endl;
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
    InsertionSort(arr,n);
    return 0;
}