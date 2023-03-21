def int_to_str(x):
    return "% s" % x
def str_to_int(x):
    return eval(x)

print(type(int_to_str(4)))
print(type(str_to_int("5")))
print(int_to_str(4))
print(str_to_int("5"))