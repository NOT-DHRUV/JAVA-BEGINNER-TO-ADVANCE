🛠️ Arrays Class — “The Swiss Army Knife for Arrays”

Java has a built-in Arrays class in java.util package
It's like a toolbox full of useful methods for arrays!

👉 No need to reinvent the wheel
👉 Ready-to-use methods
👉 Makes life easier 😎

📦 Import First
import java.util.Arrays;

🔍 1. Arrays.toString() — “Print Arrays Nicely”

Normal printing: [I@123456 (ugly!)
With toString: [1, 2, 3, 4, 5] (beautiful!)

💻 Code
int[] arr = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(arr));

🔄 2. Arrays.sort() — “Sort Arrays Instantly”

No need to write bubble sort!

💻 Code
int[] arr = {5, 2, 8, 1, 9};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [1, 2, 5, 8, 9]

⚡ 3. Arrays.binarySearch() — “Fast Searching”

We saw this in Searching.java

💻 Code
int[] arr = {1, 2, 5, 8, 9};
int index = Arrays.binarySearch(arr, 5); // Returns 2

📋 4. Arrays.copyOf() — “Copy Arrays Easily”

💻 Code
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, 5); // [1, 2, 3, 0, 0]

🔍 5. Arrays.equals() — “Compare Arrays”

💻 Code
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean equal = Arrays.equals(arr1, arr2); // true

🖼️ 6. Arrays.fill() — “Fill Arrays with Value”

💻 Code
int[] arr = new int[5];
Arrays.fill(arr, 42); // [42, 42, 42, 42, 42]

🔀 7. Arrays.asList() — “Convert to List”

Useful for collections!

💻 Code
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.asList(arr);

⚠️ Warning: Fixed-size list! Can't add/remove elements.

🎯 Pro Tip: Arrays class has methods for all primitive types (int[], double[], etc.) and objects!