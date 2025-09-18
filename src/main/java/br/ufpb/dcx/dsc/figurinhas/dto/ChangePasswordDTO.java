package br.ufpb.dcx.dsc.figurinhas.dto;

public class ChangePasswordDTO {

    private String username;
    private String newPassword;

    public ChangePasswordDTO(String username, String newPassword) {
        this.username = username;
        this.newPassword = newPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
