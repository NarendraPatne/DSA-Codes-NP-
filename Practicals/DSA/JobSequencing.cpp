#include<iostream>
#include<algorithm>
using namespace std;
struct Job{
char id;
int deadline;
int profit;
};
bool comparison(Job a, Job b)
{
    return (a.profit>b.profit);
}
void printJobSeq(Job arr[],int n)
{
    sort(arr,arr+n,comparison);
    int result[n];
    bool slot[n];

    for(int i=0;i<n;i++)
    {
        slot[i]=false;
    }

    for(int i=0;i<n;i++)
    {
        for(int j=min(n,arr[i].deadline)-1;j>=0;j--)
        {
            if(slot[j]==false)
            {
                slot[j]=true;
                result[j]=i;
                break;
            }
        }
    }
    cout<<"Slot\tJob"<<endl<<"-----------\n";
    for(int i=0;i<n;i++)
    {
        if(slot[i]==true)
       cout<<i<<"-"<<i+1<<"\t "<<arr[result[i]].id<<endl; 
    }
}
int main()
{
Job arr[] = { { 'a', 2, 100 },
                { 'b', 1, 19 },
                { 'c', 2, 27 },
                { 'd', 1, 25 },
                { 'e', 3, 15 } };
int n=sizeof(arr)/sizeof(arr[0]);
printJobSeq(arr,n);
return 0;
}