package modele.dao.requete;

public class Login {
	private final static String LOGIN = "plm4280a";
	private final static String MDP = "$iutinfo";
	private final static String URL = "jdbc:oracle:thin:@telline.univ-tlse3.fr:1521/ETUPRE";
	
	public static String getLogin() {
		return LOGIN;
	}
	
	public static String getMdp() {
		return MDP;
	}
	
	public static String getUrl() {
		return URL;
	}
}
