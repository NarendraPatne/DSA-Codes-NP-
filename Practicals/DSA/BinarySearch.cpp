#include <iostream>
using namespace std;
int BinarySearch(int a[5], int low, int high, int x)
{
    while (low <= high)
    {
        int mid = (low + high) / 2;
        if (a[mid] == x)
        {
            return mid;
        }
        else if (a[mid] > x)
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }
    return -1;
}
int main()
{
    int arr[5];
    cout << "Enter 5 Elements for Array:\n";
    for (int i = 0; i < 5; i++)
    {
        cout << "a[" << i << "]:";
        cin >> arr[i];
    }
    cout << "------------------------------------------\n";
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5 - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
        }
    }
    for (int i = 0; i < 5; i++)
    {
        cout << "a[" << i << "]:" << arr[i] << endl;
    }
    int x;
    cout << "Enter the Element to search:";
    cin >> x;
    int y = BinarySearch(arr, 0, 4, x);
    if (y == -1)
        cout << x << " is Not Present in the Given Array!!!";
    else
        cout << x << " is Present at Index:" << y;
    return 0;
}