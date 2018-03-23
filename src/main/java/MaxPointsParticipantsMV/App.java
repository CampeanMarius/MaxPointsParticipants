package MaxPointsParticipantsMV;

import MaxPointsParticipantsMV.controller.MemberController;
import MaxPointsParticipantsMV.repository.MemberRepository;
import MaxPointsParticipantsMV.ui.MemberUI;

;

public class App {
	public static void main(String[] args) {
		
			MemberRepository repo = new MemberRepository();
		
			MemberController ctrl = new MemberController(repo);
		
			MemberUI console = new MemberUI(ctrl);
			console.Run();
		
	}
}
