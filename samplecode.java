public class MongoHello {
    public static void main(String[] args) throws UnknownHostException{
        MongoClient mClient = new MongoClient();
        MongoDatabase database = mClient.getDatabase("database_name");
        MongoCollection course = database.getCollection("collection_name");
        Iterator itr = (course.find()).iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }
}