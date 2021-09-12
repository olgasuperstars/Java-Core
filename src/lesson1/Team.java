package lesson1;

public class Team {

    private String name;
    private TeamMember[] members;

    public Team(String name, TeamMember[] members) {
        this.name = name;
        this.members = members;
    }

    public void passCourse(Course course) {
        for (TeamMember member : members) {
            member.passCourse(course);
        }
    }

    public void printPassingInfo() {
        for (TeamMember member : members) {
            System.out.println(member.getName() +
                    (member.isPassedHighJumping()
                            && member.isPassedLongJumping()
                            && member.isPassedRunning()
                            && member.isPassedSwimming()
                            ? " is passed"
                            : " is not passed"));
        }
    }

    public void printMembersInfo(){
        for(TeamMember member : members){
            System.out.println(member.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Name='" + name + '\'' +
                '}';
    }
}
