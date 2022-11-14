n1 = 1
n2 = 2
s1 = 'hi'
s2 = 'hello'

if type(n1) == type(n2):
    if n1<n2:
        print("n1 minore di n2")
    elif n1==n2:
        print("n1 ed n2 sono uguali")
    else:
        print("n1 maggiore di n2")


if type(s1) == type(s2):
    if s1 in s2:
        print("s1 sottostringa di s2")
    elif s2 in s1:
        print("s2 e' sottostringa di s1")
    else:
        print("s1 ed s2 sono diversi tra loro")
