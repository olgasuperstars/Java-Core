package lesson1;

public class App {

    public static void main(String[] args) {
        TeamMember[] teamMembers = {
                new TeamMember("Petr",  20, 30, 2, 2),
                new TeamMember("Fedor", 10, 5, 1.5, 1.7),
                new TeamMember("Toma",  0.5, 0.2, 1, 1),
                new TeamMember("Olga",  20, 1, 1.5, 1.5)};

        Team team = new Team("Победа", teamMembers);
        Course course1 = new Course(15, 10, 1.5, 1.7);
        System.out.println("Название команды: " + team.getName());
        team.passCourse(course1);
        team.printPassingInfo();
        team.printMembersInfo();
    }

}
