import pyttsx3
import tkinter

def main():
    global board, curr_player, playerX, playerO, color_blue, color_yellow, color_gray, color_light_gray, label, window, turns, game_over

    # Game setup
    playerX = "x"
    playerO = "o"
    curr_player = playerX
    board = [[0, 0, 0],
             [0, 0, 0],
             [0, 0, 0]]

    color_blue = "#4584b6"
    color_yellow = "#ffde57"
    color_gray = "#343434"
    color_light_gray = "#646464"

    turns = 0
    game_over = False

    # Window setup
    window = tkinter.Tk()
    window.title("Tic Tac Toe")
    window.resizable(False, False)

    frame = tkinter.Frame(window)

    label = tkinter.Label(frame, text=curr_player + "'s turn", font=("Consolas", 30), background=color_gray, foreground="white")
    label.grid(row=0, column=0, columnspan=3, sticky="we")

    for row in range(3):
        for column in range(3):
            board[row][column] = tkinter.Button(frame, text="", font=("Consolas", 60, "bold"), activebackground=color_light_gray, relief="ridge",
                                                background=color_gray, foreground=color_blue, activeforeground=color_blue, width=4, height=1,
                                                command=lambda row=row, column=column: set_tile(row, column))
            board[row][column].grid(row=row + 1, column=column)

    restart_button = tkinter.Button(frame, text="Restart", font=("Consolas", 18), background=color_gray, activebackground=color_light_gray,
                                    foreground="white", activeforeground="white", command=new_game)
    restart_button.grid(row=4, column=0, columnspan=3, sticky="we")

    frame.pack()

    # Center the window
    window.update()
    window_width = window.winfo_width()
    window_height = window.winfo_height()
    screen_width = window.winfo_screenwidth()
    screen_height = window.winfo_screenheight()

    window_x = int((screen_width / 2) - (window_width / 2))
    window_y = int((screen_height / 2) - (window_height / 2))

    window.geometry(f"{window_width}x{window_height}+{window_x}+{window_y}")

    # Saying Welcome message
    engine = pyttsx3.init()
    rate = engine.getProperty('rate')
    engine.setProperty('rate', rate - 80)
    engine.say("Welcome to tic tac toe.")
    engine.runAndWait()

    window.mainloop()


def set_tile(row, column):
    global curr_player

    if game_over:
        return

    if board[row][column]["text"] != "":
        return

    board[row][column]["text"] = curr_player  # Mark the board

    if curr_player == playerO:  # Switch player
        curr_player = playerX
    else:
        curr_player = playerO

    label["text"] = curr_player + "'s turn"

    check_and_announce_winner()


def check_and_announce_winner():
    global turns, game_over
    turns += 1

    # Create the engine
    engine = pyttsx3.init()

    # Horizontally, check 3 rows
    for row in range(3):
        if (board[row][0]["text"] == board[row][1]["text"] == board[row][2]["text"]
                and board[row][0]["text"] != ""):
            label.config(text=board[row][0]["text"] + " is the winner!", foreground=color_yellow)
            for column in range(3):
                board[row][column].config(foreground=color_yellow, background=color_light_gray)
            game_over = True

            # Announce the victor
            window.after(100, lambda: engine.say(f"congratulations Player {board[row][0]['text']}, you are the winner!") or engine.runAndWait())
            return

    # Vertically, check 3 columns
    for column in range(3):
        if (board[0][column]["text"] == board[1][column]["text"] == board[2][column]["text"]
                and board[0][column]["text"] != ""):
            label.config(text=board[0][column]["text"] + " is the winner!", foreground=color_yellow)
            for row in range(3):
                board[row][column].config(foreground=color_yellow, background=color_light_gray)
            game_over = True

            # Announce the victor
            window.after(100, lambda: engine.say(f"congratulations Player {board[0][column]['text']}, you are the winner!") or engine.runAndWait())
            return

    # Diagonally
    if (board[0][0]["text"] == board[1][1]["text"] == board[2][2]["text"]
            and board[0][0]["text"] != ""):
        label.config(text=board[0][0]["text"] + " is the winner!", foreground=color_yellow)
        for i in range(3):
            board[i][i].config(foreground=color_yellow, background=color_light_gray)
        game_over = True

        # Announce the victor
        window.after(100, lambda: engine.say(f"congratulations Player {board[0][0]['text']}, you are the winner!") or engine.runAndWait())
        return

    # Anti-diagonally
    if (board[0][2]["text"] == board[1][1]["text"] == board[2][0]["text"]
            and board[0][2]["text"] != ""):
        label.config(text=board[0][2]["text"] + " is the winner!", foreground=color_yellow)
        board[0][2].config(foreground=color_yellow, background=color_light_gray)
        board[1][1].config(foreground=color_yellow, background=color_light_gray)
        board[2][0].config(foreground=color_yellow, background=color_light_gray)
        game_over = True

        # Announce the victor
        window.after(100, lambda: engine.say(f"congratulations Player {board[0][2]['text']}, you are the winner!") or engine.runAndWait())
        return

    # Tie
    if turns == 9:
        game_over = True
        label.config(text="Tie!", foreground=color_yellow)

        # Announce the victor
        window.after(100, lambda: engine.say("It's a Tie!") or engine.runAndWait())


def new_game():
    global turns, game_over

    turns = 0
    game_over = False

    label.config(text=curr_player + "'s turn", foreground="white")

    for row in range(3):
        for column in range(3):
            board[row][column].config(text="", foreground=color_blue, background=color_gray)

    # Announce the restart of the game
    engine = pyttsx3.init()
    window.after(200, lambda: engine.say("The game is resetted.") or engine.runAndWait())


if __name__ == "__main__":
    main()
