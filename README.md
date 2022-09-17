# Array Practice
Rainfall Array:
Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles. The program should have methods that return the following:
⦁	total rainfall for the year
⦁	the average monthly rainfall
⦁	the month with the most rain
⦁	the month with the least rain

Demonstrate the class in a complete program. Do not forget input validation: Do not accept negative numbers for monthly rainfall figures.


Driver’s License Exam
The local driver’s license office has asked you to write a program that grades the written portion of the driver’s license exam. The exam has 20 multiple choice questions. A student must correctly answer 15 of the 20 questions to pass the exam.Here arethe correct answers:

1. B	6. A 	11. B 	16. C
2. D	7. B 	12. C 	17. C
3. A 	8. A 	13. D 	18. B
4. A 	9. C 	14. A 	19. D
5. C	10. D	15. D 	20. A

Write a class named DriverExam that holds the correct answers to the exam in an array field. The class should also have an array field that holds the student’s answers. The class should have the following methods:
⦁	passed. Returns true if the student passed the exam, or false if the student failed
⦁	totalCorrect. Returns the total number of correctly answered questions
⦁	totalIncorrect. Returns the total number of incorrectly answered questions
⦁	questionsMissed: An int array containing the question numbers of the questions that the student missed

Demonstrate the class in a complete program that asks the user to enter a student’s answers, and then displays the results returned from the DriverExam class’s methods. Input Validation: Only accept the letters A, B, C, or D as answers.


Lottery Application
 Write a Lottery class that simulates a lottery. The class should have an array of five integers named lotteryNumbers. The constructor should generate a random number in the range of 0 through 9 for each element in the array. Refer to Chapter 4’s discussion of the Random class for generating random numbers. The class should also have a method that accepts an array of five integers that represent a person’s lottery picks. The method is to compare the corresponding elements in the two arrays and return the number of digits that match. For example, the following shows the lotteryNumbers array and the user’s array with sample numbers stored in each. There are two matching digits (elements 2 and 4). In addition, the class should have a method that returns a copy of the lotteryNumbers array.
