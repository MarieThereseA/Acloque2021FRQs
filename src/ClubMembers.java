import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
        for (int i = 0; i < names.length; i++){
            MemberInfo member = new MemberInfo(names[i],gradYear, true);
            memberList.add(member);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduates = new ArrayList<>();
        for (int i = 0; i < memberList.size(); i++){
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year){
                memberList.remove(i);
                i--;
                if (member.inGoodStanding()){
                    graduates.add(member);
                }
            }
        }
        return graduates;
    }
}