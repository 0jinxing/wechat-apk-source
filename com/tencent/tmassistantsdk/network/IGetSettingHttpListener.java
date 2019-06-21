package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse;

public abstract interface IGetSettingHttpListener
{
  public abstract void onSettingHttpRequestFinish(GetSettingsRequest paramGetSettingsRequest, GetSettingsResponse paramGetSettingsResponse, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.network.IGetSettingHttpListener
 * JD-Core Version:    0.6.2
 */