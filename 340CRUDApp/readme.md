I setup my project to be fairly simple, to set it up you should only need to add your DB information to the DatabaseConnection.java class. To setup the table you can use the following SQL statement:

CREATE TABLE Students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    grade DECIMAL(5, 2) NOT NULL
);


Once the DB connection is established you a run the main method and interact with the console to read/display students, update students, add students, and delete students.

Below is a copy of my run with the console:

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 4
1 Alice 95.0
2 Bob 90.5
4 Dave 100.0
5 Evan 78.0

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 1
Enter student name: Faith
Enter student grade: 98
Student added successfully.

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 4
1 Alice 95.0
2 Bob 90.5
4 Dave 100.0
5 Evan 78.0
6 Faith 98.0

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 2
Enter student ID to update: 5
Enter updated student name: Evan S.
Enter updated student grade: 97
Student updated successfully.

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 4
1 Alice 95.0
2 Bob 90.5
4 Dave 100.0
5 Evan S. 97.0
6 Faith 98.0

1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice: 