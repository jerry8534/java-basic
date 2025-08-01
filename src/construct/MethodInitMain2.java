package construct;

import java.lang.reflect.Member;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 17, 90);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name : " + member.name + " age :  " + member.age + " grade : " + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
