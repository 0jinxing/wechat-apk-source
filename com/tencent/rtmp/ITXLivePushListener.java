package com.tencent.rtmp;

import android.os.Bundle;

public abstract interface ITXLivePushListener
{
  public abstract void onNetStatus(Bundle paramBundle);

  public abstract void onPushEvent(int paramInt, Bundle paramBundle);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ITXLivePushListener
 * JD-Core Version:    0.6.2
 */