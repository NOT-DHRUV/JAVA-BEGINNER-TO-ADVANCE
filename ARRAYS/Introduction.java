📦 Arrays in Java — “The Locker Room of Data”

Imagine you have 5 cricket balls 🏏
Instead of holding them randomly, you put them in numbered lockers:

Locker 0 → Ball 1  
Locker 1 → Ball 2  
Locker 2 → Ball 3  
...

That’s exactly what an array is in Java.

👉 An array is a container that stores multiple values of the same type in a single variable.

🧠 Why Arrays?

Without arrays:

int a = 10;
int b = 20;
int c = 30;

With arrays:

int[] numbers = {10, 20, 30};

✨ Cleaner. Smarter. Less headache.

🏗️ How to Create an Array
1️⃣ Declare + Allocate Memory
int[] arr = new int[5];

👉 This creates 5 lockers (index 0 → 4)

2️⃣ Declare + Initialize
int[] arr = {1, 2, 3, 4, 5};

👉 Java automatically counts size here

🔢 Index System (Important!)

Arrays start from 0 (yes, not 1 😭)

int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[1]); // 20
System.out.println(arr[2]); // 30
🔁 Looping Through an Array
🌀 Using for loop
int[] arr = {10, 20, 30, 40};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
⚡ Using for-each loop (cleaner)
for (int num : arr) {
    System.out.println(num);
}

👉 “For each number in arr, print it”

🛠️ Updating Values
arr[1] = 99;

👉 Now second element becomes 99

❌ Common Mistake
System.out.println(arr[5]); // ❌ Error!

👉 This throws:

ArrayIndexOutOfBoundsException

Because index doesn’t exist 🚫

🎯 Real-Life Example

Marks of students:

int[] marks = {85, 90, 78, 92};

for (int mark : marks) {
    if (mark > 80) {
        System.out.println("Great job!");
    }
}
🧩 Mini Challenge (for your repo)
// Find the largest number in an array
int[] arr = {5, 2, 9, 1, 7};

// Your code here 👇
💬 Fun Summary

👉 Array = fixed-size list of same-type elements
👉 Index starts from 0
👉 Super useful for storing multiple values