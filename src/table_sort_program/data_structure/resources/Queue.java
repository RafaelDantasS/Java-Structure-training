package table_sort_program.data_structure.resources;

import table_sort_program.data_structure.LinkedList;

public class Queue<Type> {
    private LinkedList<Type> list;
    public Queue(){
        this.list = new LinkedList<Type>();
    }
    public void addElement(Type value){
        this.list.addNew(value);
    }
    public void delete(){

    }
}
