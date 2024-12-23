#include<iostream>
using namespace std;
int main()
{
    int x,flag=0;
    int arr[5];
    cout<<"Enter 5 Integers for Array:\n";
    for(int i=0;i<5;i++)
    {
        cout<<"a["<<i<<"]=";
        cin>>arr[i];
    }
    cout<<"Enter the Element to Search:";
    cin>>x;
    for(int i=0;i<5;i++)
    {
        if(arr[i]==x)
        {
            cout<<x<<" is Present in Array at Index: "<<i;
            flag=1;
        }
    }
    if(flag==0)
    {
        cout<<x<<" is not Present in the Array!!!";
    }
}