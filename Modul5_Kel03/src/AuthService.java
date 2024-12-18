public class AuthService {
    private String[][] data = new String[2][3];
    private String username, password, roles = "";
    public AuthService(String username, String password) {
        this.username = username;
        this.password = password;
        String[][] data = {
                {"nama1kelompok??", "12345", "mahasiswa"},
                {"nama2kelompok??", "12345", "dosen"},
        };
        this.data = data;
    }
    private boolean check_password(){
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(username) && data[i][1].equals(password)) {
                roles = data[i][2];
                return true;
            }
        }
        return false;
    }
    public void login(){
        boolean status = check_password();
        if (status) {
            System.out.println("\nWelcome " + username);
            System.out.println("Logged in as: " + roles);
        } else {
            System.out.println("\nInvalid Login ");
        }
    }
}