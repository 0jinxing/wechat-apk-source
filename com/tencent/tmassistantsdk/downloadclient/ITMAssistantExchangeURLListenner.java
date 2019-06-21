package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import java.util.ArrayList;

public abstract interface ITMAssistantExchangeURLListenner
{
  public abstract void onExchangedURLSucceed(ArrayList<AppSimpleDetail> paramArrayList, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner
 * JD-Core Version:    0.6.2
 */