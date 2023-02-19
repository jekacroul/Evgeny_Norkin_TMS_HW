package Lesson_22;

public class Document {
    private Integer docNum;
    private String docName;
    private String dateCreate;

    public Document() {
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docNum=" + docNum +
                ", docName='" + docName + '\'' +
                ", dateCreate=" + dateCreate +
                '}';
    }
}
