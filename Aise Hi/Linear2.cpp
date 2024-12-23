#include<iostream>
using namespace std;
int main()
{
    int arr[]={10,20,30,40,50,60};
    int x,flag=-1;
    cout<<"Enter the number you want to search::";
    cin>>x;
    for(int i=0;i<6;i++)
    {
        if(arr[i]==x)
        {
            flag=i;
        }
    }
    if(flag==-1)
    {
        cout<<x<<" is not present in the array!";
    }
    else
    {
        cout<<x<<" is present at index "<<flag;
    }
    return 0;
}