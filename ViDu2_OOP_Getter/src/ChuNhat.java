
public class ChuNhat {
	//Khai bao cac thuoc tinh / du lieu cua lop / truong thong tin
	private double dai;
	private double rong;
	
	// tao ham constructor
	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    //cach 2
//    public ChuNhat(double daiM, double rongM) {
//        dai = daiM;
//        rong = rongM;
//    }
    // cac getter
    doube getDai() {
        return dai;
    }
    double getRong() {
        return rong;
    }
    // cac setter
    void setDai(double daiM) {
        dai = daiM;
    }
    void setRong(double rongM) {
        rong = rongM;
    }
    //cac phuong thuc khac
    
}
