package api.model.workspace;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class workspaceResponse {
    private String id;
    private String name;
    private HourlyRate hourlyRate;
    private List<Membership> membershipList;
    private WorkspaceSettings workspaceSettings;
    private String imageURL;
    private String featureSubscriptionType;
}
