public class Subtitle implements iSubtitle{
    Time startTime;
    Time endTime;
    String text;

    // getters
    public Time getStartTime(){
        return this.startTime;
    }

    public Time getEndTime(){
        return this.endTime;
    }

    public String getText(){
        return this.text;
    }

    // setters
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setText(String str) {
        this.text = str;
    }
}
