public class Time implements iTime {
    public int SS;
    public int MS;
    public int MM;
    public int HH;

    // constructors
    public Time(int ss, int ms, int mm, int hh){
        this.SS = ss;
        this.MS = ms;
        this.MM = mm;
        this.HH = hh;
    }

    public long getTotalMS(){
        return this.SS*1000 + this.MM*60000 + this.HH*3600000;
    }
    // getters
    public int getSS() {
        return SS;
    }
    public int getMS() {
        return MS;
    }
    public int getMM() {
        return MM;
    }
    public int getHH() {
        return HH;
    }

    // setters
    public void setSS(int ss) {
        this.SS = ss;
    }
    public void setMS(int ms) {
        this.MS = ms;
    }
    public void setMM(int mm) {
        this.MM = mm;
    }
    public void setHH(int hh) {
        this.HH = hh;
    }

    // comparison
    public boolean greaterThan(Time other){
        return this.getTotalMS() > other.getTotalMS();
    }

    public boolean greaterThanOrEq(Time other){
        return this.getTotalMS() >= other.getTotalMS();
    }

    public boolean lesserThanOrEq(Time other){
        return this.getTotalMS() <= other.getTotalMS();
    }

    public boolean equals(Time other){
        return this.getTotalMS() == this.getTotalMS();
    }
    

}