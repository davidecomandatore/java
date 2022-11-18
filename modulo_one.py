

def f(x,y=10):
    '''
    restituisce somma dei due args
    '''
    return x+y

if __name__ == "__main__":
    from modulo_two import g
    print(f(2))
    print(f(g(2)))

