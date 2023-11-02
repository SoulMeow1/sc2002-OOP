#include <iostream>
#include <string>
#include "something.h"

using namespace std ;

int main() {
    /*Animal b("Fish", White);
    b.speak();
    cout << endl;

    Mammal m("Lion", Brown);
    m.speak();
    m.eat();
    cout << endl;

    Dog d("John Doe", "Poodle", White);
    d.speak();
    cout << endl;

    Animal *animalPtr = new Dog("Lassie", "Andy", White);
    animalPtr->speak();
    animalPtr->move();
    cout << endl;

    Dog dogi("Lassie", "Andy", White);
    Mammal *aniPtr = &dogi ;
    Mammal &aniRef = dogi ;
    Mammal aniVal = dogi ;
    cout << "Virtual function magic" << endl;
    aniPtr->speak() ;
    aniRef.speak() ;
    aniVal.speak() ;
    cout << endl;

    cout << "Program exiting ... "<< endl ;*/
    bool loop = true;
    int choice;
    Mammal *animalArray[5];
    int arrPtr = 0;

    while(loop){
        cout << "Select animal to send to Zoo (up to 5):" << endl;
        cout << "1. Dog, 2. Cat, 3. Lion, 4. Move all animals, 5. quit" << endl;
        cout << "Selection: ";
        cin >> choice;
        switch(choice){
        case 1:
            if(arrPtr == 5) break;
            animalArray[arrPtr] = new Dog("zoo", "hound", Black);
            arrPtr++;
            break;
        case 2:
            if(arrPtr == 5) break;
            animalArray[arrPtr] = new Cat("zoo", "White Cat", White);
            arrPtr++;
            break;
        case 3:
            if(arrPtr == 5) break;
            animalArray[arrPtr] = new Lion("Lion", Brown);
            arrPtr++;
            break;
        case 4:
            for(int i = 0; i < arrPtr; i++){
                animalArray[i]->move();
                animalArray[i]->speak();
                animalArray[i]->eat();
            }
            break;
        case 5:
            loop = false;
            break;
        default:
            cout << "Invalid choice" << endl;
        }
    }

    return 0;
}

