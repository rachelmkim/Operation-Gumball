# Operation-Gumball

Directions to play game: 
The computer will generate a 3-digit number with distinct digits (the first digit can be 0) and the player has to try to guess this number in 10 attempts to win; if you cannot guess the correct number in less than 10 attempts, you lose. To help with your guessing, the computer tells you how many “green balls” and “red balls” you have:
Green Ball: a number and its position are both correct.
Red Ball: the number is correct, but its position is wrong.

For example, if the answer is 182 and the player guessed:
123 → 1 Green Ball (the 1) and 1 Red Ball (the 2) 
(Note: the player would not know in the actual game which number was the Green Ball and which number was the Red Ball)
111 → 1 Green Ball (the 1) and 2 Red Balls (the 1s)
Double counts the 1
456 → 0 Green Balls and 0 Red Balls

To help you prevent duplicating guesses, the game also tells you the numbers you have already guessed, in increasing order. Note that if a number starts with 0, in the list, it will remove the 0 when it tells you the numbers you have already guessed.

Link to repl.it: https://repl.it/@rachelkim/Operation-Gumball
