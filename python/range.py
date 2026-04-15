count = 0 # to count the number scores
total = 0 # count how many scores

for number in range(1, 10):
    student_score = int(input(f"Enter score {number}: "))
    tatal = student_score
    count += 1

average = total / count

print(f"The student average is {average}")
