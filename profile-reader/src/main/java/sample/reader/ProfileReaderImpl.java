/*
 *    Copyright (c) 2011 XTRAC LLC. All Rights Reserved.
 *
 *    This software and all information contained herein is the property of
 *    XTRAC LLC.  Any dissemination, disclosure, use, or reproduction of this
 *    material for any reason inconsistent with express purpose for which it
 *    has been disclosed is strictly forbidden.
 */
package sample.reader;

import java.util.ArrayList;
import java.util.List;

public class ProfileReaderImpl implements ProfileReader {
    @Override
    public List<ComponentState> getBundles(String name, String version) {
        List<ComponentState> state = new ArrayList<ComponentState>();
        state.add(new ComponentState("bundle", "active", "foo"));
        return state;
    }
}
