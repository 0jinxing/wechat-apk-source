package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequestBatch;

abstract interface LikeActionController$RequestWrapper
{
  public abstract void addToBatch(GraphRequestBatch paramGraphRequestBatch);

  public abstract FacebookRequestError getError();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.RequestWrapper
 * JD-Core Version:    0.6.2
 */