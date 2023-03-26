package fintech.model;

/**
 * @author 12S21051 Martha B Napitupulu
 * @author 12S21053 Chesya Ivana j. m Sitorus
 */
public class Transaction {

    private String postedAt;
    private String note;

    private Double nominal;

    private Integer transactionNumber;

    public Transaction() {
    }

    public Transaction(Double nominal, String postedAt, String note, Integer transactionNumber) {
        this.postedAt = postedAt;
        this.note = note;
        this.nominal = nominal;
        this.transactionNumber = transactionNumber;
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

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Integer transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Double getNominal() {
        return nominal;
    }

    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return String.format("%.1f|%s|%s", this.nominal, this.postedAt, this.note);
    }
}