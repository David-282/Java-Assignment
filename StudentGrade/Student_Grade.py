
def input_results(students_results):
    for student_index in range(len(students_results)):
        for subject_index in range(len(students_results[student_index])):
            students_results[student_index][subject_index] = int(
                input(
                    f"Entering Score for Student {student_index + 1}\n"
                    f"Enter Score for Subject {subject_index + 1}: "
                )
            )
            print("Saving >>>>>>>>>>>>>>")
            print("Saved Successfully")
            print()
    return students_results


def total_per_student(students_results):
    total_array = [0] * len(students_results)

    for student_index in range(len(students_results)):
        for subject_index in range(len(students_results[student_index])):
            total_array[student_index] += students_results[student_index][subject_index]

    return total_array


def average_per_student(total_array, no_of_subjects):
    average_array = [0.0] * len(total_array)

    for index in range(len(total_array)):
        average_array[index] = total_array[index] / no_of_subjects

    return average_array


def position(total_array):
    position_array = [0] * len(total_array)

    for current in range(len(total_array)):
        pos = 1
        for other in range(len(total_array)):
            if total_array[other] > total_array[current]:
                pos += 1
        position_array[current] = pos

    return position_array


def total_per_subject(students_results, no_of_subjects):
    subjects_total = [0] * no_of_subjects

    for student_index in range(len(students_results)):
        for subject_index in range(no_of_subjects):
            subjects_total[subject_index] += students_results[student_index][subject_index]

    return subjects_total


def subject_average(subjects_total, no_of_students):
    subject_average_array = [0.0] * len(subjects_total)

    for index in range(len(subjects_total)):
        subject_average_array[index] = subjects_total[index] / no_of_students

    return subject_average_array


def subject_summary(
    students_results,
    no_of_students,
    no_of_subjects,
    subjects_total,
    subject_average_array
):
    for subject_index in range(no_of_subjects):
        highest_score = students_results[0][subject_index]
        lowest_score = students_results[0][subject_index]
        highest_scoring_student = 1
        lowest_scoring_student = 1
        passes = 0
        fails = 0

        for student_index in range(no_of_students):
            result = students_results[student_index][subject_index]

            if result > highest_score:
                highest_score = result
                highest_scoring_student = student_index + 1

            if result < lowest_score:
                lowest_score = result
                lowest_scoring_student = student_index + 1

            if result >= 50:
                passes += 1
            else:
                fails += 1

        print()
        print(f"Subject {subject_index + 1}")
        print(f"Highest scoring Student is: Student {highest_scoring_student} scoring {highest_score}")
        print(f"Lowest scoring Student is: Student {lowest_scoring_student} scoring {lowest_score}")
        print("Number of passes:", passes)
        print("Number of fails:", fails)
        print(f"Total Score is {subjects_total[subject_index]}")
        print(f"Average Score is: {subject_average_array[subject_index]:.2f}")
        print()


def class_summary(total_array, no_of_students):
    total_sum = 0
    highest_score = total_array[0]
    lowest_score = total_array[0]
    highest_scoring_student = 1
    lowest_scoring_student = 1

    for index in range(no_of_students):
        result = total_array[index]
        total_sum += result

        if result > highest_score:
            highest_score = result
            highest_scoring_student = index + 1

        if result < lowest_score:
            lowest_score = result
            lowest_scoring_student = index + 1

    class_average = total_sum / no_of_students

    print()
    print("CLASS SUMMARY")
    print("=" * 50)
    print(f"Best Graduating Student is: Student {highest_scoring_student} scoring {highest_score}")
    print("=" * 50)
    print()
    print("!" * 50)
    print(f"Worst Graduating Student is: Student {lowest_scoring_student} scoring {lowest_score}")
    print("!" * 50)
    print()
    print("=" * 50)
    print("Class Total Score is:", total_sum)
    print(f"Class Average is: {class_average:.2f}")


def hardest_and_easiest(students_results):
    highest_score = students_results[0][0]
    lowest_score = students_results[0][0]
    highest_scoring_student = 1
    lowest_scoring_student = 1
    highest_subject = 1
    lowest_subject = 1

    pass_array = [0] * len(students_results[0])

    for subject_index in range(len(students_results[0])):
        for student_index in range(len(students_results)):
            result = students_results[student_index][subject_index]

            if result >= 50:
                pass_array[subject_index] += 1

            if result > highest_score:
                highest_score = result
                highest_scoring_student = student_index + 1
                highest_subject = subject_index + 1

            if result < lowest_score:
                lowest_score = result
                lowest_scoring_student = student_index + 1
                lowest_subject = subject_index + 1

    highest_pass = pass_array[0]
    lowest_pass = pass_array[0]
    highest_pass_subject = 1
    lowest_pass_subject = 1

    for index in range(len(pass_array)):
        if pass_array[index] > highest_pass:
            highest_pass = pass_array[index]
            highest_pass_subject = index + 1

        if pass_array[index] < lowest_pass:
            lowest_pass = pass_array[index]
            lowest_pass_subject = index + 1

    failures = len(students_results) - lowest_pass

    print()
    print(f"The Hardest subject is subject {lowest_pass_subject} with {failures} failures")
    print(f"The Easiest subject is subject {highest_pass_subject} with {highest_pass} passes")
    print(f"The overall Highest Score is scored by Student {highest_scoring_student} "f"in subject {highest_subject} scoring {highest_score}")
    print(f"The overall lowest Score is scored by Student {lowest_scoring_student} "f"in subject {lowest_subject} scoring {lowest_score}")
    print()




no_of_students = int(input("How many students do you have ?: "))
no_of_subjects = int(input("How many subjects do they offer ?: "))

print("Saving >>>>>>>>>>>>>>")
print("Saved Successfully")


students_results = []
for _ in range(no_of_students):
    row = [0] * no_of_subjects
    students_results.append(row)


input_results(students_results)
total_array = total_per_student(students_results)
average_array = average_per_student(total_array, no_of_subjects)
position_array = position(total_array)
subjects_total = total_per_subject(students_results, no_of_subjects)
subject_average_array = subject_average(subjects_total, no_of_students)

print("=" * 70)

print("STUDENT\t\t", end="")
for count in range(1, no_of_subjects + 1):
    print(f"SUB{count}\t", end="")
print("TOT\t Ave\t POS")

for index in range(no_of_students):
    print(f"Student {index + 1}\t", end="")
    for element in range(no_of_subjects):
        print(students_results[index][element], end="\t")
    print(total_array[index], end="\t")
    print(f"{average_array[index]:.2f}", end="\t")
    print(position_array[index])

print("=" * 70)
print()

print("SUBJECT SUMMARY")
subject_summary(students_results,no_of_students,no_of_subjects,subjects_total,subject_average_array)
hardest_and_easiest(students_results)
class_summary(total_array, no_of_students)
