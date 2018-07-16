package entities;

import java.util.List;

public class TimeSheet {

    private String name;
    private List<TimeRecord> timeRecords;

    public static class Builder {

        private TimeSheet timeSheet;
        private String name;
        private List<TimeRecord> timeRecords;

        public Builder hasName(String name) {
            this.name = name;
            return this;
        }

        public Builder hasRecords(List<TimeRecord> records){
            this.timeRecords = records;
            return this;
        }



        public TimeSheet build() {
            timeSheet = new TimeSheet();
            timeSheet.name = this.name;
            timeSheet.timeRecords = this.timeRecords;
            return timeSheet;
        }
    }
}
