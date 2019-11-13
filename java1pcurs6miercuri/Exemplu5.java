public class Exemplu5{
    public static void main(String ... args){
        DatabaseManagerFactory manager1 = DatabaseManagerFactory.create(DatabaseManagerFactory.DataType.ORACLE);
        manager1.select();
        manager1.insert();
        DatabaseManagerFactory manager2 = DatabaseManagerFactory.create(DatabaseManagerFactory.DataType.MySQL);
        manager2.insert();
    }
}