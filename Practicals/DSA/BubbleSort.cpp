#include <iostream>
using namespace std;
void BubbleSort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
        }
    }
    cout << "Sorted Array:\n";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << endl;
    }
}
int main()
{
    int n;
    cout << "Enter the Size of Array:";
    cin >> n;
    int arr[n];
    cout << "Enter any " << n << " Integer Elements:\n";
    for (int i = 0; i < n; i++)
    {
        cout << "arr[" << i << "]:";
        cin >> arr[i];
    }
    BubbleSort(arr, n);
    return 0;
}