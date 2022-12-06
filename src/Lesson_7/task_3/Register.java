package Lesson_7.task_3;

class Register implements Registration{
      int capacity = 10;
      int size = 0;
      Document document[] =  new Document[capacity];

    @Override
    public void saveDockInRegister(Document document) {
        this.document[size] = document;
           size++;
    }
    @Override
    public void checkInformationAbouDock() {
        for (int i = 0; i < size; i++) {
            System.out.println(document[i]);
        }
    }
}
