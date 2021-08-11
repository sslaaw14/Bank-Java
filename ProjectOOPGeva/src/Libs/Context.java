/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libs;

/**
 *
 * @author softcomp
 */
public class Context {
    private static final Context INSTANCE = new Context();
    public static Context getInstance() {
        return INSTANCE;
    }
    private Context() {
        DB = new DummyDB();
    }
    
    
    private DummyDB DB;
    public DummyDB getDB(){
        return DB;
    }
}
