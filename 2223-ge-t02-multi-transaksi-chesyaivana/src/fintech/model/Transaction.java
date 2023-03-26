package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {

    // class definition
    private Float nominal;
    private String postedAt;
    private String note;

    public Transaction() {
    }

    

    public Transaction(Float nominal, String postedAt, String note) {
        this.postedAt = postedAt;
        this.note = note;
        this.nominal = nominal;
    }

    public String getPostedAt() {
        return postedAt;
    }



    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }



    public String getNote() {
        return note;
    }


    
    public void setNote(String note) {
        this.note = note;
    }



    public Float getNominal() {
        return nominal;
    }



    public void setNominal(Float nominal) {
        this.nominal = nominal;
    }
    
}