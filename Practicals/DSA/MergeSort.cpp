#include <iostream>
using namespace std;
void Merge(int a[], int low, int mid, int high)
{
    int i, j, k;
    int temp[20];
    i = low;
    j = mid + 1;
    k = low;
    while (i <= mid && j <= high)
    {
        if (a[i] < a[j])
        {
            temp[k] = a[i];
            i++;
            k++;
        }
        else
        {
            temp[k] = a[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        temp[k] = a[i];
        i++;
        k++;
    }
    while (j <= high)
    {
        temp[k] = a[j];
        j++;
        k++;
    }
    for (k = low; k <= high; k++)
    {
        a[k] = temp[k];
    }
}
void mergeSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);
    }
}
int main()
{
    int n;
    cout << "Enter the Size of Array You want:";
    cin >> n;
    int arr[n];
    cout << "Enter the Elements for Array:";
    for (int i = 0; i < n; i++)
    {
        cout << "a[" << i << "]:";
        cin >> arr[i];
    }
    mergeSort(arr, 0, n - 1);
    cout << "Sorted Array:";
    for (int i = 0; i < n; i++)
    {
        cout << "\na[" << i << "]:" << arr[i];
    }
    return 0;
}