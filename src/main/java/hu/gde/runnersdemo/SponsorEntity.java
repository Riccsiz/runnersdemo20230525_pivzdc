package hu.gde.runnersdemo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sponsorId;
    private String sponsorName;

    //@OneToMany(mappedBy = "sponsor", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<RunnerEntity> runners = new ArrayList<>();

    public SponsorEntity() {
    }

    public long getSponsorId() {return sponsorId; }

    public String getSponsorName() {return sponsorName; }

    public void setSponsorId(long sponsorId) {this.sponsorId = sponsorId; }

    public void setSponsorName(String sponsorName) {this.sponsorName = sponsorName; }

    //public List<RunnerEntity> getSponsors() {
    //    return runners;
    //}
}
