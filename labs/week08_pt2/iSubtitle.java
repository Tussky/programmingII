public interface iSubtitle {
    Time getStartTime();
    Time getEndTime();
    String getText();
    void setStartTime(Time startTime);
    void setEndTime(Time endTime);
    void setText(String Text);
}
