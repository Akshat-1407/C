
from tkinter import *

def button_press(num):
    global equation_text
    equation_text = equation_text + str(num)
    equation_var.set(equation_text)

def equals():
    global equation_text

    try:
        total = str(eval(equation_text))
        equation_var.set(total)
        equation_text = total

    except SyntaxError:
        equation_var.set("syntax error")
        equation_text = ""

    except ZeroDivisionError:
        equation_var.set("arithmetic error")
        equation_text = ""

def clear():

    global equation_text
    equation_var.set("")
    equation_text = ""


window = Tk()
window.title("CALCULATOR")

icon = PhotoImage(file='F:\\GUI Images\\calc.png')
window.iconphoto(True, icon)

equation_text = ""

equation_var = StringVar()

frame = Frame(window)
frame.pack()

label = Label(frame, textvariable=equation_var, font=('consolas',20), bg="#646464", foreground="white", width=18, height=2)
label.grid(row=0, column=0, columnspan=4, sticky="we")

Button(frame, text="1", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(1)).grid(row=5, column=0)
Button(frame, text="2", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(2)).grid(row=5, column=1)
Button(frame, text="3", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(3)).grid(row=5, column=2)
Button(frame, text="4", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(4)).grid(row=4, column=0)
Button(frame, text="5", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(5)).grid(row=4, column=1)
Button(frame, text="6", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(6)).grid(row=4, column=2)
Button(frame, text="7", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(7)).grid(row=3, column=0)
Button(frame, text="8", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(8)).grid(row=3, column=1)
Button(frame, text="9", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(9)).grid(row=3, column=2)
Button(frame, text="0", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press(0)).grid(row=6, column=1)
Button(frame, text=".", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('.')).grid(row=6, column=0)
Button(frame, text="+", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('+')).grid(row=3, column=3)
Button(frame, text="-", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('-')).grid(row=4, column=3)
Button(frame, text="*", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('*')).grid(row=5, column=3)
Button(frame, text="/", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('/')).grid(row=6, column=3)
Button(frame, text="(", font=("Arial", 14, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=lambda: button_press('(')).grid(row=2, column=2)
Button(frame, text=")", font=("Arial", 14, "bold"), background="#343434", foreground="white", activebackground="light grey", activeforeground="white",height=2, width=5, relief=RAISED, command=lambda: button_press(')')).grid(row=2, column=3)
Button(frame, text="CLEAR", font=("Arial", 14, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=11, relief=RAISED, command=clear).grid(row=2, column=0, columnspan=2)
Button(frame, text="=", font=("Arial", 15, "bold"),background="#343434", foreground="white", activebackground="light grey", activeforeground="white", height=2, width=5, relief=RAISED, command=equals).grid(row=6, column=2)

#center the window
window.update()
window_width = window.winfo_width()
window_height = window.winfo_height()
screen_width = window.winfo_screenwidth()
screen_height = window.winfo_screenheight()

window_x = int((screen_width/2) - (window_width/2))
window_y = int((screen_height/2) - (window_height/2))

#format "(w)x(h)+(x)+(y)"
window.geometry(f"{window_width}x{window_height}+{window_x}+{window_y}")

window.mainloop()