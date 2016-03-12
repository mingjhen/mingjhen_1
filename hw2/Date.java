/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Date {

    int Y, M, D;
    int i;

    Date() {
        this.Y = 0;
        this.M = 0;
        this.D = 0;

    }

    int year(int y) {
        if (y < 0) {
            return -1;
        } else if(y>9999)
        {
        System.out.println("太多年!");
        return -1;
        }
        else {
            this.Y = y;
        }
        return y;
    }

    int month(int m) {
        if (m <= 0 || m > 12) {
            return -1;
        } else {
            this.M = m;
        }
        return m;
    }

    int day(int d) {
        if (this.M == 2) {
            if (d == 29 && (this.Y % 400 == 0 || (this.Y % 4 == 0 && this.Y % 100 != 0))) {
                this.D = d;
                return d;
            } else if(d>28){
                return -1;
            }
        } else if (this.M != 2) {
            if ((this.M < 8 && this.M % 2 == 1) || (this.M >= 8 && this.M % 2 == 0)) {
                if (d <= 0 || d > 31) {
                    return -1;
                } else {
                    this.D = d;
                    return d;
                }
            }
        } else if (d > 30) {
            return -1;
        }
        return d;
    }
}
