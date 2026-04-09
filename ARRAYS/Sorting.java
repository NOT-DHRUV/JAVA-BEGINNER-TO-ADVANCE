🔃 Sorting in Java — “From Messy Room to Clean Setup”

Imagine your room 😅
Clothes everywhere… books scattered…

Sorting = putting everything in the right order

👉 In Java, sorting means arranging data:

Ascending ⬆️ (small → big)
Descending ⬇️ (big → small)
🧠 Why Sorting?
Faster searching 🔍
Better data organization 📊
Required in interviews 😭
🥇 1. Bubble Sort — “Compare Neighbors Like Gossip”
6

👉 Biggest element “bubbles up” to the end

💻 Code
int[] arr = {5, 3, 8, 2, 1};

for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // swap
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
💬 How it works

👉 Compare neighbors
👉 Swap if wrong order
👉 Repeat until sorted

⚡ Time Complexity
Worst: O(n²) 😬
Slow for big data
🥈 2. Selection Sort — “Pick the Best One”
6

👉 Find smallest → put it at correct position

💻 Code
int[] arr = {5, 3, 8, 2, 1};

for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;

    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    // swap
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}
💬 Idea

👉 Find minimum
👉 Swap once per loop

⚡ Time Complexity
Always O(n²)
🥉 3. Insertion Sort — “Sorting Cards in Hand”
6

👉 Like arranging cards while playing 🃏

💻 Code
int[] arr = {5, 3, 8, 2, 1};

for (int i = 1; i < arr.length; i++) {
    int key = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }

    arr[j + 1] = key;
}
💬 Idea

👉 Take one element
👉 Insert it in correct place

⚡ Time Complexity
Best: O(n) 😎
Worst: O(n²)
🚀 4. Built-in Sorting (Java Cheat Code 😏)

👉 Java already gives you sorting

import java.util.Arrays;

int[] arr = {5, 3, 8, 2, 1};

Arrays.sort(arr);
💬 Why use this?

👉 Fast (uses advanced algorithms like Dual-Pivot QuickSort)
👉 Clean code
👉 Industry standard

🎯 Mini Challenge
// Sort array in descending order
int[] arr = {4, 1, 7, 3, 9};

// Try yourself 👇
💥 Fun Summary
Algorithm	Speed	Idea
Bubble Sort	Slow 🐢	Swap neighbors
Selection Sort	Slow 🐢	Pick smallest
Insertion Sort	Medium ⚡	Insert at correct place
Arrays.sort()	Fast 🚀	Built-in magic