package Players;

public class Amateur extends Player{
    private int id;
    private String team;
    private String sponser;

    public Amateur(int id, String team, String sponser) {
        super(id, team, sponser);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSponser() {
        return sponser;
    }

    public void setSponser(String sponser) {
        this.sponser = sponser;
    }
}
