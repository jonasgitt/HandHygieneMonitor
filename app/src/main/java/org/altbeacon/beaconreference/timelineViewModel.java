package org.altbeacon.beaconreference;

import androidx.annotation.NonNull;

public class timelineViewModel {


    public String message;
    public String date;
    public String status;
    public String HHEtime;

    timelineViewModel(String message, String date, String status, String HHEtime){

        this.message =message;
        this.HHEtime = HHEtime;
        this.date = date;
        this.status = status;

    }
}
