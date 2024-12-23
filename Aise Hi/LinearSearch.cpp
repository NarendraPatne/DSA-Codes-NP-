#include<iostream>
using namespace std;
int linearSearch(int arr[],int x)
{
    // int flag=-1;
    for(int i=0;i<6;i++)
    {
        if(x==arr[i])
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    int arr[]={10,20,60,80,50,70};
    int x;
    cout<<"Enter the Element which you want to Search:";
    cin>>x;
    int i=linearSearch(arr,x);
    if(i==-1)
    {
        cout<<x<<" is not available in the array!!";
    }
    else{
        cout<<x<<" is present at index "<<i;
    }
    return 0;
}