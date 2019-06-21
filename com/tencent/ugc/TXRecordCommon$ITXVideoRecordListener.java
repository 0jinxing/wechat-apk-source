package com.tencent.ugc;

import android.os.Bundle;

public abstract interface TXRecordCommon$ITXVideoRecordListener
{
  public abstract void onRecordComplete(TXRecordCommon.TXRecordResult paramTXRecordResult);

  public abstract void onRecordEvent(int paramInt, Bundle paramBundle);

  public abstract void onRecordProgress(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener
 * JD-Core Version:    0.6.2
 */