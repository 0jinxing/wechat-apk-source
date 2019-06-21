package com.tencent.tmassistantsdk.downloadclient;

public abstract interface IAssistantOnActionListener
{
  public abstract void onActionResult(byte[] paramArrayOfByte);

  public abstract void onDownloadSDKServiceInvalid();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener
 * JD-Core Version:    0.6.2
 */