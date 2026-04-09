📜 ArrayList vs Arrays — “Dynamic vs Static”

Arrays are like a fixed-size box 📦
Once created, size can't change!

ArrayList is like an expandable bag 🎒
Can grow and shrink as needed!

🧠 Arrays vs ArrayList

| Feature | Arrays | ArrayList |
|---------|--------|-----------|
| Size | Fixed | Dynamic |
| Type | Primitive/Object | Only Objects |
| Methods | Few | Many |
| Performance | Faster | Slower |
| Memory | Less | More |

🏗️ Creating ArrayList

import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();

// Or with initial capacity
ArrayList<Integer> numbers = new ArrayList<>(10);

➕ Adding Elements
list.add("Apple");
list.add("Banana");
list.add(1, "Orange"); // Insert at index 1

➖ Removing Elements
list.remove("Banana");
list.remove(0); // Remove by index

🔍 Accessing Elements
String fruit = list.get(0); // Get first element

🔄 Iterating
for (String item : list) {
    System.out.println(item);
}

📏 Size
int size = list.size();

🔍 Searching
boolean hasApple = list.contains("Apple");
int index = list.indexOf("Apple");

🧹 Clearing
list.clear(); // Remove all elements

💡 When to Use Arrays?
- Fixed size data
- Performance critical
- Primitive types
- Simple operations

💡 When to Use ArrayList?
- Dynamic size
- Lots of insertions/deletions
- Need utility methods
- Working with objects

🎯 Pro Tip: ArrayList internally uses arrays! It just handles resizing automatically.