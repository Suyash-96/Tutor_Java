package app.school.tutor_java.Data;

import android.widget.Button;

public class ClassCard {

    private Button videos;
    private Button notes;
    private Button tests;
    private Button others;

    public ClassCard(Button videos, Button notes, Button tests, Button others) {
        this.videos = videos;
        this.notes = notes;
        this.tests = tests;
        this.others = others;
    }

    public Button getVideos() {
        return videos;
    }

    public void setVideos(Button videos) {
        this.videos = videos;
    }

    public Button getNotes() {
        return notes;
    }

    public void setNotes(Button notes) {
        this.notes = notes;
    }

    public Button getTests() {
        return tests;
    }

    public void setTests(Button tests) {
        this.tests = tests;
    }

    public Button getOthers() {
        return others;
    }

    public void setOthers(Button others) {
        this.others = others;
    }
}
