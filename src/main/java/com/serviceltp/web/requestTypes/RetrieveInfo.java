package com.serviceltp.web.requestTypes;
import com.serviceltp.web.baseComponents.baseRequest.OptionalInputs;
import com.serviceltp.web.baseComponents.baseRequest.Request;
import java.net.URI;

public class RetrieveInfo extends Request {
    private URI Profile;
    private Status Status;

    public RetrieveInfo(com.serviceltp.web.baseComponents.baseRequest.OptionalInputs opt, String id, URI profile, com.serviceltp.web.requestTypes.Status status) throws Exception {
        super(opt, id);
        Profile = profile;
        if(status==null)
        {
            Status= new Status("active");
        }
        else
            Status = status;
    }
}
