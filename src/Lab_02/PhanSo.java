package Lab_02;

import java.io.Serializable;

/**
 * Lớp đối tượng Phân số
 * Triển khai Serializable để hỗ trợ ghi/đọc đối tượng từ tập tin nhị phân (.dat)
 */
public class PhanSo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = (mauSo == 0) ? 1 : mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = (mauSo == 0) ? 1 : mauSo;
    }

    /**
     * Kiểm tra số nguyên n có phải số nguyên tố không
     * Số nguyên tố là số > 1 và chỉ chia hết cho 1 và chính nó.
     */
    public static boolean isNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Kiểm tra mẫu số của phân số có phải là số nguyên tố hay không
     */
    public boolean isMauSoNguyenTo() {
        return isNguyenTo(this.mauSo);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
