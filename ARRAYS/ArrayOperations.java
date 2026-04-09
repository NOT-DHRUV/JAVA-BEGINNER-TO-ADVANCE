⚙️ Array Operations — “Surgery on Arrays”

Arrays are fixed size once created 😅
But we can still do operations like:

👉 Insert elements
👉 Delete elements
👉 Update elements
👉 Copy arrays

🧠 Why Operations?
Dynamic data management 📊
Real-world applications 💼
Interview prep 📝

➕ 1. Insert Element — “Make Space and Add”

Since arrays are fixed, we need to:
1. Create new array (size + 1)
2. Copy elements
3. Insert new element
4. Copy remaining elements

💻 Code
public static int[] insertElement(int[] arr, int element, int position) {
    int[] newArr = new int[arr.length + 1];

    // Copy elements before position
    for (int i = 0; i < position; i++) {
        newArr[i] = arr[i];
    }

    // Insert new element
    newArr[position] = element;

    // Copy remaining elements
    for (int i = position; i < arr.length; i++) {
        newArr[i + 1] = arr[i];
    }

    return newArr;
}

💬 Example
int[] arr = {1, 2, 4, 5};
arr = insertElement(arr, 3, 2); // Insert 3 at index 2
// Result: {1, 2, 3, 4, 5}

➖ 2. Delete Element — “Remove and Shift”

1. Create new array (size - 1)
2. Copy elements except the one to delete
3. Shift remaining elements left

💻 Code
public static int[] deleteElement(int[] arr, int position) {
    int[] newArr = new int[arr.length - 1];

    // Copy elements before position
    for (int i = 0; i < position; i++) {
        newArr[i] = arr[i];
    }

    // Copy elements after position
    for (int i = position + 1; i < arr.length; i++) {
        newArr[i - 1] = arr[i];
    }

    return newArr;
}

💬 Example
int[] arr = {1, 2, 3, 4, 5};
arr = deleteElement(arr, 2); // Delete element at index 2
// Result: {1, 2, 4, 5}

🔄 3. Update Element — “Change Value”

Simplest operation!

💻 Code
int[] arr = {1, 2, 3, 4, 5};
arr[2] = 99; // Update index 2
// Result: {1, 2, 99, 4, 5}

📋 4. Copy Array — “Duplicate Arrays”

Using System.arraycopy or Arrays.copyOf

💻 Code
int[] original = {1, 2, 3, 4, 5};

// Method 1: Arrays.copyOf
int[] copy1 = Arrays.copyOf(original, original.length);

// Method 2: System.arraycopy
int[] copy2 = new int[original.length];
System.arraycopy(original, 0, copy2, 0, original.length);

⚠️ Warning: Shallow Copy Issues
For objects, be careful! Changes to copy might affect original.

🎯 Pro Tip: For dynamic operations, consider ArrayList instead of arrays!