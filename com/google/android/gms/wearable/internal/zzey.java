package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public final class zzey
  implements MessageApi.SendMessageResult
{
  private final int zzeh;
  private final Status zzp;

  public zzey(Status paramStatus, int paramInt)
  {
    this.zzp = paramStatus;
    this.zzeh = paramInt;
  }

  public final int getRequestId()
  {
    return this.zzeh;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzey
 * JD-Core Version:    0.6.2
 */