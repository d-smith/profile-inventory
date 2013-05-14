/*
 *    Copyright (c) 2011 XTRAC LLC. All Rights Reserved.
 *
 *    This software and all information contained herein is the property of
 *    XTRAC LLC.  Any dissemination, disclosure, use, or reproduction of this
 *    material for any reason inconsistent with express purpose for which it
 *    has been disclosed is strictly forbidden.
 */
package sample.profile.rs;

import sample.reader.ComponentState;
import sample.reader.ProfileReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/profile-inventory-svc/")
public class ProfileInventorySvc {
    private ProfileReader profileReader;

    public void setProfileReader(ProfileReader profileReader) {
        this.profileReader = profileReader;
    }


    @GET
    @Path("/inventory/{profile}/{version}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ComponentState> getInventory(@PathParam("profile") String profile, @PathParam("version") String version) {
        return profileReader.getBundles(profile,version);
    }
}
