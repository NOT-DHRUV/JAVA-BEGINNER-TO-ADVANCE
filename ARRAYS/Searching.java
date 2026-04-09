🔍 Searching in Arrays — “Find the Needle in the Haystack”

Imagine you lost your favorite pen ✏️ in a pile of 1000 books 📚
You could check each book one by one... or be smart about it!

👉 Searching = finding if an element exists in an array and where.

🧠 Why Searching?
Data retrieval 🔍
Problem solving 🧩
Interview questions 😅

🥇 1. Linear Search — “Check One by One Like a Detective”

👉 Start from beginning, check each element until found.

💻 Code
int[] arr = {5, 3, 8, 2, 1};
int target = 8;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index: " + i);
        break;
    }
}

💬 How it works
👉 Loop through array
👉 Compare with target
👉 Return index if found

⚡ Time Complexity
Worst: O(n) 🐌
Simple but slow for big arrays

🥈 2. Binary Search — “Divide and Conquer Like a Pro”

👉 Only works on SORTED arrays!
👉 Cut search space in half each time.

💻 Code (using Arrays.binarySearch)
import java.util.Arrays;

int[] arr = {1, 2, 3, 5, 8};
int target = 5;

int index = Arrays.binarySearch(arr, target);
if (index >= 0) {
    System.out.println("Found at index: " + index);
} else {
    System.out.println("Not found");
}

💬 How it works
👉 Compare with middle element
👉 If target smaller, search left half
👉 If target larger, search right half
👉 Repeat until found

⚡ Time Complexity
O(log n) ⚡
Super fast!

🆚 Linear vs Binary
Linear: Works on any array, slow
Binary: Needs sorted array, fast

🎯 Pro Tip: Always sort first if you need speed!