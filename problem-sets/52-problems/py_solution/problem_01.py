
def even_odd(sample):
    if sample == 0:
        return "0 is non-negative."

    else:
        if sample % 2 == 0:
            return str(sample)+" is even."
        elif sample % 2 != 0:
            return str(sample)+ " is odd."

def take_nput():
    numbers = []
    number = int(input("Enter number of elements : "))
    for i in range(0,number):
        x = int(input())
        numbers.append(x)

    return numbers

def main():
    for value in take_nput():
        print(even_odd(value))


if __name__ == '__main__':
    main()

