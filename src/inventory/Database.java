package inventory;

interface Database {
    
    void updateDatabase(String query);

    Object[] readDatabase(String query);
}
