package backend.truetrip.dtos;


import backend.truetrip.entities.Users;

public class FriendDTO {
    private int id;
    private Users user1;
    private Users user2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser1() {
        return user1;
    }

    public void setUser1(Users user1) {
        this.user1 = user1;
    }

    public Users getUser2() {
        return user2;
    }

    public void setUser2(Users user2) {
        this.user2 = user2;
    }
}
