package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

public final class zzch
  implements DataApi.DeleteDataItemsResult
{
  private final int zzdh;
  private final Status zzp;

  public zzch(Status paramStatus, int paramInt)
  {
    this.zzp = paramStatus;
    this.zzdh = paramInt;
  }

  public final int getNumDeleted()
  {
    return this.zzdh;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzch
 * JD-Core Version:    0.6.2
 */