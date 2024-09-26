package lesson1;

public class TeamMember {
    private double runningSpeed;
    private double swimmingSpeed;
    private double jumpingHigh;
    private double jumpingLength;

    private boolean isPassedRunning;
    private boolean isPassedSwimming;
    private boolean isPassedHighJumping;
    private boolean isPassedLongJumping;

    private String name;


    public TeamMember(String name, double runningSpeed, double swimmingSpeed, double jumpingHigh, double jumpingLength) {
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.jumpingHigh = jumpingHigh;
        this.jumpingLength = jumpingLength;
        this.name = name;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getJumpingHigh() {
        return jumpingHigh;
    }

    public void setJumpingHigh(double jumpingHigh) {
        this.jumpingHigh = jumpingHigh;
    }

    public double getJumpingLength() {
        return jumpingLength;
    }

    public void setJumpingLength(double jumpingLength) {
        this.jumpingLength = jumpingLength;
    }

    public boolean isPassedRunning() {
        return isPassedRunning;
    }

    public boolean isPassedSwimming() {
        return isPassedSwimming;
    }

    public boolean isPassedHighJumping() {
        return isPassedHighJumping;
    }

    public boolean isPassedLongJumping() {
        return isPassedLongJumping;
    }

    public String getName() {
        return name;
    }

    public void passCourse(Course course){
        this.isPassedRunning = course.run(this);
        this.isPassedSwimming = course.swim(this);
        this.isPassedHighJumping = course.highJump(this);
        this.isPassedLongJumping = course.longJump(this);
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "runningSpeed=" + runningSpeed +
                ", swimmingSpeed=" + swimmingSpeed +
                ", jumpingHigh=" + jumpingHigh +
                ", jumpingLength=" + jumpingLength +
                ", isPassedRunning=" + isPassedRunning +
                ", isPassedSwimming=" + isPassedSwimming +
                ", isPassedHighJumping=" + isPassedHighJumping +
                ", isPassedLongJumping=" + isPassedLongJumping +
                '}';
    }
}
