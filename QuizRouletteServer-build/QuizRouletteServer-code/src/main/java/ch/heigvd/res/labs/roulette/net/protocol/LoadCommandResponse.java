package ch.heigvd.res.labs.roulette.net.protocol;

/**
 * Created by quentingigon on 03.04.17.
 */
public class LoadCommandResponse {

    private String status;
    private int newStudents;

    public LoadCommandResponse() {}

    public LoadCommandResponse(String status, int newStudents) {
        this.status = status;
        this.newStudents = newStudents;
    }

    public String getStatus() {
        return status;
    }

    public int getNewStudents() {
        return newStudents;
    }
}
