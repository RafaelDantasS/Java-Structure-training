package table_sort_program.data_structure;

import table_sort_program.data_structure.resources.Element;

public class LinkedList<Type> {

    private Element<Type> first;
    private Element<Type> last;
    private int length = 0;

    public Element<Type> getFirst() {
        return first;
    }

    public void setFirst(Element<Type> first) {
        this.first = first;
    }

    public Element<Type> getLast() {
        return last;
    }

    public void setLast(Element<Type> last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addNew(Type newValue){
        Element<Type> newElement = new Element<Type>(newValue);
        if (this.first == null && this.last == null){
            this.first = newElement;
        }
        else {
            this.last.setNext(newElement);
            this.length ++;
        }
        this.last = newElement;
    }

    public void delete(Type desiredValue){
        Element<Type> previousValue = null;
        Element<Type> currentValue = this.first;
        for (int i = 0; i < this.length; i++) {
            if (currentValue.equals(desiredValue)) {
                if (this.length == 0){
                    this.first = null;
                    this.last = null;
                } 
                else if (currentValue.equals(this.first)) {
                    this.first = this.first.getNext();
                } else if (currentValue.equals(this.last)) {
                    this.last = previousValue;
                    previousValue.setNext(null);
                }
                else {
                    previousValue.setNext(currentValue.getNext());
                    currentValue = null;
                    break;
                }
            }
            previousValue = currentValue;
            currentValue = currentValue.getNext();
        }
    }
}