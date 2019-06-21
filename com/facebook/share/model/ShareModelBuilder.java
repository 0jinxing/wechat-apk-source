package com.facebook.share.model;

import com.facebook.share.ShareBuilder;

public abstract interface ShareModelBuilder<P extends ShareModel, E extends ShareModelBuilder> extends ShareBuilder<P, E>
{
  public abstract E readFrom(P paramP);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareModelBuilder
 * JD-Core Version:    0.6.2
 */