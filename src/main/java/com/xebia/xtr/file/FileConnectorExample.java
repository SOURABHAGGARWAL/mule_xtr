package com.xebia.xtr.file;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class FileConnectorExample extends AbstractMessageTransformer {

    public synchronized Object transformMessage(MuleMessage muleMessage, String s) throws TransformerException {

        Object payload = muleMessage.getPayload();
        try {
        	System.out.println("======================================" + payload);
        	System.out.println("======================================" + s);
            return payload;
        } catch (Exception e) {
        	throw new TransformerException(this,e);
        }
    }
}
