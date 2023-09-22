package sergey.goit.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "participant_ID")
    private ParticipantOsbb participantOsbb;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleParticipant roleParticipant;

    public enum RoleParticipant{
        PARTICIPANT,
        WORKER,
        MANAGEMENT_MEMBER,
        PRESIDENT
    }
}