import random

playing = True
choices = ["Rock", "Paper", "Scissors"]
user = None
computer = random.choice(choices)

print("Welcome to Rock Paper Scissors !")

while playing:
    user = input("Enter Your Choice: ").capitalize().strip()

    while user not in ["Rock", "Paper", "Scissors"]:
        user = input("Enter Your Choice: ").capitalize().strip()

    print(f"Your Choice: {user}")    
    print(f"Computer Choice: {computer}")

    if (user=="Rock" and computer=="Paper"):
        print("Computer Wins !")
    elif (user=="Rock" and computer=="Scissors"):
        print("You Win !")
    elif (user=="Paper" and computer=="Rock"):
        print("You Win !")
    elif (user=="Paper" and computer=="Scissors"):
        print("Computer Wins !")
    elif (user=="Scissors" and computer=="Rock"):
        print("Computer Wins !")
    elif (user=="Scissors" and computer=="Paper"):
        print("You Win !")
    else:
        print("Tie !!")

    play_again = input("Play Again? (y/n): " ).lower().strip()

    while play_again not in ["y", "n"]:
        play_again = input("Play Again? (y/n): " ).lower().strip()
        
    if play_again == "n":
        playing = False

    print("Thanks For Playing the Game !")
