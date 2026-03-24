# assignment1
Assignment_1_ADS_Amir_Kunanbayev_SE2514

---

## Task 1.
I used the call stack to print digits from left to right. The base case is `n < 10`. The recursive step passes `n / 10` and prints `n % 10` upon return. No loops were used.

**Screenshot:**
<img width="1920" height="1080" alt="Снимок экрана 2026-03-22 223103" src="https://github.com/user-attachments/assets/eb999098-ba05-4d48-8d95-d5672d0d83df" />

---

## Task 2.
I wrote two helper recursive functions to avoid loops: one to fill the array, and another to calculate the sum using `n` as a step counter.

**Screenshot:**
<img width="1920" height="1080" alt="Снимок экрана 2026-03-22 225604" src="https://github.com/user-attachments/assets/1f2d6de1-bd56-45d6-ba53-1d686cce2f27" />

---

## Task 3
I used an extra parameter `divisor` (starting from 2). Base cases check for division without remainder (`n % divisor == 0`) or reaching the number itself (`divisor == n`).

**Screenshot:**<img width="1920" height="1080" alt="Снимок экрана 2026-03-22 231758" src="https://github.com/user-attachments/assets/086db2eb-78db-410e-b22b-429f1bd3f047" />

<img width="1920" height="1080" alt="Снимок экрана 2026-03-22 231808" src="https://github.com/user-attachments/assets/b24ee646-fe53-45a0-9f1b-e0016211f743" />

---

## Task 4
I used `if (n <= 1)` to stop recursion and return 1. Otherwise, it multiplies `n` by the function with `n-1`.

**Screenshot:**
<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225049" src="https://github.com/user-attachments/assets/97a9dc47-9db3-4e09-a307-99ef4700d651" />


---

## Task 5
I added `if` conditions to return 0 or 1. Then I just added the results of the function for `n-1` and `n-2`.

**Screenshot:**
<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225152" src="https://github.com/user-attachments/assets/8b9fa770-04a6-4f3e-8475-a1fb76519811" />


<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225204" src="https://github.com/user-attachments/assets/b607faec-5737-481b-bbb2-be235f709132" />

---

## Task 6
If the power `n` is 0, it returns 1. Otherwise, it multiplies `a` by the function with `n-1`.

**Screenshot:**

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225231" src="https://github.com/user-attachments/assets/c9826028-30f7-4cdc-86f4-7a26aa1f3609" />

---

## Task 7
I read the number with Scanner, called the function again, and only printed the number after that. This makes it print backwards.

**Screenshot:**

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225331" src="https://github.com/user-attachments/assets/f5f6f28c-121d-4979-8751-c4c3d31d5d0d" />

---

## Task 8
I checked characters one by one. If a character is not a number, it returns "No". If it checks all string, it returns "Yes".

**Screenshot:**

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225355" src="https://github.com/user-attachments/assets/476671e9-176f-47e3-b737-f3a11a7f4d71" />

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225415" src="https://github.com/user-attachments/assets/06bbcbbd-464a-4267-984b-e39fd3b1cb40" />


---

## Task 9
If the string is empty, it returns 0. Otherwise, it adds 1 and calls the function again with the rest of the string using `substring(1)`.

**Screenshot:**

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225457" src="https://github.com/user-attachments/assets/52167905-f51f-4b06-aea5-de355c671828" />

---

## Task 10
If `b` is 0, it returns `a`. Otherwise, it calls the function again with `b` and the remainder of `a % b`.

**Screenshot:**
<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225520" src="https://github.com/user-attachments/assets/d915c488-cdfd-480a-83df-b10996021572" />

<img width="1920" height="1080" alt="Снимок экрана 2026-03-24 225529" src="https://github.com/user-attachments/assets/a01ec7f7-a9b5-4c61-9719-85d294803393" />


