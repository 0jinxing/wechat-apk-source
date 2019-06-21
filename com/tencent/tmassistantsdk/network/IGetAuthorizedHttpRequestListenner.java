package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;

public abstract interface IGetAuthorizedHttpRequestListenner
{
  public abstract void onGetAuthorizedRequestFinished(AuthorizedResult paramAuthorizedResult, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner
 * JD-Core Version:    0.6.2
 */