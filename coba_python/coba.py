class SmallIntegerException(Exception):
    #konstruktor
    def __init__(self,msg:str=None):
        self.__total_exception:int = 0
        super().__init__(msg)
    
    def prnt(self,value):
        if value >9:
            self.__total_exception += 1
            raise SmallIntegerException("Nilai lebih  besar dari 9")
            
        elif value < 0:
            self.__total_exception += 1
            raise SmallIntegerException("NIlai lebih kecil dari 0")
        else:
            print("nilai benar")
    
    def getTotal(self):
        return self.__total_exception
            
print("Small Integer Tester")
obj = SmallIntegerException()
while True:
    inpt = input("Masukan Integer: ")
    try:
        inpt = int(inpt)
        try:
            obj.prnt(inpt)
        except SmallIntegerException as sie:
            print(sie)
            print(f"jumlah small int Exception : {obj.getTotal()}")
    except ValueError:
        print("Input harus integer")
        break
    