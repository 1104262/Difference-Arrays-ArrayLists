// Arrays
String[] studentsArray = new String[5]; // Fixed size array of 5 strings
studentsArray[0] = "Alice"; // Accessing by index
studentsArray[studentsArray.length - 1] = "Bob"; // Last element

// ArrayLists
ArrayList<String> studentsList = new ArrayList<>(); // Dynamic list of strings
studentsList.add("Charlie"); // Adding elements
studentsList.remove(1); // Removing by index
studentsList.size(); // Getting current size

// Performance Comparison
long startTimeArray = System.nanoTime();
for (int i = 0; i < 100000; i++) {
  studentsArray[i % studentsArray.length] = "Dummy"; // Accessing with modulo to simulate growth
}
long endTimeArray = System.nanoTime();

long startTimeList = System.nanoTime();
for (int i = 0; i < 100000; i++) {
  studentsList.add("Dummy"); // Adding elements to simulate growth
}
long endTimeList = System.nanoTime();

System.out.println("Array access time: " + (endTimeArray - startTimeArray) + " nanoseconds");
System.out.println("ArrayList add time: " + (endTimeList - startTimeList) + " nanoseconds");
