package learningprojects.project1;

public class entity {
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private int userid;


    public int getUserrefferalincome() {
        return 100*getAddrefferal();
    }

    public void setUserrefferalincome(int userrefferalincome) {
        this.userrefferalincome = userrefferalincome;
    }

    private int userrefferalincome;

    public int getAddrefferal() {
        int add = 0;
        return add+=addrefferal;
    }

    public void setAddrefferal(int addrefferal) {
        this.addrefferal = addrefferal;
    }

    private int addrefferal;

    public double getWithdrawrefferal() {
        return getUserrefferalincome()-withdrawrefferal;
    }

    public void setWithdrawrefferal(double withdrawrefferal) {
        this.withdrawrefferal = withdrawrefferal;
    }

    private double withdrawrefferal;

}
