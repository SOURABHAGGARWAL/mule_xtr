package org.mule.transformers;
import java.util.ArrayList;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
 
public class ComponentForEach implements Callable{
@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
 
        eventContext.getMessage().setInvocationProperty("myProperty", "Hello World!");
        List<String> data = new ArrayList<String>();
        data.add("s1"); data.add("s2"); data.add("s3"); data.add("s4");
        data.add("s5"); data.add("s6"); data.add("s7"); data.add("s9");
		eventContext.getMessage().setPayload(data);
        return eventContext.getMessage().getPayload();
    }
}