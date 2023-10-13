package Control;

public class Member {
	public void addMember(String nic, String name, String tel, String email, String username, String pass) {
		Model.Member m = new Model.Member();
		m.addMembers(nic, name, tel, email, username, pass);
	}
}
