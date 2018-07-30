package top.imissqin.domain;


import java.io.Serializable;

public class User implements Serializable {

    private int user_id;
    private String user_no;
    private String user_password;
    private String user_phone;
    private int user_uid;
    /*private int user_role;
    private int status;*/

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    /*public int getUser_role() {
        return user_role;
    }

    public void setUser_role(int user_role) {
        this.user_role = user_role;
    }*/

    public int getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(int user_uid) {
        this.user_uid = user_uid;
    }

  /*  public User(int user_role) {
        this.user_role = user_role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_no='" + user_no + '\'' +
                ", user_password='" + user_password + '\'' +
                ", phone='" + user_phone + '\'' +
                ", user_uid=" + user_uid +
                ", user_role=" + user_role +
                ", status=" + status +
                '}';
    }*/
}
