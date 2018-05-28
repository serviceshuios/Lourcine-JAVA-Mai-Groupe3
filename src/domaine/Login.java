package domaine;

public class Login {

		private int Id;
		private String pseudo;
		private String password;
		
		public Login(int id, String pseudo, String password) {
			super();
			Id = id;
			this.pseudo = pseudo;
			this.password = password;
		}

		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getPseudo() {
			return pseudo;
		}

		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
