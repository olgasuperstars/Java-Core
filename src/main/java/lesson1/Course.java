package lesson1;

public class Course implements Runnig, HighJumping, Swimming, LongJumping {

    private double stadium;
    private double pool;
    private double length;
    private double height;

    public Course(double stadium, double pool, double length, double height) {
        this.stadium = stadium;
        this.pool = pool;
        this.length = length;
        this.height = height;
    }


    @Override
    public boolean highJump(TeamMember member) {
        return member.getJumpingHigh() >= height;
    }

    @Override
    public boolean longJump(TeamMember member) {
        return member.getJumpingLength() >= length;
    }

    @Override
    public boolean run(TeamMember member) {
        return member.getRunningSpeed() >= stadium;
    }

    @Override
    public boolean swim(TeamMember member) {
        return member.getSwimmingSpeed() >= pool;
    }
}
