/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libs;

import java.util.ArrayList;

/**
 *
 * @author softcomp
 * @param <E>
 */
public class DBA_Repository <E>{
    
    public void save(E e){
        Context.getInstance().getDB().db.add(e);
    }
    public void update(E e, int id){
        delete(id);
        Context.getInstance().getDB().db.add(id, e);
        
    }
    public void delete(int id){
        Context.getInstance().getDB().db.remove(id);
    }
    public E findByID(int id){
        return (E) Context.getInstance().getDB().db.get(id);
    }
    public ArrayList<E> findAll(){
        return (ArrayList<E>) Context.getInstance().getDB().db;
    }
    
}
