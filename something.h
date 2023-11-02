#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown } ;
class Animal {
public :
    Animal() : _name("unknown") {
        cout << "constructing Animal object "<< _name << endl ;
    }

    Animal(string n, COLOR c) : _name(n), _color(c){
        cout << "constructing Animal object " << _name << ", " << COLOR(_color) << endl;
    }

    ~Animal() {
        cout << "destructing Animal object "<< _name << endl ;
    }


    virtual void speak() {
        cout << "Animal speaks "<< endl ;
    }
    virtual void move() { }
private :
    string _name;
    COLOR _color ;
};

class Mammal : public Animal {
public:
    Mammal() : _name("unknown"){
        cout << "constructing Mammal object "<< _name << endl ;
    }

    Mammal(string n, COLOR c) : _name(n), _color(c){
        cout << "constructing Mammal object " << _name << ", " << COLOR(_color) << endl;
    }

    ~Mammal() {
        cout << "destructing Mammal object "<< _name << endl ;
    }

    virtual void eat() {
        cout << "Mammal eat" << endl;
    }
private :
    string _name;
    COLOR _color ;
};

class Dog : public Mammal {
public:
    Dog(string o, string n, COLOR c) : _owner(o), _name(n), _color(c){
        cout << "constructing Dog object " << _owner << ", " << _name << ", " << COLOR(_color) << endl;
    }

    ~Dog() {
        cout << "destructing Dog object "<< _name << endl ;
    }

    void speak() override {
        cout << "Dog woofs "<< endl ;
    }

    void move() override {
        cout << "Dog moves" << endl;
    }
    void eat() {
        cout << "Dog eat" << endl;
    }
private :
    string _owner;
    string _name;
    COLOR _color ;
};

class Cat : public Mammal {
public:
    Cat(string o, string n, COLOR c) : _owner(o), _name(n), _color(c){
        cout << "constructing Cat object " << _owner << ", " << _name << ", " << COLOR(_color) << endl;
    }

    ~Cat() {
        cout << "destructing Cat object "<< _name << endl ;
    }

    void speak() override {
        cout << "Cat meows "<< endl ;
    }

    void move() override {
        cout << "Cat moves" << endl;
    }
    void eat() {
        cout << "Cat eat" << endl;
    }
private :
    string _owner;
    string _name;
    COLOR _color ;
};

class Lion : public Mammal {
public:
    Lion(string n, COLOR c) : _name(n), _color(c){
        cout << "constructing Lion object "  << _name << ", " << COLOR(_color) << endl;
    }

    ~Lion() {
        cout << "destructing Lion object "<< _name << endl ;
    }

    void speak() override {
        cout << "Lion roars "<< endl ;
    }

    void move() override {
        cout << "Lion moves" << endl;
    }
    void eat() {
        cout << "Lion eat" << endl;
    }
private :
    string _name;
    COLOR _color ;
};
